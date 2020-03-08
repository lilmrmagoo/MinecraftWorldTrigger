
package net.mcreator.world_trigger_craft;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.ActionResult;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemPropertyGetter;
import net.minecraft.item.EnumAction;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.state.IBlockState;

import javax.annotation.Nullable;

import com.google.common.collect.Multimap;

@Elementsworld_trigger_craft.ModElement.Tag
public class MCreatorRaygustTrigger extends Elementsworld_trigger_craft.ModElement {
	@GameRegistry.ObjectHolder("world_trigger_craft:raygusttrigger")
	public static final Item block = null;
	public MCreatorRaygustTrigger(Elementsworld_trigger_craft instance) {
		super(instance, 38);
	}

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(this);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("world_trigger_craft:raygusttrigger", "inventory"));
	}

	@SubscribeEvent
	public void onEntityAttacked(LivingAttackEvent event) {
		Entity entity = event != null ? event.getEntity() : null;
		float damage = event.getAmount();
		int damageInt = (int) damage;
		if (entity != null && entity instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) entity;
			ItemStack activeItem = player.getActiveItemStack();
			if (player.isActiveItemStackBlocking() == true
					&& ((activeItem).getItem() == new ItemStack(MCreatorRaygustTrigger.block, (int) (1)).getItem())) {
				activeItem.damageItem(damageInt, player);
			}
		}
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			setMaxDamage(70);
			maxStackSize = 1;
			setUnlocalizedName("raygusttrigger");
			setRegistryName("raygusttrigger");
			setCreativeTab(null);
			this.addPropertyOverride(new ResourceLocation("blocking"), new IItemPropertyGetter() {
				@SideOnly(Side.CLIENT)
				public float apply(ItemStack stack, @Nullable World worldIn, @Nullable EntityLivingBase entityIn) {
					return entityIn != null && entityIn.isHandActive() && entityIn.getActiveItemStack() == stack ? 1.0F : 0.0F;
				}
			});
		}

		public EnumAction getItemUseAction(ItemStack stack) {
			return EnumAction.BLOCK;
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getMaxItemUseDuration(ItemStack itemstack) {
			return 72000;
		}

		public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
			ItemStack itemstack = playerIn.getHeldItem(handIn);
			playerIn.setActiveHand(handIn);
			return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, IBlockState par2Block) {
			return 1F;
		}

		@Override
		public Multimap<String, AttributeModifier> getItemAttributeModifiers(EntityEquipmentSlot slot) {
			Multimap<String, AttributeModifier> multimap = super.getItemAttributeModifiers(slot);
			if (slot == EntityEquipmentSlot.MAINHAND) {
				multimap.put(SharedMonsterAttributes.ATTACK_DAMAGE.getName(),
						new AttributeModifier(ATTACK_DAMAGE_MODIFIER, "Item modifier", (double) 5, 0));
				multimap.put(SharedMonsterAttributes.ATTACK_SPEED.getName(), new AttributeModifier(ATTACK_SPEED_MODIFIER, "Item modifier", -2.4, 0));
			}
			return multimap;
		}

		@Override
		public void onUpdate(ItemStack itemstack, World world, Entity entity, int slot, boolean par5) {
			super.onUpdate(itemstack, world, entity, slot, par5);
			int x = (int) entity.posX;
			int y = (int) entity.posY;
			int z = (int) entity.posZ;
			if (entity instanceof EntityLivingBase && ((EntityLivingBase) entity).getHeldItemMainhand().equals(itemstack)) {
				java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("itemstack", itemstack);
				MCreatorTriggerBreak.executeProcedure($_dependencies);
			}
		}
	}
}

package net.mcreator.world_trigger_craft;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.Container;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.Entity;

import java.util.function.Supplier;
import java.util.Map;

@Elementsworld_trigger_craft.ModElement.Tag
public class MCreatorSubTriggerCraftingAssemble extends Elementsworld_trigger_craft.ModElement {
	public MCreatorSubTriggerCraftingAssemble(Elementsworld_trigger_craft instance) {
		super(instance, 15);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorSubTriggerCraftingAssemble!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((new Object() {
			public ItemStack getItemStack(int sltid) {
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							return ((Slot) ((Map) invobj).get(sltid)).getStack();
						}
					}
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (3))).getItem() == new ItemStack(MCreatorTriggerChipRaycast.block, (int) (1)).getItem())) {
			{
				ItemStack _stack = (new Object() {
					public ItemStack getItemStack(int sltid) {
						if (entity instanceof EntityPlayerMP) {
							Container _current = ((EntityPlayerMP) entity).openContainer;
							if (_current instanceof Supplier) {
								Object invobj = ((Supplier) _current).get();
								if (invobj instanceof Map) {
									return ((Slot) ((Map) invobj).get(sltid)).getStack();
								}
							}
						}
						return ItemStack.EMPTY;
					}
				}.getItemStack((int) (0)));
				if (!_stack.hasTagCompound())
					_stack.setTagCompound(new NBTTagCompound());
				_stack.getTagCompound().setDouble("subtriggerShape", 1);
			}
		}
	}
}

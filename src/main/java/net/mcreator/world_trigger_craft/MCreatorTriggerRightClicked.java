package net.mcreator.world_trigger_craft;

import net.minecraft.world.World;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.BlockPos;
import net.minecraft.server.MinecraftServer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
import net.minecraft.command.ICommandSender;

@Elementsworld_trigger_craft.ModElement.Tag
public class MCreatorTriggerRightClicked extends Elementsworld_trigger_craft.ModElement {
	public MCreatorTriggerRightClicked(Elementsworld_trigger_craft instance) {
		super(instance, 12);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorTriggerRightClicked!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MCreatorTriggerRightClicked!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MCreatorTriggerRightClicked!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MCreatorTriggerRightClicked!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			System.err.println("Failed to load dependency itemstack for procedure MCreatorTriggerRightClicked!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MCreatorTriggerRightClicked!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		World world = (World) dependencies.get("world");
		double triggershape = 0;
		double subtriggershape = 0;
		double optTrigger1 = 0;
		double optTrigger2 = 0;
		double optTrigger3 = 0;
		double optTrigger4 = 0;
		double optTrigger5 = 0;
		double optTrigger6 = 0;
		double optTrigger7 = 0;
		triggershape = (double) ((itemstack).hasTagCompound() ? (itemstack).getTagCompound().getDouble("triggerShape") : -1);
		subtriggershape = (double) ((itemstack).hasTagCompound() ? (itemstack).getTagCompound().getDouble("subtriggerShape") : -1);
		optTrigger1 = (double) ((itemstack).hasTagCompound() ? (itemstack).getTagCompound().getDouble("optTrigger1") : -1);
		optTrigger2 = (double) ((itemstack).hasTagCompound() ? (itemstack).getTagCompound().getDouble("optTrigger2") : -1);
		optTrigger3 = (double) ((itemstack).hasTagCompound() ? (itemstack).getTagCompound().getDouble("optTrigger3") : -1);
		optTrigger4 = (double) ((itemstack).hasTagCompound() ? (itemstack).getTagCompound().getDouble("optTrigger4") : -1);
		optTrigger5 = (double) ((itemstack).hasTagCompound() ? (itemstack).getTagCompound().getDouble("optTrigger5") : -1);
		optTrigger6 = (double) ((itemstack).hasTagCompound() ? (itemstack).getTagCompound().getDouble("optTrigger6") : -1);
		optTrigger7 = (double) ((itemstack).hasTagCompound() ? (itemstack).getTagCompound().getDouble("optTrigger7") : -1);
		if (((((itemstack).hasTagCompound() ? (itemstack).getTagCompound().getDouble("triggerShape") : -1) == 1)
				&& (((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getItem() == (itemstack).getItem()))) {
			if (!world.isRemote && world.getMinecraftServer() != null) {
				world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
					@Override
					public String getName() {
						return "";
					}

					@Override
					public boolean canUseCommand(int permission, String command) {
						return true;
					}

					@Override
					public World getEntityWorld() {
						return world;
					}

					@Override
					public MinecraftServer getServer() {
						return world.getMinecraftServer();
					}

					@Override
					public boolean sendCommandFeedback() {
						return false;
					}

					@Override
					public BlockPos getPosition() {
						return new BlockPos((int) x, (int) y, (int) z);
					}

					@Override
					public Vec3d getPositionVector() {
						return new Vec3d(x, y, z);
					}
				}, "/replaceitem entity @p slot.weapon.mainhand minecraft:air 1 0");
			}
			{
				java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("itemstack", itemstack);
				$_dependencies.put("world", world);
				MCreatorSubTriggerSummon.executeProcedure($_dependencies);
			}
		}
		{
			ItemStack _stack = ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY);
			if (!_stack.hasTagCompound())
				_stack.setTagCompound(new NBTTagCompound());
			_stack.getTagCompound().setDouble("triggerShape", (triggershape));
		}
		{
			ItemStack _stack = ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY);
			if (!_stack.hasTagCompound())
				_stack.setTagCompound(new NBTTagCompound());
			_stack.getTagCompound().setDouble("subtriggerShape", (subtriggershape));
		}
		{
			ItemStack _stack = ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY);
			if (!_stack.hasTagCompound())
				_stack.setTagCompound(new NBTTagCompound());
			_stack.getTagCompound().setDouble("optTrigger1", (optTrigger1));
		}
		{
			ItemStack _stack = ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY);
			if (!_stack.hasTagCompound())
				_stack.setTagCompound(new NBTTagCompound());
			_stack.getTagCompound().setDouble("optTrigger2", (optTrigger2));
		}
		{
			ItemStack _stack = ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY);
			if (!_stack.hasTagCompound())
				_stack.setTagCompound(new NBTTagCompound());
			_stack.getTagCompound().setDouble("optTrigger3", (optTrigger3));
		}
		{
			ItemStack _stack = ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY);
			if (!_stack.hasTagCompound())
				_stack.setTagCompound(new NBTTagCompound());
			_stack.getTagCompound().setDouble("optTrigger4", (optTrigger4));
		}
		{
			ItemStack _stack = ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY);
			if (!_stack.hasTagCompound())
				_stack.setTagCompound(new NBTTagCompound());
			_stack.getTagCompound().setDouble("optTrigger5", (optTrigger5));
		}
		{
			ItemStack _stack = ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY);
			if (!_stack.hasTagCompound())
				_stack.setTagCompound(new NBTTagCompound());
			_stack.getTagCompound().setDouble("optTrigger6", (optTrigger6));
		}
		{
			ItemStack _stack = ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY);
			if (!_stack.hasTagCompound())
				_stack.setTagCompound(new NBTTagCompound());
			_stack.getTagCompound().setDouble("optTrigger7", (optTrigger7));
		}
	}
}

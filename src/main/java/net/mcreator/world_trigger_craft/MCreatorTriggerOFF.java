package net.mcreator.world_trigger_craft;

import net.minecraftforge.oredict.OreDictionary;

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
public class MCreatorTriggerOFF extends Elementsworld_trigger_craft.ModElement {
	public MCreatorTriggerOFF(Elementsworld_trigger_craft instance) {
		super(instance, 18);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorTriggerOFF!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MCreatorTriggerOFF!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MCreatorTriggerOFF!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MCreatorTriggerOFF!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MCreatorTriggerOFF!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
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
		triggershape = (double) (((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.hasTagCompound()
						? ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
								.getTagCompound().getDouble("triggerShape")
						: -1);
		subtriggershape = (double) (((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.hasTagCompound()
						? ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
								.getTagCompound().getDouble("subtriggerShape")
						: -1);
		optTrigger1 = (double) (((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.hasTagCompound()
						? ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
								.getTagCompound().getDouble("optTrigger1")
						: -1);
		optTrigger2 = (double) (((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.hasTagCompound()
						? ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
								.getTagCompound().getDouble("optTrigger2")
						: -1);
		optTrigger3 = (double) (((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.hasTagCompound()
						? ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
								.getTagCompound().getDouble("optTrigger3")
						: -1);
		optTrigger4 = (double) (((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.hasTagCompound()
						? ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
								.getTagCompound().getDouble("optTrigger4")
						: -1);
		optTrigger5 = (double) (((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.hasTagCompound()
						? ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
								.getTagCompound().getDouble("optTrigger5")
						: -1);
		optTrigger6 = (double) (((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.hasTagCompound()
						? ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
								.getTagCompound().getDouble("optTrigger6")
						: -1);
		optTrigger7 = (double) (((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.hasTagCompound()
						? ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
								.getTagCompound().getDouble("optTrigger7")
						: -1);
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
			}, "replaceitem entity @p slot.weapon.mainhand world_trigger_craft:trigger 1 0");
		}
		entity.getEntityData().setBoolean("trionBody", (false));
		if ((OreDictionary.containsMatch(false, OreDictionary.getOres("worldtrigger"),
				((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemOffhand() : ItemStack.EMPTY)))) {
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
				}, "replaceitem entity @p slot.weapon.offhand minecraft:air 1 0");
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

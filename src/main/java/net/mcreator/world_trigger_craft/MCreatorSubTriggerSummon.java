package net.mcreator.world_trigger_craft;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.World;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.BlockPos;
import net.minecraft.server.MinecraftServer;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
import net.minecraft.command.ICommandSender;

@Elementsworld_trigger_craft.ModElement.Tag
public class MCreatorSubTriggerSummon extends Elementsworld_trigger_craft.ModElement {
	public MCreatorSubTriggerSummon(Elementsworld_trigger_craft instance) {
		super(instance, 12);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorSubTriggerSummon!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MCreatorSubTriggerSummon!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MCreatorSubTriggerSummon!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MCreatorSubTriggerSummon!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MCreatorSubTriggerSummon!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY).hasTagCompound()
				? ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY).getTagCompound()
						.getDouble("subtriggerShape")
				: -1) == 1)) {
			if (entity instanceof EntityPlayer)
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity),
						(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemOffhand() : ItemStack.EMPTY).copy()));
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
				}, "replaceitem entity @p slot.weapon.offhand world_trigger_craft:raygusttrigger 1 0");
			}
			entity.getEntityData().setDouble("trion", ((entity.getEntityData().getDouble("trion")) - 20));
		}
	}
}

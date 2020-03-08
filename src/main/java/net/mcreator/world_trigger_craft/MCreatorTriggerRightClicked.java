package net.mcreator.world_trigger_craft;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.FMLCommonHandler;

import net.minecraft.world.World;
import net.minecraft.util.text.TextComponentString;
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
		super(instance, 18);
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
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MCreatorTriggerRightClicked!");
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
		double triggercolor = 0;
		if (((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(MCreatorTrigger.block, (int) (1)).getItem())
				|| ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getItem() == new ItemStack(MCreatorGreenTrigger.block, (int) (1)).getItem())
						|| (((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
								.getItem() == new ItemStack(MCreatorRedTrigger.block, (int) (1)).getItem())))) {
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
			triggercolor = (double) (((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.hasTagCompound()
							? ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
									.getTagCompound().getDouble("triggercolor")
							: -1);
			if ((((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY).hasTagCompound()
					? ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY).getTagCompound()
							.getDouble("triggerShape")
					: -1) == 1) && ((entity.getEntityData().getDouble("trion")) >= 21))) {
				entity.getEntityData().setBoolean("trionBody", (true));
				if ((world_trigger_craftVariables.WorldVariables.get(world).TriggerONAnnouncement)) {
					{
						MinecraftServer mcserv = FMLCommonHandler.instance().getMinecraftServerInstance();
						if (mcserv != null)
							mcserv.getPlayerList().sendMessage(
									new TextComponentString((("<") + "" + ((entity.getDisplayName().getFormattedText())) + "" + ("> Trigger ON!"))));
					}
				}
				{
					java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
					$_dependencies.put("entity", entity);
					$_dependencies.put("x", x);
					$_dependencies.put("y", y);
					$_dependencies.put("z", z);
					$_dependencies.put("world", world);
					MCreatorSubTriggerSummon.executeProcedure($_dependencies);
				}
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
					}, "replaceitem entity @p slot.weapon.mainhand world_trigger_craft:raygusttrigger 1 0");
				}
				entity.getEntityData().setDouble("trion", ((entity.getEntityData().getDouble("trion")) - 20));
			} else if ((((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.hasTagCompound()
							? ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
									.getTagCompound().getDouble("triggerShape")
							: -1) == 2)
					&& ((entity.getEntityData().getDouble("trion")) >= 16))) {
				entity.getEntityData().setBoolean("trionBody", (true));
				if ((world_trigger_craftVariables.WorldVariables.get(world).TriggerONAnnouncement)) {
					{
						MinecraftServer mcserv = FMLCommonHandler.instance().getMinecraftServerInstance();
						if (mcserv != null)
							mcserv.getPlayerList().sendMessage(
									new TextComponentString((("<") + "" + ((entity.getDisplayName().getFormattedText())) + "" + ("> Trigger ON!"))));
					}
				}
				{
					java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
					$_dependencies.put("entity", entity);
					$_dependencies.put("x", x);
					$_dependencies.put("y", y);
					$_dependencies.put("z", z);
					$_dependencies.put("world", world);
					MCreatorSubTriggerSummon.executeProcedure($_dependencies);
				}
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
					}, "replaceitem entity @p slot.weapon.mainhand world_trigger_craft:kogetsutrigger 1 0");
				}
				entity.getEntityData().setDouble("trion", ((entity.getEntityData().getDouble("trion")) - 15));
			} else if ((((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.hasTagCompound()
							? ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
									.getTagCompound().getDouble("triggerShape")
							: -1) == 3)
					&& ((entity.getEntityData().getDouble("trion")) >= 11))) {
				entity.getEntityData().setBoolean("trionBody", (true));
				if ((world_trigger_craftVariables.WorldVariables.get(world).TriggerONAnnouncement)) {
					{
						MinecraftServer mcserv = FMLCommonHandler.instance().getMinecraftServerInstance();
						if (mcserv != null)
							mcserv.getPlayerList().sendMessage(
									new TextComponentString((("<") + "" + ((entity.getDisplayName().getFormattedText())) + "" + ("> Trigger ON!"))));
					}
				}
				{
					java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
					$_dependencies.put("entity", entity);
					$_dependencies.put("x", x);
					$_dependencies.put("y", y);
					$_dependencies.put("z", z);
					$_dependencies.put("world", world);
					MCreatorSubTriggerSummon.executeProcedure($_dependencies);
				}
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
					}, "replaceitem entity @p slot.weapon.mainhand world_trigger_craft:scorpionkazamatrigger 1 0");
				}
				entity.getEntityData().setDouble("trion", ((entity.getEntityData().getDouble("trion")) - 10));
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
			{
				ItemStack _stack = ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY);
				if (!_stack.hasTagCompound())
					_stack.setTagCompound(new NBTTagCompound());
				_stack.getTagCompound().setDouble("triggercolor", (triggercolor));
			}
		} else if ((OreDictionary.containsMatch(false, OreDictionary.getOres("worldtriggertag"),
				((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)))) {
			{
				java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				MCreatorTriggerOFF.executeProcedure($_dependencies);
			}
		}
	}
}

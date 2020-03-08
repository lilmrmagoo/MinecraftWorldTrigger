package net.mcreator.world_trigger_craft;

import net.minecraft.world.World;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import java.util.HashMap;

@Elementsworld_trigger_craft.ModElement.Tag
public class MCreatorTriggercommandCommandExecuted extends Elementsworld_trigger_craft.ModElement {
	public MCreatorTriggercommandCommandExecuted(Elementsworld_trigger_craft instance) {
		super(instance, 51);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorTriggercommandCommandExecuted!");
			return;
		}
		if (dependencies.get("cmdparams") == null) {
			System.err.println("Failed to load dependency cmdparams for procedure MCreatorTriggercommandCommandExecuted!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MCreatorTriggercommandCommandExecuted!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		HashMap cmdparams = (HashMap) dependencies.get("cmdparams");
		World world = (World) dependencies.get("world");
		if ((((new Object() {
			public String getText() {
				String param = (String) cmdparams.get("0");
				if (param != null) {
					return param;
				}
				return "";
			}
		}.getText())).equals("true"))) {
			world_trigger_craftVariables.WorldVariables.get(world).TriggerONAnnouncement = (boolean) (true);
			world_trigger_craftVariables.WorldVariables.get(world).syncData(world);
		} else if ((((new Object() {
			public String getText() {
				String param = (String) cmdparams.get("0");
				if (param != null) {
					return param;
				}
				return "";
			}
		}.getText())).equals("false"))) {
			world_trigger_craftVariables.WorldVariables.get(world).TriggerONAnnouncement = (boolean) (false);
			world_trigger_craftVariables.WorldVariables.get(world).syncData(world);
		} else {
			if (entity instanceof EntityPlayer && !world.isRemote) {
				((EntityPlayer) entity).sendStatusMessage(new TextComponentString((((new Object() {
					public String getText() {
						String param = (String) cmdparams.get("0");
						if (param != null) {
							return param;
						}
						return "";
					}
				}.getText())) + "" + ("is an invalid option please use either true or false"))), (false));
			}
		}
	}
}

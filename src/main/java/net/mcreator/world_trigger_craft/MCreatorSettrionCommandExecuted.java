package net.mcreator.world_trigger_craft;

import net.minecraft.entity.Entity;

import java.util.HashMap;

@Elementsworld_trigger_craft.ModElement.Tag
public class MCreatorSettrionCommandExecuted extends Elementsworld_trigger_craft.ModElement {
	public MCreatorSettrionCommandExecuted(Elementsworld_trigger_craft instance) {
		super(instance, 27);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorSettrionCommandExecuted!");
			return;
		}
		if (dependencies.get("cmdparams") == null) {
			System.err.println("Failed to load dependency cmdparams for procedure MCreatorSettrionCommandExecuted!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		HashMap cmdparams = (HashMap) dependencies.get("cmdparams");
		entity.getEntityData().setDouble("trion", new Object() {
			int convert(String s) {
				try {
					return Integer.parseInt(s.trim());
				} catch (Exception e) {
				}
				return 0;
			}
		}.convert((new Object() {
			public String getText() {
				String param = (String) cmdparams.get("0");
				if (param != null) {
					return param;
				}
				return "";
			}
		}.getText())));
	}
}

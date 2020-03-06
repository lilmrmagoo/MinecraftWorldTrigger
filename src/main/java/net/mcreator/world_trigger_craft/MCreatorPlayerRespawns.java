package net.mcreator.world_trigger_craft;

import net.minecraft.entity.Entity;

@Elementsworld_trigger_craft.ModElement.Tag
public class MCreatorPlayerRespawns extends Elementsworld_trigger_craft.ModElement {
	public MCreatorPlayerRespawns(Elementsworld_trigger_craft instance) {
		super(instance, 25);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorPlayerRespawns!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MCreatorPlayerRespawns!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MCreatorPlayerRespawns!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MCreatorPlayerRespawns!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		{
			java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
			$_dependencies.put("entity", entity);
			$_dependencies.put("x", x);
			$_dependencies.put("y", y);
			$_dependencies.put("z", z);
			MCreatorPlayerSetspawn.executeProcedure($_dependencies);
		}
	}
}

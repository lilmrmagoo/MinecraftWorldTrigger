package net.mcreator.world_trigger_craft;

import net.minecraft.world.World;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

@Elementsworld_trigger_craft.ModElement.Tag
public class MCreatorBailout extends Elementsworld_trigger_craft.ModElement {
	public MCreatorBailout(Elementsworld_trigger_craft instance) {
		super(instance, 23);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorBailout!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MCreatorBailout!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MCreatorBailout!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MCreatorBailout!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MCreatorBailout!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (((entity.getEntityData().getDouble("trion")) <= 0)) {
			if ((entity.getEntityData().getBoolean("bailoutactive"))) {
				if (((entity.getEntityData().getDouble("playerspawny")) != 0)) {
					if (entity instanceof EntityLivingBase)
						((EntityLivingBase) entity).setPositionAndUpdate((entity.getEntityData().getDouble("playerspawnx")),
								(entity.getEntityData().getDouble("playerspawny")), (entity.getEntityData().getDouble("playerspawnz")));
				} else {
					if (entity instanceof EntityLivingBase)
						((EntityLivingBase) entity).setPositionAndUpdate((world.getSpawnPoint().getX()), (world.getSpawnPoint().getY()),
								(world.getSpawnPoint().getZ()));
				}
			}
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

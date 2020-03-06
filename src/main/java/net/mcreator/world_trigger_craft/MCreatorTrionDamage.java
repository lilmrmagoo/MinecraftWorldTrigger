package net.mcreator.world_trigger_craft;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

@Elementsworld_trigger_craft.ModElement.Tag
public class MCreatorTrionDamage extends Elementsworld_trigger_craft.ModElement {
	public MCreatorTrionDamage(Elementsworld_trigger_craft instance) {
		super(instance, 22);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorTrionDamage!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity.getEntityData().getBoolean("trionBody"))
				&& (((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHealth() : -1) < 20))) {
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).setHealth((float) 20);
			entity.getEntityData().setDouble("trion", ((entity.getEntityData().getDouble("trion")) - 10));
		}
	}
}

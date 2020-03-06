package net.mcreator.world_trigger_craft;

import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.entity.Entity;

@Elementsworld_trigger_craft.ModElement.Tag
public class MCreatorPlayerTick extends Elementsworld_trigger_craft.ModElement {
	public MCreatorPlayerTick(Elementsworld_trigger_craft instance) {
		super(instance, 21);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorPlayerTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity.getEntityData().getBoolean("trionBody")) == (false))) {
			entity.getEntityData().setDouble("trion", ((entity.getEntityData().getDouble("trion")) + 0.025));
		} else if (((entity.getEntityData().getBoolean("trionBody")) == (true))) {
			entity.getEntityData().setDouble("trion", ((entity.getEntityData().getDouble("trion")) + 0.003));
		}
	}

	@SubscribeEvent
	public void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			Entity entity = event.player;
			World world = entity.world;
			int i = (int) entity.posX;
			int j = (int) entity.posY;
			int k = (int) entity.posZ;
			java.util.HashMap<String, Object> dependencies = new java.util.HashMap<>();
			dependencies.put("x", i);
			dependencies.put("y", j);
			dependencies.put("z", k);
			dependencies.put("world", world);
			dependencies.put("entity", entity);
			dependencies.put("event", event);
			this.executeProcedure(dependencies);
		}
	}

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(this);
	}
}

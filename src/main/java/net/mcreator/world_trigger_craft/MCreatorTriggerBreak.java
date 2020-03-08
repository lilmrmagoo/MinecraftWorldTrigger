package net.mcreator.world_trigger_craft;

import net.minecraftforge.oredict.OreDictionary;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.Entity;

@Elementsworld_trigger_craft.ModElement.Tag
public class MCreatorTriggerBreak extends Elementsworld_trigger_craft.ModElement {
	public MCreatorTriggerBreak(Elementsworld_trigger_craft instance) {
		super(instance, 56);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorTriggerBreak!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			System.err.println("Failed to load dependency itemstack for procedure MCreatorTriggerBreak!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		if (((itemstack.getItemDamage()) >= ((itemstack.getMaxDamage()) - 3))) {
			if (((itemstack).getItem() == new ItemStack(MCreatorKogetsuTrigger.block, (int) (1)).getItem())) {
				entity.getEntityData().setDouble("trion", ((entity.getEntityData().getDouble("trion")) - 15));
			} else if (((itemstack).getItem() == new ItemStack(MCreatorRaygustTrigger.block, (int) (1)).getItem())) {
				entity.getEntityData().setDouble("trion", ((entity.getEntityData().getDouble("trion")) - 20));
			} else if ((OreDictionary.containsMatch(false, OreDictionary.getOres("formchangabletrigger"), (itemstack)))) {
				entity.getEntityData().setDouble("trion", ((entity.getEntityData().getDouble("trion")) - 10));
			}
			itemstack.setItemDamage((int) 0);
		}
	}
}

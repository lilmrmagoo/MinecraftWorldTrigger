
package net.mcreator.world_trigger_craft;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementsworld_trigger_craft.ModElement.Tag
public class MCreatorFormChangableTrigger extends Elementsworld_trigger_craft.ModElement {
	public MCreatorFormChangableTrigger(Elementsworld_trigger_craft instance) {
		super(instance, 54);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("formchangabletrigger", new ItemStack(MCreatorScorpionKazamaTrigger.block, (int) (1)));
	}
}

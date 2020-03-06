
package net.mcreator.world_trigger_craft;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementsworld_trigger_craft.ModElement.Tag
public class MCreatorWorldtriggerTag extends Elementsworld_trigger_craft.ModElement {
	public MCreatorWorldtriggerTag(Elementsworld_trigger_craft instance) {
		super(instance, 19);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("worldtriggertag", new ItemStack(MCreatorRaygustTrigger.block, (int) (1)));
	}
}

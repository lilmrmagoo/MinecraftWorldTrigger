
package net.mcreator.world_trigger_craft;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementsworld_trigger_craft.ModElement.Tag
public class MCreatorTriggercasetag extends Elementsworld_trigger_craft.ModElement {
	public MCreatorTriggercasetag(Elementsworld_trigger_craft instance) {
		super(instance, 47);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("triggercasetag", new ItemStack(MCreatorTriggercase.block, (int) (1)));
		OreDictionary.registerOre("triggercasetag", new ItemStack(MCreatorGreenTriggerCase.block, (int) (1)));
		OreDictionary.registerOre("triggercasetag", new ItemStack(MCreatorRedTriggerCase.block, (int) (1)));
	}
}

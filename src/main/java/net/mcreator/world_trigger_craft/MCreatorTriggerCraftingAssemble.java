package net.mcreator.world_trigger_craft;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.Container;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.Entity;

import java.util.function.Supplier;
import java.util.Map;

@Elementsworld_trigger_craft.ModElement.Tag
public class MCreatorTriggerCraftingAssemble extends Elementsworld_trigger_craft.ModElement {
	public MCreatorTriggerCraftingAssemble(Elementsworld_trigger_craft instance) {
		super(instance, 15);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorTriggerCraftingAssemble!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((((new Object() {
			public ItemStack getItemStack(int sltid) {
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							return ((Slot) ((Map) invobj).get(sltid)).getStack();
						}
					}
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (1))).getItem() == new ItemStack(MCreatorTriggercase.block, (int) (1)).getItem()) && ((new Object() {
			public ItemStack getItemStack(int sltid) {
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							return ((Slot) ((Map) invobj).get(sltid)).getStack();
						}
					}
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (10))).getItem() == new ItemStack(MCreatorTriggerCircuit.block, (int) (1)).getItem()))) {
			if (((new Object() {
				public ItemStack getItemStack(int sltid) {
					if (entity instanceof EntityPlayerMP) {
						Container _current = ((EntityPlayerMP) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (2))).getItem() == new ItemStack(MCreatorTriggerChipRaycast.block, (int) (1)).getItem())) {
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							((Slot) ((Map) invobj).get((int) (0))).putStack(new ItemStack(MCreatorTrigger.block, (int) (1)));
							_current.detectAndSendChanges();
						}
					}
				}
				{
					ItemStack _stack = (new Object() {
						public ItemStack getItemStack(int sltid) {
							if (entity instanceof EntityPlayerMP) {
								Container _current = ((EntityPlayerMP) entity).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										return ((Slot) ((Map) invobj).get(sltid)).getStack();
									}
								}
							}
							return ItemStack.EMPTY;
						}
					}.getItemStack((int) (0)));
					if (!_stack.hasTagCompound())
						_stack.setTagCompound(new NBTTagCompound());
					_stack.getTagCompound().setDouble("triggerShape", 1);
				}
				{
					java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
					$_dependencies.put("entity", entity);
					MCreatorSubTriggerCraftingAssemble.executeProcedure($_dependencies);
				}
				{
					java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
					MCreatorOptTriggerCraftingAssemble.executeProcedure($_dependencies);
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							((Slot) ((Map) invobj).get((int) (1))).decrStackSize((int) (1));
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							((Slot) ((Map) invobj).get((int) (2))).decrStackSize((int) (1));
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							((Slot) ((Map) invobj).get((int) (3))).decrStackSize((int) (1));
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							((Slot) ((Map) invobj).get((int) (4))).decrStackSize((int) (1));
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							((Slot) ((Map) invobj).get((int) (5))).decrStackSize((int) (1));
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							((Slot) ((Map) invobj).get((int) (6))).decrStackSize((int) (1));
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							((Slot) ((Map) invobj).get((int) (7))).decrStackSize((int) (1));
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							((Slot) ((Map) invobj).get((int) (8))).decrStackSize((int) (1));
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							((Slot) ((Map) invobj).get((int) (9))).decrStackSize((int) (1));
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							((Slot) ((Map) invobj).get((int) (10))).decrStackSize((int) (1));
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							((Slot) ((Map) invobj).get((int) (11))).decrStackSize((int) (1));
							_current.detectAndSendChanges();
						}
					}
				}
			}
		}
	}
}

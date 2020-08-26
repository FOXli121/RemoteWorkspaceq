
package net.mcreator.allgemsitems.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.allgemsitems.itemgroup.ShafiritemItemGroup;
import net.mcreator.allgemsitems.AllGemsItemsModElements;

@AllGemsItemsModElements.ModElement.Tag
public class ShafirShovelItem extends AllGemsItemsModElements.ModElement {
	@ObjectHolder("all_gems_items:shafir_shovel")
	public static final Item block = null;
	public ShafirShovelItem(AllGemsItemsModElements instance) {
		super(instance, 21);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 250;
			}

			public float getEfficiency() {
				return 6f;
			}

			public float getAttackDamage() {
				return 0f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 14;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, -3f, new Item.Properties().group(ShafiritemItemGroup.tab)) {
		}.setRegistryName("shafir_shovel"));
	}
}

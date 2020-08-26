
package net.mcreator.allgemsitems.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import net.mcreator.allgemsitems.itemgroup.ShafiritemItemGroup;
import net.mcreator.allgemsitems.AllGemsItemsModElements;

@AllGemsItemsModElements.ModElement.Tag
public class ShafirHoeItem extends AllGemsItemsModElements.ModElement {
	@ObjectHolder("all_gems_items:shafir_hoe")
	public static final Item block = null;
	public ShafirHoeItem(AllGemsItemsModElements instance) {
		super(instance, 22);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
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
		}, -3f, new Item.Properties().group(ShafiritemItemGroup.tab)) {
		}.setRegistryName("shafir_hoe"));
	}
}

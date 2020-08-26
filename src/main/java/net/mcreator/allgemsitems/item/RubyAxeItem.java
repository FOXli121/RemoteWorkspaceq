
package net.mcreator.allgemsitems.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.mcreator.allgemsitems.AllGemsItemsModElements;

@AllGemsItemsModElements.ModElement.Tag
public class RubyAxeItem extends AllGemsItemsModElements.ModElement {
	@ObjectHolder("all_gems_items:ruby_axe")
	public static final Item block = null;
	public RubyAxeItem(AllGemsItemsModElements instance) {
		super(instance, 7);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 2380;
			}

			public float getEfficiency() {
				return 17f;
			}

			public float getAttackDamage() {
				return 3f;
			}

			public int getHarvestLevel() {
				return 10;
			}

			public int getEnchantability() {
				return 6;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.MISC)) {
		}.setRegistryName("ruby_axe"));
	}
}

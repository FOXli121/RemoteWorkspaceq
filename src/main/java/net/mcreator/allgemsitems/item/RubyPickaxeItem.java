
package net.mcreator.allgemsitems.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.allgemsitems.itemgroup.RubyitemItemGroup;
import net.mcreator.allgemsitems.AllGemsItemsModElements;

@AllGemsItemsModElements.ModElement.Tag
public class RubyPickaxeItem extends AllGemsItemsModElements.ModElement {
	@ObjectHolder("all_gems_items:ruby_pickaxe")
	public static final Item block = null;
	public RubyPickaxeItem(AllGemsItemsModElements instance) {
		super(instance, 6);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 2380;
			}

			public float getEfficiency() {
				return 5f;
			}

			public float getAttackDamage() {
				return 2.7f;
			}

			public int getHarvestLevel() {
				return 21;
			}

			public int getEnchantability() {
				return 16;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, -3f, new Item.Properties().group(RubyitemItemGroup.tab)) {
		}.setRegistryName("ruby_pickaxe"));
	}
}

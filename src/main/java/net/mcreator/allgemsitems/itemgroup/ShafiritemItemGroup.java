
package net.mcreator.allgemsitems.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.allgemsitems.item.ShafirSwordItem;
import net.mcreator.allgemsitems.AllGemsItemsModElements;

@AllGemsItemsModElements.ModElement.Tag
public class ShafiritemItemGroup extends AllGemsItemsModElements.ModElement {
	public ShafiritemItemGroup(AllGemsItemsModElements instance) {
		super(instance, 34);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabshafiritem") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(ShafirSwordItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}

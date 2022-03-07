
package co.nickxwlm.minetts.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import co.nickxwlm.minetts.item.ItemWin10Tiley;
import co.nickxwlm.minetts.ElementsMinettsMod;

@ElementsMinettsMod.ModElement.Tag
public class TabTtsmodTab extends ElementsMinettsMod.ModElement {
	public TabTtsmodTab(ElementsMinettsMod instance) {
		super(instance, 8);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabttsmod_tab") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemWin10Tiley.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}

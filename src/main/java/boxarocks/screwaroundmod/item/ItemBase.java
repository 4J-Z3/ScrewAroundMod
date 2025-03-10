package boxarocks.screwaroundmod.item;

import boxarocks.screwaroundmod.ScrewAroundMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item {

	protected String name;
	
	public ItemBase(String name) {
		this.name = name;
		setUnlocalizedName(name);
		setTextureName(ScrewAroundMod.modid + ":" + getUnlocalizedName());
	}
	
	@Override
	public ItemBase setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}
	
}

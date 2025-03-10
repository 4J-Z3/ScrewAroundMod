package boxarocks.screwaroundmod.block;

import boxarocks.screwaroundmod.ScrewAroundMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block {

	protected String name;
	
	protected BlockBase(String name, Material material) {
		super(material);
		
		this.name = name;
		
		setBlockName(name);
		setBlockTextureName(ScrewAroundMod.modid + ":" + getUnlocalizedName());
	}
	
	@Override
	public BlockBase setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

}

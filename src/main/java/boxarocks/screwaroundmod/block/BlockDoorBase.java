package boxarocks.screwaroundmod.block;

import java.util.Random;

import boxarocks.screwaroundmod.ScrewAroundMod;
import boxarocks.screwaroundmod.item.ItemDoorBase;
import boxarocks.screwaroundmod.item.ItemRegister;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class BlockDoorBase extends BlockDoor {
	
	protected String name;
	protected Item itemDoor;
	
	protected BlockDoorBase(String name, Item item, Material material) {
		super(material);
		
		this.name = name;
		this.itemDoor = item;
		
		setBlockName(name);
		setBlockTextureName(ScrewAroundMod.modid + ":" + getUnlocalizedName());
	}
	
	public Item createItemDoor() {
		this.itemDoor = new ItemDoorBase(name + "Item", this, blockMaterial);
		return this.itemDoor;
	}
	
	@Override
	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_) {
		return (p_149650_1_ & 8) != 0 ? null : this.itemDoor;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public Item getItem(World world, int x, int y, int z) {
		return this.itemDoor;
	}
	
	@Override
	public BlockDoorBase setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

}

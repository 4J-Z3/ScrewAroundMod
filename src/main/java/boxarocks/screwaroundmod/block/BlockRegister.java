package boxarocks.screwaroundmod.block;

import boxarocks.screwaroundmod.item.ItemRegister;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockRegister {

	public static BlockBase testBlock = new BlockBase("testBlock", Material.rock).setCreativeTab(CreativeTabs.tabMaterials);
	
	public static BlockDoorBase testDoor = new BlockDoorBase("testDoor", ItemRegister.testDoorItem, Material.wood);
	
	public static void registerBlocks() {
		GameRegistry.registerBlock(testBlock, testBlock.getUnlocalizedName());
		GameRegistry.registerBlock(testDoor, testDoor.getUnlocalizedName());
	}
}

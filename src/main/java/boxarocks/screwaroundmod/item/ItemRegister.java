package boxarocks.screwaroundmod.item;

import boxarocks.screwaroundmod.block.BlockRegister;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemRegister {

	public static ItemBase testIngot = new ItemBase("testIngot").setCreativeTab(CreativeTabs.tabMaterials);
	
	public static Item testDoorItem = BlockRegister.testDoor.createItemDoor().setCreativeTab(CreativeTabs.tabMisc);
	
	public static void registerItems() {
		GameRegistry.registerItem(testIngot, testIngot.getUnlocalizedName());
		GameRegistry.registerItem(testDoorItem, testDoorItem.getUnlocalizedName());
	}
	
}

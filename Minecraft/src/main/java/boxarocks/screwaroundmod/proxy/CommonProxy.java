package boxarocks.screwaroundmod.proxy;

import boxarocks.screwaroundmod.block.BlockRegister;
import boxarocks.screwaroundmod.item.ItemRegister;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

public class CommonProxy {

	public void preInit(FMLPreInitializationEvent event) {
		ItemRegister.registerItems();
		BlockRegister.registerBlocks();
	}
	
	public void init (FMLInitializationEvent event) {
		
	}

	public void postInit (FMLPostInitializationEvent event) {
		
	}
	
}

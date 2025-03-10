package boxarocks.screwaroundmod.proxy;

import boxarocks.screwaroundmod.ScrewAroundMod;
import boxarocks.screwaroundmod.block.BlockRegister;
import boxarocks.screwaroundmod.item.ItemRegister;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.DimensionManager;

public class CommonProxy {
	
	public void preInit(FMLPreInitializationEvent event) {		
		ScrewAroundMod.logger.info(ScrewAroundMod.name + " registering items & blocks");
		ItemRegister.registerItems();
		BlockRegister.registerBlocks();
	}
	
	public void init (FMLInitializationEvent event) {

	}

	public void postInit (FMLPostInitializationEvent event) {
		
	}
	
}

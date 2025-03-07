package boxarocks.screwaroundmod.proxy;

import boxarocks.screwaroundmod.ScrewAroundMod;
import boxarocks.screwaroundmod.block.BlockRegister;
import boxarocks.screwaroundmod.item.ItemRegister;
import boxarocks.screwaroundmod.world.TestProvider;
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

	//temp placement
	public static BiomeGenBase biomeTest;
	
	public void preInit(FMLPreInitializationEvent event) {		
		ItemRegister.registerItems();
		BlockRegister.registerBlocks();
	}
	
	public void init (FMLInitializationEvent event) {
		
		BiomeDictionary.registerBiomeType(biomeTest, Type.PLAINS);
		BiomeManager.addSpawnBiome(biomeTest);
		
		DimensionManager.registerProviderType(ScrewAroundMod.properties.testProviderID, TestProvider.class, false);
		DimensionManager.registerDimension(ScrewAroundMod.properties.testDimensionID, ScrewAroundMod.properties.testProviderID);
	}

	public void postInit (FMLPostInitializationEvent event) {
		
	}
	
}

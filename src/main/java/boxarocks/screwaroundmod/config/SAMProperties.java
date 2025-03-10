package boxarocks.screwaroundmod.config;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class SAMProperties {

	//BiomeIDs
	public final int testBiomeID;
	
	//Dim IDs
	public final int testProviderID;
	public final int testDimensionID;
	
	private static SAMProperties instance = null;
	
	//Categories
	public final String CATEGORY_BIOME = "biome";
	public final String CATEGORY_DIMENSION = "dimension";
	public final String CATEGORY_PROVIDER = "provider";
	
	private SAMProperties(File configFile) {
		
		Configuration config = new Configuration(configFile);
		config.load();
		
		testDimensionID = config.get(CATEGORY_DIMENSION, "Test Dimension ID", 100).getInt();
		testProviderID = config.get(CATEGORY_PROVIDER, "Test Provider ID", 101).getInt();
		
		testBiomeID = config.get(CATEGORY_BIOME, "Test Biome ID", 102).getInt();		
		config.save();
		
	}
	
	public static SAMProperties initialize(File configFile) {
		
		if (instance == null)
			instance = new SAMProperties(configFile);
		else
			throw new IllegalStateException("Cannot initialize SAMProperties twice!");
		
		return instance;
	}
	
	public static SAMProperties instance() {
		if (instance == null) {
			throw new IllegalStateException("Instance of SAMProperties requested before initalization!");
		}
		return instance;
	}
	
}

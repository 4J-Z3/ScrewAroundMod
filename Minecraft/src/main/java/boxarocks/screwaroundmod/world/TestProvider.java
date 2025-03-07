package boxarocks.screwaroundmod.world;

import boxarocks.screwaroundmod.ScrewAroundMod;
import boxarocks.screwaroundmod.config.SAMProperties;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.WorldChunkManager;

public class TestProvider extends WorldProvider {

	@Override
	public String getDimensionName() {
		return "Test";
	}
	
	private SAMProperties properties;
	
	public void testProvider() {
		this.properties = ScrewAroundMod.properties;
	}
	
	@Override
	protected void registerWorldChunkManager() {
		// TODO Auto-generated method stub
		super.worldChunkMgr = new WorldChunkManager(dimensionId, terrainType);
	}
	
}

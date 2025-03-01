package boxarocks.screwaroundmod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import boxarocks.screwaroundmod.proxy.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ScrewAroundMod.modid, name = ScrewAroundMod.name, version = ScrewAroundMod.version)
public class ScrewAroundMod {
	
	public static final String modid = "screwaroundmod";
	public static final String name = "Screw Around Mod";
	public static final String version = "1.0.0";
	
	public static final Logger logger = LogManager.getLogger(name);
	
	@Mod.Instance(modid)
	public static ScrewAroundMod instance;
	
	@SidedProxy(serverSide = "boxarocks.screwaroundmod.proxy.CommonProxy", clientSide = "boxarocks.screwaroundmod.proxy.ClientProxy")
	public static CommonProxy proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		logger.info(modid + " Pre-Init.");
		proxy.preInit(event);
	}
	
	@Mod.EventHandler
	public void init (FMLInitializationEvent event) {
		proxy.init(event);
	}
	
	@Mod.EventHandler
	public void postInit (FMLPostInitializationEvent event) {
		proxy.postInit(event);
	}
 	
}

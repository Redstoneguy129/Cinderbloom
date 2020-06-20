package enderman842.infernalhardship;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import enderman842.infernalhardship.client.render.RenderRegistry;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("infernalhardship")
public class Main {
	public static Main instance;
	public static final String MOD_ID = "infernalhardship";
	public static final String VERSION = "NaN";
	public static final Logger logger = LogManager.getLogger(MOD_ID);
	public Main() {
		//All this code was written by Enderman842
		instance = this;
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientRegistries);
		MinecraftForge.EVENT_BUS.register(this);
	}
	
	private void setup(final FMLCommonSetupEvent event) {
		
	}
	private void clientRegistries(final FMLClientSetupEvent event) {
		RenderRegistry.registerEntityRenderers();
	}
	
	public static ResourceLocation location(String name) {
		return new ResourceLocation(Main.MOD_ID, name);
	}
}

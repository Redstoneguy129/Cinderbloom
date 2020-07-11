package enderman842.infernalhardship;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import enderman842.infernalhardship.client.render.RenderRegistry;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("cinderbloom")
public class Main {
	public static Main instance;
	public static final String MOD_ID = "cinderbloom";
	public static final Logger logger = LogManager.getLogger(MOD_ID);
	public static final ItemGroup cindertab = new CinderTab();
	public Main() {
		//All this code was written by Enderman842
		//pls dont steal

		//might steal -Redstoneguy129
		//jkjk - Redstoneguy129
		instance = this;
		
		final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		modEventBus.addListener(this::setup);
		modEventBus.addListener(this::clientRegistries);
		MinecraftForge.EVENT_BUS.register(this);
	}
	
	private void setup(final FMLCommonSetupEvent event) {
		
	}
	private void clientRegistries(final FMLClientSetupEvent event) {
		RenderRegistry.registerEntityRenderers();
		RenderTypeLookup.setRenderLayer(IHBlocks.gilded_rose, RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(IHBlocks.withered_campfire, RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(IHBlocks.withered_lantern, RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(IHBlocks.witherslag_fungus, RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(IHBlocks.witherslag_roots, RenderType.getCutout());
	}
	
	public static ResourceLocation location(String name) {
		return new ResourceLocation(Main.MOD_ID, name);
	}
}

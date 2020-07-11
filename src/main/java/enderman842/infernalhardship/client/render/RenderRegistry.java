package enderman842.infernalhardship.client.render;

import enderman842.infernalhardship.ItemsNStuffRegistry;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

@OnlyIn(Dist.CLIENT)
public class RenderRegistry {
	public static void registerEntityRenderers() {
		RenderingRegistry.registerEntityRenderingHandler(ItemsNStuffRegistry.nether_crab, new NetherCrabRender.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(ItemsNStuffRegistry.magma_crab, new MagmaCrabRender.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(ItemsNStuffRegistry.bloody_crab, new BloodyCrabRender.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(ItemsNStuffRegistry.warped_fungi_crab, new WarpedFungiCrabRender.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(ItemsNStuffRegistry.crimson_fungi_crab, new CrimsonFungiCrabRender.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(ItemsNStuffRegistry.scorched, new ScorchedRender.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(ItemsNStuffRegistry.charred, new CharredRender.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(ItemsNStuffRegistry.witherslag_crab, new WitherslagCrabRender.RenderFactory());
	}
}

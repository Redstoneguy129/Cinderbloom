package enderman842.infernalhardship.client.render;

import enderman842.infernalhardship.Main;
import enderman842.infernalhardship.client.models.WarpedFungiCrabModel;
import enderman842.infernalhardship.entities.WarpedFungiCrab;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.LivingRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.IRenderFactory;

@OnlyIn(Dist.CLIENT)
public class WarpedFungiCrabRender extends LivingRenderer<WarpedFungiCrab, WarpedFungiCrabModel> {

	public WarpedFungiCrabRender(EntityRendererManager manager) {
		super(manager, new WarpedFungiCrabModel(), 0f);
		
	}
	public ResourceLocation getEntityTexture(WarpedFungiCrab entity) {
		return Main.location("textures/entity/crab/warped_fungi_crab.png");
	}
	
	public static class RenderFactory implements IRenderFactory<WarpedFungiCrab> {

		@Override
		public EntityRenderer<? super WarpedFungiCrab> createRenderFor(EntityRendererManager manager) {
			return new WarpedFungiCrabRender(manager);
		}

	}
}

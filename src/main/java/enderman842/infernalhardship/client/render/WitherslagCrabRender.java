package enderman842.infernalhardship.client.render;

import enderman842.infernalhardship.Main;
import enderman842.infernalhardship.client.models.WitherslagCrabModel;
import enderman842.infernalhardship.entities.WitherslagCrab;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.LivingRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.IRenderFactory;

@OnlyIn(Dist.CLIENT)
public class WitherslagCrabRender extends LivingRenderer<WitherslagCrab, WitherslagCrabModel> {

	public WitherslagCrabRender(EntityRendererManager manager) {
		super(manager, new WitherslagCrabModel(), 0f);
		
	}
	public ResourceLocation getEntityTexture(WitherslagCrab entity) {
		return Main.location("textures/entity/crab/witherwart_creb.png");
	}
	
	public static class RenderFactory implements IRenderFactory<WitherslagCrab> {

		@Override
		public EntityRenderer<? super WitherslagCrab> createRenderFor(EntityRendererManager manager) {
			return new WitherslagCrabRender(manager);
		}

	}
}

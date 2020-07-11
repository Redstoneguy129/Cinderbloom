package enderman842.infernalhardship.client.render;

import enderman842.infernalhardship.Main;
import enderman842.infernalhardship.client.models.MagmaCrabModel;
import enderman842.infernalhardship.entities.MagmaCrab;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.LivingRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.IRenderFactory;

@OnlyIn(Dist.CLIENT)
public class MagmaCrabRender extends LivingRenderer<MagmaCrab, MagmaCrabModel> {

	public MagmaCrabRender(EntityRendererManager manager) {
		super(manager, new MagmaCrabModel(), 0f);
		
	}
	public ResourceLocation getEntityTexture(MagmaCrab entity) {
		return Main.location("textures/entity/crab/magma_crab.png");
	}
	
	public static class RenderFactory implements IRenderFactory<MagmaCrab> {

		@Override
		public EntityRenderer<? super MagmaCrab> createRenderFor(EntityRendererManager manager) {
			return new MagmaCrabRender(manager);
		}

	}
}

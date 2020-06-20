package enderman842.infernalhardship.client.render;

import enderman842.infernalhardship.Main;
import enderman842.infernalhardship.client.models.BloodyCrabModel;
import enderman842.infernalhardship.entities.BloodyCrab;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.LivingRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.IRenderFactory;

@OnlyIn(Dist.CLIENT)
public class BloodyCrabRender extends LivingRenderer<BloodyCrab, BloodyCrabModel> {

	public BloodyCrabRender(EntityRendererManager manager) {
		super(manager, new BloodyCrabModel(), 0f);
		
	}
	public ResourceLocation getEntityTexture(BloodyCrab entity) {
		return Main.location("textures/entity/bloody_crab.png");
	}
	
	public static class RenderFactory implements IRenderFactory<BloodyCrab> {

		@Override
		public EntityRenderer<? super BloodyCrab> createRenderFor(EntityRendererManager manager) {
			return new BloodyCrabRender(manager);
		}

	}
}

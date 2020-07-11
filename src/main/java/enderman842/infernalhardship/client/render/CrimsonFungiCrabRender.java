package enderman842.infernalhardship.client.render;

import enderman842.infernalhardship.Main;
import enderman842.infernalhardship.client.models.CrimsonFungiCrabModel;
import enderman842.infernalhardship.entities.CrimsonFungiCrab;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.LivingRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.IRenderFactory;

@OnlyIn(Dist.CLIENT)
public class CrimsonFungiCrabRender extends LivingRenderer<CrimsonFungiCrab, CrimsonFungiCrabModel> {

	public CrimsonFungiCrabRender(EntityRendererManager manager) {
		super(manager, new CrimsonFungiCrabModel(), 0f);
		
	}
	public ResourceLocation getEntityTexture(CrimsonFungiCrab entity) {
		return Main.location("textures/entity/crab/crimson_fungi_crab.png");
	}
	
	public static class RenderFactory implements IRenderFactory<CrimsonFungiCrab> {

		@Override
		public EntityRenderer<? super CrimsonFungiCrab> createRenderFor(EntityRendererManager manager) {
			return new CrimsonFungiCrabRender(manager);
		}

	}
}

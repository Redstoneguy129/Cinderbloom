package enderman842.infernalhardship.client.render;

import enderman842.infernalhardship.Main;
import enderman842.infernalhardship.client.models.ScorchedModel;
import enderman842.infernalhardship.entities.Scorched;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.LivingRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.IRenderFactory;

@OnlyIn(Dist.CLIENT)
public class ScorchedRender extends LivingRenderer<Scorched, ScorchedModel> {

	public ScorchedRender(EntityRendererManager manager) {
		super(manager, new ScorchedModel(), 0f);
		
	}
	public ResourceLocation getEntityTexture(Scorched entity) {
		return Main.location("textures/entity/scorched.png");
	}
	
	public static class RenderFactory implements IRenderFactory<Scorched> {

		@Override
		public EntityRenderer<? super Scorched> createRenderFor(EntityRendererManager manager) {
			return new ScorchedRender(manager);
		}

	}
}

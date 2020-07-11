package enderman842.infernalhardship.client.render;

import enderman842.infernalhardship.Main;
import enderman842.infernalhardship.client.models.CharredModel;
import enderman842.infernalhardship.entities.Charred;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.LivingRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.IRenderFactory;

@OnlyIn(Dist.CLIENT)
public class CharredRender extends LivingRenderer<Charred, CharredModel> {

	public CharredRender(EntityRendererManager manager) {
		super(manager, new CharredModel(), 0f);
		
	}
	public ResourceLocation getEntityTexture(Charred entity) {
		return Main.location("textures/entity/charred.png");
	}
	
	public static class RenderFactory implements IRenderFactory<Charred> {

		@Override
		public EntityRenderer<? super Charred> createRenderFor(EntityRendererManager manager) {
			return new CharredRender(manager);
		}

	}
}

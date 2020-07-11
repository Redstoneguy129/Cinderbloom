package enderman842.infernalhardship.client.render;

import enderman842.infernalhardship.Main;
import enderman842.infernalhardship.client.models.NetherCrabModel;
import enderman842.infernalhardship.entities.NetherCrab;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.LivingRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.IRenderFactory;

@OnlyIn(Dist.CLIENT)
public class NetherCrabRender extends LivingRenderer<NetherCrab, NetherCrabModel> {

	public NetherCrabRender(EntityRendererManager manager) {
		super(manager, new NetherCrabModel(), 0f);
		
	}
	public ResourceLocation getEntityTexture(NetherCrab entity) {
		return Main.location("textures/entity/crab/nether_crab.png");
	}
	
	public static class RenderFactory implements IRenderFactory<NetherCrab> {

		@Override
		public EntityRenderer<? super NetherCrab> createRenderFor(EntityRendererManager manager) {
			return new NetherCrabRender(manager);
		}

	}
}

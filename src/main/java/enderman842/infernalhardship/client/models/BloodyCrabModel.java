package enderman842.infernalhardship.client.models;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import enderman842.infernalhardship.entities.BloodyCrab;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class BloodyCrabModel extends EntityModel<BloodyCrab> {
	private final ModelRenderer bone5;
	private final ModelRenderer bone6;
	private final ModelRenderer bone3;
	private final ModelRenderer bone2;
	private final ModelRenderer bone4;
	private final ModelRenderer bone7;
	private final ModelRenderer bone8;
	private final ModelRenderer bone10;
	private final ModelRenderer bone11;
	private final ModelRenderer bone12;
	private final ModelRenderer bone13;
	private final ModelRenderer bone9;
	private final ModelRenderer bone14;
	private final ModelRenderer bone15;

	public BloodyCrabModel() {
		textureWidth = 64;
		textureHeight = 64;

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(0.0F, 23.0F, 2.0F);
		bone5.setTextureOffset(0, 18).addBox(-4.0F, -5.0F, 1.0F, 8.0F, 3.0F, 2.0F, 0.0F, false);
		bone5.setTextureOffset(0, 10).addBox(-4.0F, -2.0F, -5.0F, 8.0F, 1.0F, 7.0F, 0.0F, false);
		bone5.setTextureOffset(0, 0).addBox(-6.0F, -5.0F, -6.0F, 12.0F, 3.0F, 7.0F, 0.0F, false);

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(-4.0F, -1.5F, -0.5F);
		bone5.addChild(bone6);
		

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone6.addChild(bone3);
		setRotationAngle(bone3, 0.0F, 0.0873F, -0.4363F);
		bone3.setTextureOffset(23, 12).addBox(-6.0F, -0.5F, -0.5F, 7.0F, 1.0F, 1.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, 0.0F, 2.0F);
		bone6.addChild(bone2);
		setRotationAngle(bone2, -0.1745F, 0.4363F, -0.5236F);
		bone2.setTextureOffset(23, 14).addBox(-5.0F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, 0.0F, false);

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.0F, 0.0F, -2.0F);
		bone6.addChild(bone4);
		setRotationAngle(bone4, 0.0F, -0.1745F, -0.4363F);
		bone4.setTextureOffset(23, 10).addBox(-6.0F, -0.5F, -0.5F, 7.0F, 1.0F, 1.0F, 0.0F, false);

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(4.0F, -1.5F, -0.5F);
		bone5.addChild(bone7);
		

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone7.addChild(bone8);
		setRotationAngle(bone8, 0.0F, -0.0873F, 0.4363F);
		bone8.setTextureOffset(22, 20).addBox(-1.0F, -0.5F, -0.5F, 7.0F, 1.0F, 1.0F, 0.0F, false);

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(0.0F, 0.0F, 2.0F);
		bone7.addChild(bone10);
		setRotationAngle(bone10, -0.2618F, -0.4363F, 0.5236F);
		bone10.setTextureOffset(0, 23).addBox(-1.0F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, 0.0F, false);

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(0.0F, 0.0F, -2.0F);
		bone7.addChild(bone11);
		setRotationAngle(bone11, 0.0F, 0.1745F, 0.4363F);
		bone11.setTextureOffset(22, 18).addBox(-1.0F, -0.5F, -0.5F, 7.0F, 1.0F, 1.0F, 0.0F, false);

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(0.0F, 1.0F, 0.0F);
		bone5.addChild(bone12);
		

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(-4.0F, -2.5F, -4.5F);
		bone12.addChild(bone13);
		setRotationAngle(bone13, 0.3491F, -0.7854F, -0.1745F);
		bone13.setTextureOffset(8, 25).addBox(-3.0F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(-3.5F, 0.0F, 0.5F);
		bone13.addChild(bone9);
		setRotationAngle(bone9, 0.0F, -0.2618F, 0.0F);
		bone9.setTextureOffset(22, 22).addBox(-0.5F, -1.0F, -4.0F, 1.0F, 2.0F, 5.0F, 0.0F, false);

		bone14 = new ModelRenderer(this);
		bone14.setRotationPoint(4.0F, -2.5F, -4.5F);
		bone12.addChild(bone14);
		setRotationAngle(bone14, 0.3491F, 0.7854F, 0.1745F);
		bone14.setTextureOffset(0, 25).addBox(0.0F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		bone15 = new ModelRenderer(this);
		bone15.setRotationPoint(3.5F, 0.0F, 0.5F);
		bone14.addChild(bone15);
		setRotationAngle(bone15, 0.0F, 0.2618F, 0.0F);
		bone15.setTextureOffset(15, 18).addBox(-0.5F, -1.0F, -4.0F, 1.0F, 2.0F, 5.0F, 0.0F, false);
	}
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		bone5.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void func_225597_a_(BloodyCrab p_225597_1_, float p_225597_2_, float p_225597_3_, float p_225597_4_,
			float p_225597_5_, float p_225597_6_) {
		// TODO Auto-generated method stub
		
	}

	public void func_225598_a_(MatrixStack p_225598_1_, IVertexBuilder p_225598_2_, int p_225598_3_, int p_225598_4_,
			float p_225598_5_, float p_225598_6_, float p_225598_7_, float p_225598_8_) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setRotationAngles(BloodyCrab arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
		// TODO Auto-generated method stub
		
	}
}
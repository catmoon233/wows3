
package net.mcreator.wows.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.wows.entity.model.DragonModel;
import net.mcreator.wows.entity.layer.DragonLayer;
import net.mcreator.wows.entity.DragonEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class DragonRenderer extends GeoEntityRenderer<DragonEntity> {
	public DragonRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new DragonModel());
		this.shadowRadius = 0.5f;
		this.addLayer(new DragonLayer(this));
	}

	@Override
	public RenderType getRenderType(DragonEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}
}

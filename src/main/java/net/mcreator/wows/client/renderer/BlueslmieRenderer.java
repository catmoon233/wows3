
package net.mcreator.wows.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.SlimeModel;

import net.mcreator.wows.entity.BlueslmieEntity;

public class BlueslmieRenderer extends MobRenderer<BlueslmieEntity, SlimeModel<BlueslmieEntity>> {
	public BlueslmieRenderer(EntityRendererProvider.Context context) {
		super(context, new SlimeModel(context.bakeLayer(ModelLayers.SLIME)), 0.5f);
		this.addLayer(new EyesLayer<BlueslmieEntity, SlimeModel<BlueslmieEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("wows:textures/entities/slime.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(BlueslmieEntity entity) {
		return new ResourceLocation("wows:textures/entities/slime.png");
	}
}

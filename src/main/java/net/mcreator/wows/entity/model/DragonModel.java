package net.mcreator.wows.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.wows.entity.DragonEntity;

public class DragonModel extends AnimatedGeoModel<DragonEntity> {
	@Override
	public ResourceLocation getAnimationResource(DragonEntity entity) {
		return new ResourceLocation("wows", "animations/model.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DragonEntity entity) {
		return new ResourceLocation("wows", "geo/model.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DragonEntity entity) {
		return new ResourceLocation("wows", "textures/entities/" + entity.getTexture() + ".png");
	}

}

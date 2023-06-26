
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wows.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.wows.client.renderer.UisRenderer;
import net.mcreator.wows.client.renderer.DragonRenderer;
import net.mcreator.wows.client.renderer.BlueslmieRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class WowsModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(WowsModEntities.UIS.get(), UisRenderer::new);
		event.registerEntityRenderer(WowsModEntities.BLUESLMIE.get(), BlueslmieRenderer::new);
		event.registerEntityRenderer(WowsModEntities.Q_2.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(WowsModEntities.FB.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(WowsModEntities.DRAGON.get(), DragonRenderer::new);
	}
}

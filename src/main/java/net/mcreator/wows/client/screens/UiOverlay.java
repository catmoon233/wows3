
package net.mcreator.wows.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.chat.Component;
import net.minecraft.client.Minecraft;

import net.mcreator.wows.procedures.UiZhiShuZhitlProcedure;
import net.mcreator.wows.procedures.UiZhiShuZhi5Procedure;
import net.mcreator.wows.procedures.UiZhiShuZhi4Procedure;
import net.mcreator.wows.procedures.UiZhiShuZhi2Procedure;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class UiOverlay {
	@SubscribeEvent(priority = EventPriority.HIGHEST)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getWindow().getGuiScaledWidth();
		int h = event.getWindow().getGuiScaledHeight();
		int posX = w / 2;
		int posY = h / 2;
		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;
		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level;
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}
		if (true) {
			Minecraft.getInstance().font.draw(event.getPoseStack(),

					UiZhiShuZhi2Procedure.execute(entity), posX + 8, posY + -5, -6750208);
			Minecraft.getInstance().font.draw(event.getPoseStack(), Component.translatable("gui.wows.ui.label_aa"), posX + 8, posY + 9, -10027162);
			Minecraft.getInstance().font.draw(event.getPoseStack(),

					UiZhiShuZhi4Procedure.execute(entity), posX + 8, posY + 21, -13369345);
			Minecraft.getInstance().font.draw(event.getPoseStack(),

					UiZhiShuZhi5Procedure.execute(entity), posX + 8, posY + 32, -1);
			Minecraft.getInstance().font.draw(event.getPoseStack(),

					UiZhiShuZhitlProcedure.execute(entity), posX + 8, posY + 44, -10027111);
		}
	}
}

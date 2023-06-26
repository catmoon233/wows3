
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wows.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.wows.network.Zhlw1Message;
import net.mcreator.wows.network.WplopenajMessage;
import net.mcreator.wows.network.JipaoMessage;
import net.mcreator.wows.network.FwcMessage;
import net.mcreator.wows.network.EuionMessage;
import net.mcreator.wows.network.CaidanopenMessage;
import net.mcreator.wows.WowsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class WowsModKeyMappings {
	public static final KeyMapping EUION = new KeyMapping("key.wows.euion", GLFW.GLFW_KEY_B, "key.categories.n") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				WowsMod.PACKET_HANDLER.sendToServer(new EuionMessage(0, 0));
				EuionMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping FWC = new KeyMapping("key.wows.fwc", GLFW.GLFW_KEY_X, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				WowsMod.PACKET_HANDLER.sendToServer(new FwcMessage(0, 0));
				FwcMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping CAIDANOPEN = new KeyMapping("key.wows.caidanopen", GLFW.GLFW_KEY_V, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				WowsMod.PACKET_HANDLER.sendToServer(new CaidanopenMessage(0, 0));
				CaidanopenMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping WPLOPENAJ = new KeyMapping("key.wows.wplopenaj", GLFW.GLFW_KEY_E, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				WowsMod.PACKET_HANDLER.sendToServer(new WplopenajMessage(0, 0));
				WplopenajMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping JIPAO = new KeyMapping("key.wows.jipao", GLFW.GLFW_KEY_LEFT_SHIFT, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				WowsMod.PACKET_HANDLER.sendToServer(new JipaoMessage(0, 0));
				JipaoMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				JIPAO_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - JIPAO_LASTPRESS);
				WowsMod.PACKET_HANDLER.sendToServer(new JipaoMessage(1, dt));
				JipaoMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping ZHLW_1 = new KeyMapping("key.wows.zhlw_1", GLFW.GLFW_KEY_X, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				WowsMod.PACKET_HANDLER.sendToServer(new Zhlw1Message(0, 0));
				Zhlw1Message.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	private static long JIPAO_LASTPRESS = 0;

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(EUION);
		event.register(FWC);
		event.register(CAIDANOPEN);
		event.register(WPLOPENAJ);
		event.register(JIPAO);
		event.register(ZHLW_1);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				EUION.consumeClick();
				FWC.consumeClick();
				CAIDANOPEN.consumeClick();
				WPLOPENAJ.consumeClick();
				JIPAO.consumeClick();
				ZHLW_1.consumeClick();
			}
		}
	}
}

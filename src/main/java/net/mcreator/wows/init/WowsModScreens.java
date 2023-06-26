
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wows.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.wows.client.gui.ZcdScreen;
import net.mcreator.wows.client.gui.XuanzeScreen;
import net.mcreator.wows.client.gui.Xuanze2Screen;
import net.mcreator.wows.client.gui.XsScreen;
import net.mcreator.wows.client.gui.WplScreen;
import net.mcreator.wows.client.gui.LwjcguiScreen;
import net.mcreator.wows.client.gui.LwcdScreen;
import net.mcreator.wows.client.gui.EuiScreen;
import net.mcreator.wows.client.gui.DlxtScreen;
import net.mcreator.wows.client.gui.Cj1Screen;
import net.mcreator.wows.client.gui.C1Screen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class WowsModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(WowsModMenus.EUI.get(), EuiScreen::new);
			MenuScreens.register(WowsModMenus.DLXT.get(), DlxtScreen::new);
			MenuScreens.register(WowsModMenus.XUANZE.get(), XuanzeScreen::new);
			MenuScreens.register(WowsModMenus.XUANZE_2.get(), Xuanze2Screen::new);
			MenuScreens.register(WowsModMenus.C_1.get(), C1Screen::new);
			MenuScreens.register(WowsModMenus.ZCD.get(), ZcdScreen::new);
			MenuScreens.register(WowsModMenus.LWJCGUI.get(), LwjcguiScreen::new);
			MenuScreens.register(WowsModMenus.LWCD.get(), LwcdScreen::new);
			MenuScreens.register(WowsModMenus.XS.get(), XsScreen::new);
			MenuScreens.register(WowsModMenus.CJ_1.get(), Cj1Screen::new);
			MenuScreens.register(WowsModMenus.WPL.get(), WplScreen::new);
		});
	}
}

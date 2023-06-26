
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wows.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.wows.world.inventory.ZcdMenu;
import net.mcreator.wows.world.inventory.XuanzeMenu;
import net.mcreator.wows.world.inventory.Xuanze2Menu;
import net.mcreator.wows.world.inventory.XsMenu;
import net.mcreator.wows.world.inventory.WplMenu;
import net.mcreator.wows.world.inventory.LwjcguiMenu;
import net.mcreator.wows.world.inventory.LwcdMenu;
import net.mcreator.wows.world.inventory.EuiMenu;
import net.mcreator.wows.world.inventory.DlxtMenu;
import net.mcreator.wows.world.inventory.Cj1Menu;
import net.mcreator.wows.world.inventory.C1Menu;
import net.mcreator.wows.WowsMod;

public class WowsModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, WowsMod.MODID);
	public static final RegistryObject<MenuType<EuiMenu>> EUI = REGISTRY.register("eui", () -> IForgeMenuType.create(EuiMenu::new));
	public static final RegistryObject<MenuType<DlxtMenu>> DLXT = REGISTRY.register("dlxt", () -> IForgeMenuType.create(DlxtMenu::new));
	public static final RegistryObject<MenuType<XuanzeMenu>> XUANZE = REGISTRY.register("xuanze", () -> IForgeMenuType.create(XuanzeMenu::new));
	public static final RegistryObject<MenuType<Xuanze2Menu>> XUANZE_2 = REGISTRY.register("xuanze_2", () -> IForgeMenuType.create(Xuanze2Menu::new));
	public static final RegistryObject<MenuType<C1Menu>> C_1 = REGISTRY.register("c_1", () -> IForgeMenuType.create(C1Menu::new));
	public static final RegistryObject<MenuType<ZcdMenu>> ZCD = REGISTRY.register("zcd", () -> IForgeMenuType.create(ZcdMenu::new));
	public static final RegistryObject<MenuType<LwjcguiMenu>> LWJCGUI = REGISTRY.register("lwjcgui", () -> IForgeMenuType.create(LwjcguiMenu::new));
	public static final RegistryObject<MenuType<LwcdMenu>> LWCD = REGISTRY.register("lwcd", () -> IForgeMenuType.create(LwcdMenu::new));
	public static final RegistryObject<MenuType<XsMenu>> XS = REGISTRY.register("xs", () -> IForgeMenuType.create(XsMenu::new));
	public static final RegistryObject<MenuType<Cj1Menu>> CJ_1 = REGISTRY.register("cj_1", () -> IForgeMenuType.create(Cj1Menu::new));
	public static final RegistryObject<MenuType<WplMenu>> WPL = REGISTRY.register("wpl", () -> IForgeMenuType.create(WplMenu::new));
}


/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wows.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.wows.item.QItem;
import net.mcreator.wows.item.Q2Item;
import net.mcreator.wows.item.PaotaiItem;
import net.mcreator.wows.item.MujianItem;
import net.mcreator.wows.item.LmglItem;
import net.mcreator.wows.item.Lmgl2Item;
import net.mcreator.wows.item.LlqItem;
import net.mcreator.wows.item.Jb1Item;
import net.mcreator.wows.item.HtcItem;
import net.mcreator.wows.item.FbItem;
import net.mcreator.wows.item.BackpackItem;
import net.mcreator.wows.item.AkItem;
import net.mcreator.wows.WowsMod;

public class WowsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, WowsMod.MODID);
	public static final RegistryObject<Item> JB_1 = REGISTRY.register("jb_1", () -> new Jb1Item());
	public static final RegistryObject<Item> UIS_SPAWN_EGG = REGISTRY.register("uis_spawn_egg", () -> new ForgeSpawnEggItem(WowsModEntities.UIS, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> BLUESLMIE_SPAWN_EGG = REGISTRY.register("blueslmie_spawn_egg", () -> new ForgeSpawnEggItem(WowsModEntities.BLUESLMIE, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> LMGL = REGISTRY.register("lmgl", () -> new LmglItem());
	public static final RegistryObject<Item> MUJIAN = REGISTRY.register("mujian", () -> new MujianItem());
	public static final RegistryObject<Item> LMGL_2 = REGISTRY.register("lmgl_2", () -> new Lmgl2Item());
	public static final RegistryObject<Item> BACKPACK = REGISTRY.register("backpack", () -> new BackpackItem());
	public static final RegistryObject<Item> BACKPACKB = block(WowsModBlocks.BACKPACKB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> Q = REGISTRY.register("q", () -> new QItem());
	public static final RegistryObject<Item> Q_2 = REGISTRY.register("q_2", () -> new Q2Item());
	public static final RegistryObject<Item> LLQ = REGISTRY.register("llq", () -> new LlqItem());
	public static final RegistryObject<Item> PAOTAI = REGISTRY.register("paotai", () -> new PaotaiItem());
	public static final RegistryObject<Item> FB = REGISTRY.register("fb", () -> new FbItem());
	public static final RegistryObject<Item> AK = REGISTRY.register("ak", () -> new AkItem());
	public static final RegistryObject<Item> HTC = REGISTRY.register("htc", () -> new HtcItem());
	public static final RegistryObject<Item> DRAGON_SPAWN_EGG = REGISTRY.register("dragon_spawn_egg", () -> new ForgeSpawnEggItem(WowsModEntities.DRAGON, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}

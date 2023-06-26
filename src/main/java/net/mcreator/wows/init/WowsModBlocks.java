
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wows.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.wows.block.BackpackbBlock;
import net.mcreator.wows.WowsMod;

public class WowsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, WowsMod.MODID);
	public static final RegistryObject<Block> BACKPACKB = REGISTRY.register("backpackb", () -> new BackpackbBlock());
}

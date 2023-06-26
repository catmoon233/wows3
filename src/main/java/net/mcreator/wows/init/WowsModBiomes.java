
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wows.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.biome.Biome;

import net.mcreator.wows.world.biome.ZcqsBiome;
import net.mcreator.wows.WowsMod;

public class WowsModBiomes {
	public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, WowsMod.MODID);
	public static final RegistryObject<Biome> ZCQS = REGISTRY.register("zcqs", ZcqsBiome::createBiome);
}

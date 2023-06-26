
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wows.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.wows.WowsMod;

public class WowsModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, WowsMod.MODID);
	public static final RegistryObject<SimpleParticleType> JQ = REGISTRY.register("jq", () -> new SimpleParticleType(true));
}

package net.mcreator.wows.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.wows.init.WowsModParticleTypes;

public class MujianDangShiTiHuiDongWuPinShiProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		world.addParticle((SimpleParticleType) (WowsModParticleTypes.JQ.get()), x, y, z, (entity.getLookAngle().x), (entity.getLookAngle().y), (entity.getLookAngle().z));
	}
}

package net.mcreator.wows.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.network.chat.Component;

import net.mcreator.wows.WowsMod;

public class BlueslmieShiTiChuShiShengChengShiProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		WowsMod.queueServerWork(2, () -> {
			entity.getPersistentData().putDouble("nx", (Mth.nextInt(RandomSource.create(), 1, 100)));
			entity.getPersistentData().putDouble("ak", Math.round(entity.getPersistentData().getDouble("nx") * 0.1));
			entity.getPersistentData().putDouble("fy", Math.round(entity.getPersistentData().getDouble("nx") * 0.15));
			entity.getPersistentData().putDouble("healthmax", Math.round((entity.getPersistentData().getDouble("nx") * 0.5) / 3));
			entity.getPersistentData().putDouble("healthnow1", (entity.getPersistentData().getDouble("healthmax")));
			entity.getPersistentData().putDouble("hdzmax", Math.round(entity.getPersistentData().getDouble("nx") * 0.15));
			entity.getPersistentData().putDouble("hdznow2", (entity.getPersistentData().getDouble("hdzmax")));
			entity.setCustomName(Component.literal((entity.getPersistentData().getDouble("nx") + "\u00A73\u84DD\u8272\u53F2\u83B1\u59C6")));
		});
	}
}

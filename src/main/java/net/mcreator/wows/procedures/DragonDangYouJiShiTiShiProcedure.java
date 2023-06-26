package net.mcreator.wows.procedures;

import net.minecraft.world.entity.Entity;

public class DragonDangYouJiShiTiShiProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		sourceentity.startRiding(entity);
	}
}

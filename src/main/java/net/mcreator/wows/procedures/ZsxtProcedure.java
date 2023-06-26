package net.mcreator.wows.procedures;

import net.minecraft.world.entity.Entity;

public class ZsxtProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("swxx", 1);
	}
}

package net.mcreator.wows.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.vehicle.MinecartChest;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

public class Cj2Procedure {
	public static Entity execute(LevelAccessor world) {
		return world instanceof Level _level ? new MinecartChest(EntityType.CHEST_MINECART, _level) : null;
	}
}

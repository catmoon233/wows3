package net.mcreator.wows.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

public class FwcAnXiaAnJianShiProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDouble("fwczt") == 1) {
			if (entity.getPersistentData().getDouble("fwcst") == 0) {
				entity.getPersistentData().putDouble("fwcfs", 0);
				entity.getPersistentData().putDouble("fwccs", 5);
				entity.getPersistentData().putDouble("fwcst", 1);
				entity.getPersistentData().putDouble("fwccs2", 1);
			}
			if (entity.getPersistentData().getDouble("fwcst") == 1) {
				entity.getPersistentData().putDouble("fwcfs", (entity.getPersistentData().getDouble("fwcfs") + Mth.nextInt(RandomSource.create(), 1, 10)));
				if (entity.getPersistentData().getDouble("fwccs") < 10) {
					entity.getPersistentData().putDouble("fwccs", (entity.getPersistentData().getDouble("fwccs") + 1));
				}
			}
		}
	}
}

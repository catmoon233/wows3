package net.mcreator.wows.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

public class FwcztProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double cs = 0;
		cs = 0;
		if (cs == 0) {
			if (entity.getPersistentData().getDouble("fwczt") == 0) {
				entity.getPersistentData().putDouble("fwczt", 1);
				entity.getPersistentData().putDouble("xz", (entity.getX()));
				entity.getPersistentData().putDouble("yz", (entity.getY()));
				entity.getPersistentData().putDouble("zz", (entity.getZ()));
				cs = 1;
				if (entity instanceof Player _player)
					_player.closeContainer();
			}
		}
		if (cs == 0) {
			if (entity.getPersistentData().getDouble("fwczt") == 1) {
				entity.getPersistentData().putDouble("fwczt", 0);
				cs = 1;
			}
		}
	}
}

package net.mcreator.wows.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.wows.network.WowsModVariables;

public class D1Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			String _setval = "xd";
			entity.getCapability(WowsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.dl = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		if (entity instanceof Player _player)
			_player.closeContainer();
		{
			double _setval = 0;
			entity.getCapability(WowsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.start = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}

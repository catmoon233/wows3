package net.mcreator.wows.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.wows.network.WowsModVariables;

public class EuiZhiShuZhi16Procedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "\u653B\u51FB\u63D0\u5347:" + (entity.getCapability(WowsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WowsModVariables.PlayerVariables())).gjts + "%";
	}
}

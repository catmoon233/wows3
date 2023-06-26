package net.mcreator.wows.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.wows.network.WowsModVariables;

public class EuiZhiShuZhi15Procedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "\u751F\u547D\u63D0\u5347:" + (entity.getCapability(WowsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WowsModVariables.PlayerVariables())).smts + "%";
	}
}

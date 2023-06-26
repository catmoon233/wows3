package net.mcreator.wows.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.wows.network.WowsModVariables;

public class EuiZhiShuZhi14Procedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "\u9632\u5FA1\u63D0\u5347:" + (entity.getCapability(WowsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WowsModVariables.PlayerVariables())).fyts + "%";
	}
}

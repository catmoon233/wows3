package net.mcreator.wows.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.wows.network.WowsModVariables;

public class EuiZhiShuZhi11Procedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "\u5438\u8840\u500D\u7387:" + (entity.getCapability(WowsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WowsModVariables.PlayerVariables())).xixuebl + "%";
	}
}

package net.mcreator.wows.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.wows.network.WowsModVariables;

public class EuiZhiShuZhi6Procedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "\u66B4\u51FB\u51E0\u7387:" + (entity.getCapability(WowsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WowsModVariables.PlayerVariables())).bjjl;
	}
}

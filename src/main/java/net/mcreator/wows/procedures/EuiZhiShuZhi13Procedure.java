package net.mcreator.wows.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.wows.network.WowsModVariables;

public class EuiZhiShuZhi13Procedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "\u767E\u5206\u6BD4\u653B\u51FB\u7A7F\u900F:" + (entity.getCapability(WowsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WowsModVariables.PlayerVariables())).gjct + "%";
	}
}

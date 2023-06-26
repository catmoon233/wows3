package net.mcreator.wows.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.wows.network.WowsModVariables;

public class EuiZhiShuZhi25Procedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "\u79FB\u52A8\u901F\u5EA6:" + (entity.getCapability(WowsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WowsModVariables.PlayerVariables())).ydsd;
	}
}

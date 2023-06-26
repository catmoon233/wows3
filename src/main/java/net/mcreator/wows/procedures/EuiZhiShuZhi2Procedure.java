package net.mcreator.wows.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.wows.network.WowsModVariables;

public class EuiZhiShuZhi2Procedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "\u9632\u5FA1:" + (entity.getCapability(WowsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WowsModVariables.PlayerVariables())).fy;
	}
}

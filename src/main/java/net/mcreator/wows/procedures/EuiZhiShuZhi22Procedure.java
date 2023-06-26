package net.mcreator.wows.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.wows.network.WowsModVariables;

public class EuiZhiShuZhi22Procedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "\u6700\u5927\u4F53\u529B:" + (entity.getCapability(WowsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WowsModVariables.PlayerVariables())).tlmax;
	}
}

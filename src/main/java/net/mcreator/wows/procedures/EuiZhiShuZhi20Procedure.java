package net.mcreator.wows.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.wows.network.WowsModVariables;

public class EuiZhiShuZhi20Procedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "\u6700\u5927\u62A4\u76FE\u503C:" + (entity.getCapability(WowsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WowsModVariables.PlayerVariables())).hdz;
	}
}

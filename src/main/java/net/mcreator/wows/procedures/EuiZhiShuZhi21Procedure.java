package net.mcreator.wows.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.wows.network.WowsModVariables;

public class EuiZhiShuZhi21Procedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "\u62A4\u76FE\u503C\u6062\u590D:" + (entity.getCapability(WowsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WowsModVariables.PlayerVariables())).hdhf;
	}
}

package net.mcreator.wows.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.wows.network.WowsModVariables;

public class EuiZhiShuZhishenjisuoxuProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "\u5347\u7EA7\u6240\u9700:" + (entity.getCapability(WowsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WowsModVariables.PlayerVariables())).leverup;
	}
}

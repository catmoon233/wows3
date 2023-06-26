package net.mcreator.wows.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.wows.network.WowsModVariables;

public class DlxtZhiShuZhi1Procedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "\u529B\u91CF:" + (entity.getCapability(WowsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WowsModVariables.PlayerVariables())).liliang;
	}
}

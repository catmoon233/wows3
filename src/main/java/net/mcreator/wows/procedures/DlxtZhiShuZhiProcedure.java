package net.mcreator.wows.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.wows.network.WowsModVariables;

public class DlxtZhiShuZhiProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "\u654F\u6377:" + (entity.getCapability(WowsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WowsModVariables.PlayerVariables())).minjie;
	}
}

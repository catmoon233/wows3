package net.mcreator.wows.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.wows.network.WowsModVariables;

public class LwcdZhiShuZhi3Procedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "\u653B\u51FB\uFF1A" + ((entity.getCapability(WowsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WowsModVariables.PlayerVariables())).lw1).getOrCreateTag().getDouble("gj");
	}
}

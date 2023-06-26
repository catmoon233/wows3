package net.mcreator.wows.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.wows.network.WowsModVariables;

public class LwcdZhiShuZhi4Procedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "\u751F\u547D:" + ((entity.getCapability(WowsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WowsModVariables.PlayerVariables())).lw1).getOrCreateTag().getDouble("sm");
	}
}

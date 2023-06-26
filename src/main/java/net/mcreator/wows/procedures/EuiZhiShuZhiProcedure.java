package net.mcreator.wows.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.wows.network.WowsModVariables;

public class EuiZhiShuZhiProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "\u4EBA\u7269\u4F24\u5BB3" + (entity.getCapability(WowsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WowsModVariables.PlayerVariables())).ak;
	}
}

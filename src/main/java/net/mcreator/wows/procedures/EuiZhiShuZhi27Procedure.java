package net.mcreator.wows.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.wows.network.WowsModVariables;

public class EuiZhiShuZhi27Procedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "\u514D\u4F24:" + (entity.getCapability(WowsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WowsModVariables.PlayerVariables())).ms + "%";
	}
}

package net.mcreator.wows.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.wows.network.WowsModVariables;

public class EuiZhiShuZhi112Procedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "\u7075\u529B\u6062\u590D:" + (entity.getCapability(WowsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WowsModVariables.PlayerVariables())).llhf;
	}
}

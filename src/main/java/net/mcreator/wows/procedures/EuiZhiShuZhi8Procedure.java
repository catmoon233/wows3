package net.mcreator.wows.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.wows.network.WowsModVariables;

public class EuiZhiShuZhi8Procedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "\u6218\u6597\u529B:" + (entity.getCapability(WowsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WowsModVariables.PlayerVariables())).zdl;
	}
}

package net.mcreator.wows.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.wows.network.WowsModVariables;

public class EuiZhiShuZhi26Procedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "\u4F53\u529B\u6D88\u8017:" + (entity.getCapability(WowsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WowsModVariables.PlayerVariables())).tlxh;
	}
}

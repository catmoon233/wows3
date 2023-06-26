package net.mcreator.wows.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.wows.network.WowsModVariables;

public class EuiZhiShuZhidangqianjingyanProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "\u5F53\u524D\u7ECF\u9A8C:" + (entity.getCapability(WowsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WowsModVariables.PlayerVariables())).levernow;
	}
}

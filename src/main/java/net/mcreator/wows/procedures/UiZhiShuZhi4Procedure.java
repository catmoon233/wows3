package net.mcreator.wows.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.wows.network.WowsModVariables;

public class UiZhiShuZhi4Procedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return (entity.getCapability(WowsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WowsModVariables.PlayerVariables())).llnow2 + "/" + entity.getPersistentData().getDouble("ll");
	}
}

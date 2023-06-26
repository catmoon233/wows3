package net.mcreator.wows.procedures;

import net.minecraft.world.entity.Entity;

public class EuiZhiShuZhi3Procedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "\u6700\u5927\u8840\u91CF\u4E0A\u9650:" + entity.getPersistentData().getDouble("healthmax");
	}
}

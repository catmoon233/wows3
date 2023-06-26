package net.mcreator.wows.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;

import net.mcreator.wows.network.WowsModVariables;
import net.mcreator.wows.init.WowsModItems;

public class SclwProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			ItemStack _setval = new ItemStack(WowsModItems.AK.get());
			entity.getCapability(WowsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.lw1 = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = 1;
			entity.getCapability(WowsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.lw1zt = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}

package net.mcreator.wows.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;

import net.mcreator.wows.network.WowsModVariables;
import net.mcreator.wows.WowsMod;

public class JipaoSongKaiAnJianShiProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(MobEffects.MOVEMENT_SPEED);
		{
			boolean _setval = false;
			entity.getCapability(WowsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.tlxh2 = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		WowsMod.queueServerWork(100, () -> {
			if ((entity.getCapability(WowsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WowsModVariables.PlayerVariables())).tlxh2 == false) {
				{
					boolean _setval = true;
					entity.getCapability(WowsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tlhfs = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		});
	}
}

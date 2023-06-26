package net.mcreator.wows.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.wows.network.WowsModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class GjxtProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(Entity entity, Entity sourceentity) {
		execute(null, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if ((entity.getCapability(WowsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WowsModVariables.PlayerVariables())).playersx == 3) {
			if ((sourceentity.getCapability(WowsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WowsModVariables.PlayerVariables())).playersx == 3) {
				if (entity instanceof LivingEntity _entity)
					_entity.setHealth(20);
				if (entity.getPersistentData().getDouble("gjshfs") == 0) {
					entity.getPersistentData().putDouble("gjsh", ((entity.getCapability(WowsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WowsModVariables.PlayerVariables())).ak));
					GjxtpdProcedure.execute(entity);
					entity.getPersistentData().putDouble("gjsh", 0);
				}
				if (entity.getPersistentData().getDouble("gjshfs") != 0) {
					entity.getPersistentData().putDouble("gjsh", (entity.getPersistentData().getDouble("gjshfs")));
					GjxtpdProcedure.execute(entity);
					entity.getPersistentData().putDouble("gjsh", 0);
					entity.getPersistentData().putDouble("gjshfs", 0);
				}
			}
		}
	}
}

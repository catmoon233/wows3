package net.mcreator.wows.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.Component;

import net.mcreator.wows.network.WowsModVariables;
import net.mcreator.wows.WowsMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class Fwczt2Procedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level, event.player);
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDouble("fwczt") == 1) {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(
						Component.literal(("\u5F53\u524D\u953B\u70BC\u5206\u6570\uFF1A" + entity.getPersistentData().getDouble("fwcfs") + "\u5F53\u524D\u953B\u70BC\u72B6\u6001\uFF1A" + entity.getPersistentData().getDouble("fwccs"))), true);
			if (entity.getPersistentData().getDouble("fwcst") == 1) {
				if (entity.getPersistentData().getDouble("fwccs") < 1) {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal(("\u4FEE\u70BC\u7ED3\u675F\uFF0C\u5206\u6570\u4E3A\uFF1A" + entity.getPersistentData().getDouble("fwcfs"))), false);
					{
						double _setval = (entity.getCapability(WowsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WowsModVariables.PlayerVariables())).liliang + entity.getPersistentData().getDouble("fwcfs");
						entity.getCapability(WowsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.liliang = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					entity.getPersistentData().putDouble("fwcfs", 0);
					entity.getPersistentData().putDouble("fwccs2", 1);
					entity.getPersistentData().putDouble("fwccs", 0);
					entity.getPersistentData().putDouble("fwczt", 0);
					entity.getPersistentData().putDouble("fwcst", 0);
				}
			}
			{
				Entity _ent = entity;
				_ent.teleportTo((entity.getPersistentData().getDouble("xz")), (entity.getPersistentData().getDouble("yz")), (entity.getPersistentData().getDouble("zz")));
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport((entity.getPersistentData().getDouble("xz")), (entity.getPersistentData().getDouble("yz")), (entity.getPersistentData().getDouble("zz")), _ent.getYRot(), _ent.getXRot());
			}
			WowsMod.queueServerWork((int) (60 - 0.2 * entity.getPersistentData().getDouble("fwccs2") + 10 * 0.2 * entity.getPersistentData().getDouble("fwccs2")), () -> {
				if (entity.getPersistentData().getDouble("fwccs") > 0) {
					entity.getPersistentData().putDouble("fwccs", (entity.getPersistentData().getDouble("fwccs") - 1));
					entity.getPersistentData().putDouble("fwccs2", (entity.getPersistentData().getDouble("fwccs2") + 1));
				}
			});
		}
	}
}

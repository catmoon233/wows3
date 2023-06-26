package net.mcreator.wows.procedures;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.protocol.game.ClientboundUpdateMobEffectPacket;
import net.minecraft.network.protocol.game.ClientboundPlayerAbilitiesPacket;
import net.minecraft.network.protocol.game.ClientboundLevelEventPacket;
import net.minecraft.network.protocol.game.ClientboundGameEventPacket;
import net.minecraft.core.BlockPos;

import net.mcreator.wows.network.WowsModVariables;

public class C1lc3Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(WowsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WowsModVariables.PlayerVariables())).cssz == 0) {
			if (entity instanceof Player _player)
				_player.closeContainer();
			{
				double _setval = 1;
				entity.getCapability(WowsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.start = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if ((entity.getCapability(WowsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WowsModVariables.PlayerVariables())).cssz == 1) {
			if (entity instanceof Player _player)
				_player.closeContainer();
			if (((entity.getCapability(WowsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WowsModVariables.PlayerVariables())).wd).equals("surface")) {
				if (entity instanceof ServerPlayer _player && !_player.level.isClientSide()) {
					ResourceKey<Level> destinationType = Level.OVERWORLD;
					if (_player.level.dimension() == destinationType)
						return;
					ServerLevel nextLevel = _player.server.getLevel(destinationType);
					if (nextLevel != null) {
						_player.connection.send(new ClientboundGameEventPacket(ClientboundGameEventPacket.WIN_GAME, 0));
						_player.teleportTo(nextLevel, _player.getX(), _player.getY(), _player.getZ(), _player.getYRot(), _player.getXRot());
						_player.connection.send(new ClientboundPlayerAbilitiesPacket(_player.getAbilities()));
						for (MobEffectInstance _effectinstance : _player.getActiveEffects())
							_player.connection.send(new ClientboundUpdateMobEffectPacket(_player.getId(), _effectinstance));
						_player.connection.send(new ClientboundLevelEventPacket(1032, BlockPos.ZERO, 0, false));
					}
				}
			}
			if (((entity.getCapability(WowsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WowsModVariables.PlayerVariables())).wd).equals("nether")) {
				if (entity instanceof ServerPlayer _player && !_player.level.isClientSide()) {
					ResourceKey<Level> destinationType = Level.NETHER;
					if (_player.level.dimension() == destinationType)
						return;
					ServerLevel nextLevel = _player.server.getLevel(destinationType);
					if (nextLevel != null) {
						_player.connection.send(new ClientboundGameEventPacket(ClientboundGameEventPacket.WIN_GAME, 0));
						_player.teleportTo(nextLevel, _player.getX(), _player.getY(), _player.getZ(), _player.getYRot(), _player.getXRot());
						_player.connection.send(new ClientboundPlayerAbilitiesPacket(_player.getAbilities()));
						for (MobEffectInstance _effectinstance : _player.getActiveEffects())
							_player.connection.send(new ClientboundUpdateMobEffectPacket(_player.getId(), _effectinstance));
						_player.connection.send(new ClientboundLevelEventPacket(1032, BlockPos.ZERO, 0, false));
					}
				}
			}
			if (((entity.getCapability(WowsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WowsModVariables.PlayerVariables())).wd).equals("end")) {
				if (entity instanceof ServerPlayer _player && !_player.level.isClientSide()) {
					ResourceKey<Level> destinationType = Level.END;
					if (_player.level.dimension() == destinationType)
						return;
					ServerLevel nextLevel = _player.server.getLevel(destinationType);
					if (nextLevel != null) {
						_player.connection.send(new ClientboundGameEventPacket(ClientboundGameEventPacket.WIN_GAME, 0));
						_player.teleportTo(nextLevel, _player.getX(), _player.getY(), _player.getZ(), _player.getYRot(), _player.getXRot());
						_player.connection.send(new ClientboundPlayerAbilitiesPacket(_player.getAbilities()));
						for (MobEffectInstance _effectinstance : _player.getActiveEffects())
							_player.connection.send(new ClientboundUpdateMobEffectPacket(_player.getId(), _effectinstance));
						_player.connection.send(new ClientboundLevelEventPacket(1032, BlockPos.ZERO, 0, false));
					}
				}
			}
			if (((entity.getCapability(WowsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WowsModVariables.PlayerVariables())).wd).equals("w")) {
				if (entity instanceof ServerPlayer _player && !_player.level.isClientSide()) {
					ResourceKey<Level> destinationType = Level.OVERWORLD;
					if (_player.level.dimension() == destinationType)
						return;
					ServerLevel nextLevel = _player.server.getLevel(destinationType);
					if (nextLevel != null) {
						_player.connection.send(new ClientboundGameEventPacket(ClientboundGameEventPacket.WIN_GAME, 0));
						_player.teleportTo(nextLevel, _player.getX(), _player.getY(), _player.getZ(), _player.getYRot(), _player.getXRot());
						_player.connection.send(new ClientboundPlayerAbilitiesPacket(_player.getAbilities()));
						for (MobEffectInstance _effectinstance : _player.getActiveEffects())
							_player.connection.send(new ClientboundUpdateMobEffectPacket(_player.getId(), _effectinstance));
						_player.connection.send(new ClientboundLevelEventPacket(1032, BlockPos.ZERO, 0, false));
					}
				}
			}
			{
				Entity _ent = entity;
				_ent.teleportTo(((entity.getCapability(WowsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WowsModVariables.PlayerVariables())).xz1),
						((entity.getCapability(WowsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WowsModVariables.PlayerVariables())).xz2),
						((entity.getCapability(WowsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WowsModVariables.PlayerVariables())).xz3));
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport(((entity.getCapability(WowsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WowsModVariables.PlayerVariables())).xz1),
							((entity.getCapability(WowsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WowsModVariables.PlayerVariables())).xz2),
							((entity.getCapability(WowsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WowsModVariables.PlayerVariables())).xz3), _ent.getYRot(), _ent.getXRot());
			}
		}
	}
}

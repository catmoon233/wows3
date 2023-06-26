package net.mcreator.wows.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.EntityDamageSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.wows.network.WowsModVariables;
import net.mcreator.wows.init.WowsModItems;
import net.mcreator.wows.WowsMod;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class Lmgl2DangYouJianDianJiKongQiShiShiTiDeWeiZhiProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(120 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, 1000, 1));
				{
					Entity _ent = entityiterator;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "");
					}
				}
				if (entityiterator instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("\u00A74\u6B7B\u671F\u5DF2\u81F3"), false);
			}
		}
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(itemstack.getItem(), 100);
		WowsMod.queueServerWork(20, () -> {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.SONIC_BOOM, x, y, z, 5, x, (y + 20), z, 1);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.SONIC_BOOM, (x + 3), y, (z + 3), 30, x, (y + 20), z, 1);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.SONIC_BOOM, (x + 0), y, (z + 3), 15, x, (y + 20), z, 1);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.SONIC_BOOM, (x + 3), y, (z + 0), 15, x, (y + 20), z, 1);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.SONIC_BOOM, (x - 3), y, (z + 3), 15, x, (y + 20), z, 1);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.SONIC_BOOM, (x + 3), y, (z - 3), 15, x, (y + 20), z, 1);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.SONIC_BOOM, (x - 3), y, (z - 3), 15, x, (y + 20), z, 1);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.SONIC_BOOM, (x + 0), y, (z - 3), 15, x, (y + 20), z, 1);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.SONIC_BOOM, (x - 3), y, (z - 0), 15, x, (y + 20), z, 1);
		});
		WowsMod.queueServerWork(40, () -> {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.SONIC_BOOM, x, y, z, 5, x, (y + 20), z, 1);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.SONIC_BOOM, (x + 3), y, (z + 3), 15, x, (y + 20), z, 1);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.SONIC_BOOM, (x + 0), y, (z + 3), 15, x, (y + 20), z, 1);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.SONIC_BOOM, (x + 3), y, (z + 0), 15, x, (y + 20), z, 1);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.SONIC_BOOM, (x - 3), y, (z + 3), 15, x, (y + 20), z, 1);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.SONIC_BOOM, (x + 3), y, (z - 3), 15, x, (y + 20), z, 1);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.SONIC_BOOM, (x - 3), y, (z - 3), 15, x, (y + 20), z, 1);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.SONIC_BOOM, (x + 0), y, (z - 3), 15, x, (y + 20), z, 1);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.SONIC_BOOM, (x - 3), y, (z - 0), 15, x, (y + 20), z, 1);
		});
		WowsMod.queueServerWork(60, () -> {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.SONIC_BOOM, x, y, z, 5, x, (y + 20), z, 1);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.SONIC_BOOM, (x + 3), y, (z + 3), 15, x, (y + 20), z, 1);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.SONIC_BOOM, (x + 0), y, (z + 3), 15, x, (y + 20), z, 1);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.SONIC_BOOM, (x + 3), y, (z + 0), 15, x, (y + 20), z, 1);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.SONIC_BOOM, (x - 3), y, (z + 3), 15, x, (y + 20), z, 1);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.SONIC_BOOM, (x + 3), y, (z - 3), 15, x, (y + 20), z, 1);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.SONIC_BOOM, (x - 3), y, (z - 3), 15, x, (y + 20), z, 1);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.SONIC_BOOM, (x + 0), y, (z - 3), 15, x, (y + 20), z, 1);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.SONIC_BOOM, (x - 3), y, (z - 0), 15, x, (y + 20), z, 1);
		});
		WowsMod.queueServerWork(80, () -> {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.SONIC_BOOM, x, y, z, 5, x, (y + 20), z, 1);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.SONIC_BOOM, (x + 3), y, (z + 3), 15, x, (y + 20), z, 1);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.SONIC_BOOM, (x + 0), y, (z + 3), 15, x, (y + 20), z, 1);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.SONIC_BOOM, (x + 3), y, (z + 0), 15, x, (y + 20), z, 1);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.SONIC_BOOM, (x - 3), y, (z + 3), 15, x, (y + 20), z, 1);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.SONIC_BOOM, (x + 3), y, (z - 3), 15, x, (y + 20), z, 1);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.SONIC_BOOM, (x - 3), y, (z - 3), 15, x, (y + 20), z, 1);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.SONIC_BOOM, (x + 0), y, (z - 3), 15, x, (y + 20), z, 1);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.SONIC_BOOM, (x - 3), y, (z - 0), 15, x, (y + 20), z, 1);
		});
		WowsMod.queueServerWork(100, () -> {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.SONIC_BOOM, x, y, z, 5, x, (y + 20), z, 1);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.SONIC_BOOM, (x + 3), y, (z + 3), 15, x, (y + 20), z, 1);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.SONIC_BOOM, (x + 0), y, (z + 3), 15, x, (y + 20), z, 1);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.SONIC_BOOM, (x + 3), y, (z + 0), 15, x, (y + 20), z, 1);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.SONIC_BOOM, (x - 3), y, (z + 3), 15, x, (y + 20), z, 1);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.SONIC_BOOM, (x + 3), y, (z - 3), 15, x, (y + 20), z, 1);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.SONIC_BOOM, (x - 3), y, (z - 3), 15, x, (y + 20), z, 1);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.SONIC_BOOM, (x + 0), y, (z - 3), 15, x, (y + 20), z, 1);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.SONIC_BOOM, (x - 3), y, (z - 0), 15, x, (y + 20), z, 1);
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(100 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
						.collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("\u00A74\u6B7B\u671F\u5DF2\u81F3"), false);
					if (!(entityiterator instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(WowsModItems.LMGL_2.get())) : false)) {
						if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 120, 1, false, false));
						if (world instanceof Level _level && !_level.isClientSide())
							_level.explode(null, (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 5, Explosion.BlockInteraction.NONE);
						entityiterator.hurt((new EntityDamageSource("player", entity)), (float) ((entity.getCapability(WowsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WowsModVariables.PlayerVariables())).ak * 5));
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.END_ROD, (entityiterator.getX()), (entityiterator.getY() - 10), (entityiterator.getZ()), 20, (entityiterator.getX()), (entityiterator.getY() + 10), (entityiterator.getZ()), 1);
						entityiterator.setDeltaMovement(new Vec3(0, 1, 0));
					}
				}
			}
		});
		WowsMod.queueServerWork(110, () -> {
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(100 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
						.collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("\u00A74\u6B7B\u671F\u5DF2\u81F3"), false);
					if (!(entityiterator instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(WowsModItems.LMGL_2.get())) : false)) {
						if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 120, 1, false, false));
						entityiterator.hurt((new EntityDamageSource("player", entity)), (float) ((entity.getCapability(WowsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WowsModVariables.PlayerVariables())).ak * 5));
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.END_ROD, (entityiterator.getX()), (entityiterator.getY() - 10), (entityiterator.getZ()), 20, (entityiterator.getX()), (entityiterator.getY() + 10), (entityiterator.getZ()), 1);
						entityiterator.setDeltaMovement(new Vec3(0, 1, 0));
					}
				}
			}
		});
		WowsMod.queueServerWork(120, () -> {
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(100 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
						.collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("\u00A74\u6B7B\u671F\u5DF2\u81F3"), false);
					if (!(entityiterator instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(WowsModItems.LMGL_2.get())) : false)) {
						if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 120, 1, false, false));
						entityiterator.hurt((new EntityDamageSource("player", entity)), (float) ((entity.getCapability(WowsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WowsModVariables.PlayerVariables())).ak * 5));
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.END_ROD, (entityiterator.getX()), (entityiterator.getY() - 10), (entityiterator.getZ()), 20, (entityiterator.getX()), (entityiterator.getY() + 10), (entityiterator.getZ()), 1);
						entityiterator.setDeltaMovement(new Vec3(0, 1, 0));
					}
				}
			}
		});
		WowsMod.queueServerWork(140, () -> {
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(100 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
						.collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("\u00A74\u6B7B\u671F\u5DF2\u81F3"), false);
					if (!(entityiterator instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(WowsModItems.LMGL_2.get())) : false)) {
						if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 120, 1, false, false));
						entityiterator.hurt((new EntityDamageSource("player", entity)), (float) ((entity.getCapability(WowsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WowsModVariables.PlayerVariables())).ak * 5));
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.END_ROD, (entityiterator.getX()), (entityiterator.getY() - 10), (entityiterator.getZ()), 20, (entityiterator.getX()), (entityiterator.getY() + 10), (entityiterator.getZ()), 1);
						entityiterator.setDeltaMovement(new Vec3(0, 1, 0));
					}
				}
			}
		});
		WowsMod.queueServerWork(160, () -> {
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(100 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
						.collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("\u00A74\u6B7B\u671F\u5DF2\u81F3"), false);
					if (!(entityiterator instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(WowsModItems.LMGL_2.get())) : false)) {
						if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 120, 1, false, false));
						entityiterator.hurt((new EntityDamageSource("player", entity)), (float) ((entity.getCapability(WowsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WowsModVariables.PlayerVariables())).ak * 5));
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.END_ROD, (entityiterator.getX()), (entityiterator.getY() - 10), (entityiterator.getZ()), 20, (entityiterator.getX()), (entityiterator.getY() + 10), (entityiterator.getZ()), 1);
						entityiterator.setDeltaMovement(new Vec3(0, 1, 0));
					}
				}
			}
		});
	}
}

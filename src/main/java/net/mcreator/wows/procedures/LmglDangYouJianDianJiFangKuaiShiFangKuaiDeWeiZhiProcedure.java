package net.mcreator.wows.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.EntityDamageSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.wows.network.WowsModVariables;
import net.mcreator.wows.init.WowsModItems;
import net.mcreator.wows.WowsMod;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class LmglDangYouJianDianJiFangKuaiShiFangKuaiDeWeiZhiProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double za = 0;
		double ya = 0;
		double xa = 0;
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(itemstack.getItem(), 100);
		WowsMod.queueServerWork(1, () -> {
			entity.setDeltaMovement(new Vec3(0, 2, 0));
		});
		WowsMod.queueServerWork(20, () -> {
			{
				Entity _ent = entity;
				_ent.teleportTo((entity.getX()), (entity.getZ()), (entity.getY()));
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport((entity.getX()), (entity.getZ()), (entity.getY()), _ent.getYRot(), _ent.getXRot());
			}
			world.addParticle(ParticleTypes.LAVA, x, y, z, 1, 1, 0);
			world.addParticle(ParticleTypes.LAVA, x, y, z, 0, 1, 1);
			world.addParticle(ParticleTypes.LAVA, x, y, z, 1, 1, 1);
			world.addParticle(ParticleTypes.LAVA, x, y, z, (-1), 1, 1);
			world.addParticle(ParticleTypes.LAVA, x, y, z, 1, 1, (-1));
			world.addParticle(ParticleTypes.LAVA, x, y, z, (-1), 1, (-1));
			world.addParticle(ParticleTypes.LAVA, x, y, z, (-1), 1, 0);
			world.addParticle(ParticleTypes.LAVA, x, y, z, 0, 1, (-1));
		});
		WowsMod.queueServerWork(40, () -> {
			{
				Entity _ent = entity;
				_ent.teleportTo((entity.getX()), (entity.getZ()), (entity.getY()));
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport((entity.getX()), (entity.getZ()), (entity.getY()), _ent.getYRot(), _ent.getXRot());
			}
			world.addParticle(ParticleTypes.LAVA, x, y, z, 1, 1, 0);
			world.addParticle(ParticleTypes.LAVA, x, y, z, 0, 1, 1);
			world.addParticle(ParticleTypes.LAVA, x, y, z, 1, 1, 1);
			world.addParticle(ParticleTypes.LAVA, x, y, z, (-1), 1, 1);
			world.addParticle(ParticleTypes.LAVA, x, y, z, 1, 1, (-1));
			world.addParticle(ParticleTypes.LAVA, x, y, z, (-1), 1, (-1));
			world.addParticle(ParticleTypes.LAVA, x, y, z, (-1), 1, 0);
			world.addParticle(ParticleTypes.LAVA, x, y, z, 0, 1, (-1));
		});
		WowsMod.queueServerWork(60, () -> {
			{
				Entity _ent = entity;
				_ent.teleportTo((entity.getX()), (entity.getZ()), (entity.getY()));
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport((entity.getX()), (entity.getZ()), (entity.getY()), _ent.getYRot(), _ent.getXRot());
			}
			world.addParticle(ParticleTypes.LAVA, x, y, z, 1, 1, 0);
			world.addParticle(ParticleTypes.LAVA, x, y, z, 0, 1, 1);
			world.addParticle(ParticleTypes.LAVA, x, y, z, 1, 1, 1);
			world.addParticle(ParticleTypes.LAVA, x, y, z, (-1), 1, 1);
			world.addParticle(ParticleTypes.LAVA, x, y, z, 1, 1, (-1));
			world.addParticle(ParticleTypes.LAVA, x, y, z, (-1), 1, (-1));
			world.addParticle(ParticleTypes.LAVA, x, y, z, (-1), 1, 0);
			world.addParticle(ParticleTypes.LAVA, x, y, z, 0, 1, (-1));
		});
		WowsMod.queueServerWork(60, () -> {
			{
				Entity _ent = entity;
				_ent.teleportTo((entity.getX()), (entity.getZ()), (entity.getY()));
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport((entity.getX()), (entity.getZ()), (entity.getY()), _ent.getYRot(), _ent.getXRot());
			}
			world.addParticle(ParticleTypes.LAVA, x, y, z, 10, 1, 0);
			world.addParticle(ParticleTypes.LAVA, x, y, z, 0, 1, 10);
			world.addParticle(ParticleTypes.LAVA, x, y, z, 10, 1, 10);
			world.addParticle(ParticleTypes.LAVA, x, y, z, (-10), 1, 10);
			world.addParticle(ParticleTypes.LAVA, x, y, z, 10, 1, (-10));
			world.addParticle(ParticleTypes.LAVA, x, y, z, (-10), 1, (-10));
			world.addParticle(ParticleTypes.LAVA, x, y, z, (-10), 1, 0);
			world.addParticle(ParticleTypes.LAVA, x, y, z, 0, 1, (-10));
		});
		WowsMod.queueServerWork(40, () -> {
			{
				Entity _ent = entity;
				_ent.teleportTo((entity.getX()), (entity.getZ()), (entity.getY()));
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport((entity.getX()), (entity.getZ()), (entity.getY()), _ent.getYRot(), _ent.getXRot());
			}
			world.addParticle(ParticleTypes.LAVA, x, y, z, 10, 1, 0);
			world.addParticle(ParticleTypes.LAVA, x, y, z, 0, 1, 10);
			world.addParticle(ParticleTypes.LAVA, x, y, z, 10, 1, 10);
			world.addParticle(ParticleTypes.LAVA, x, y, z, (-10), 1, 10);
			world.addParticle(ParticleTypes.LAVA, x, y, z, 10, 1, (-10));
			world.addParticle(ParticleTypes.LAVA, x, y, z, (-10), 1, (-10));
			world.addParticle(ParticleTypes.LAVA, x, y, z, (-10), 1, 0);
			world.addParticle(ParticleTypes.LAVA, x, y, z, 0, 1, (-10));
		});
		WowsMod.queueServerWork(20, () -> {
			{
				Entity _ent = entity;
				_ent.teleportTo((entity.getX()), (entity.getZ()), (entity.getY()));
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport((entity.getX()), (entity.getZ()), (entity.getY()), _ent.getYRot(), _ent.getXRot());
			}
			world.addParticle(ParticleTypes.LAVA, x, y, z, 10, 1, 0);
			world.addParticle(ParticleTypes.LAVA, x, y, z, 0, 1, 10);
			world.addParticle(ParticleTypes.LAVA, x, y, z, 10, 1, 10);
			world.addParticle(ParticleTypes.LAVA, x, y, z, (-10), 1, 10);
			world.addParticle(ParticleTypes.LAVA, x, y, z, 10, 1, (-10));
			world.addParticle(ParticleTypes.LAVA, x, y, z, (-10), 1, (-10));
			world.addParticle(ParticleTypes.LAVA, x, y, z, (-10), 1, 0);
			world.addParticle(ParticleTypes.LAVA, x, y, z, 0, 1, (-10));
		});
		WowsMod.queueServerWork(80, () -> {
			{
				Entity _ent = entity;
				_ent.teleportTo((entity.getX()), (entity.getZ()), (entity.getY()));
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport((entity.getX()), (entity.getZ()), (entity.getY()), _ent.getYRot(), _ent.getXRot());
			}
			world.addParticle(ParticleTypes.LAVA, x, y, z, 10, 1, 0);
			world.addParticle(ParticleTypes.LAVA, x, y, z, 0, 1, 10);
			world.addParticle(ParticleTypes.LAVA, x, y, z, 10, 1, 10);
			world.addParticle(ParticleTypes.LAVA, x, y, z, (-10), 1, 10);
			world.addParticle(ParticleTypes.LAVA, x, y, z, 10, 1, (-10));
			world.addParticle(ParticleTypes.LAVA, x, y, z, (-10), 1, (-10));
			world.addParticle(ParticleTypes.LAVA, x, y, z, (-10), 1, 0);
			world.addParticle(ParticleTypes.LAVA, x, y, z, 0, 1, (-10));
		});
		WowsMod.queueServerWork(100, () -> {
			{
				Entity _ent = entity;
				_ent.teleportTo((entity.getX()), (entity.getZ()), (entity.getY()));
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport((entity.getX()), (entity.getZ()), (entity.getY()), _ent.getYRot(), _ent.getXRot());
			}
			world.addParticle(ParticleTypes.LAVA, x, y, z, 10, 1, 0);
			world.addParticle(ParticleTypes.LAVA, x, y, z, 0, 1, 10);
			world.addParticle(ParticleTypes.LAVA, x, y, z, 10, 1, 10);
			world.addParticle(ParticleTypes.LAVA, x, y, z, (-10), 1, 10);
			world.addParticle(ParticleTypes.LAVA, x, y, z, 10, 1, (-10));
			world.addParticle(ParticleTypes.LAVA, x, y, z, (-10), 1, (-10));
			world.addParticle(ParticleTypes.LAVA, x, y, z, (-10), 1, 0);
			world.addParticle(ParticleTypes.LAVA, x, y, z, 0, 1, (-10));
		});
		WowsMod.queueServerWork(100, () -> {
			{
				Entity _ent = entity;
				_ent.teleportTo((entity.getX()), (entity.getZ()), (entity.getY()));
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport((entity.getX()), (entity.getZ()), (entity.getY()), _ent.getYRot(), _ent.getXRot());
			}
			world.addParticle(ParticleTypes.LAVA, x, y, z, 10, 1, 0);
			world.addParticle(ParticleTypes.LAVA, x, y, z, 0, 1, 10);
			world.addParticle(ParticleTypes.LAVA, x, y, z, 10, 1, 10);
			world.addParticle(ParticleTypes.LAVA, x, y, z, (-10), 1, 10);
			world.addParticle(ParticleTypes.LAVA, x, y, z, 10, 1, (-10));
			world.addParticle(ParticleTypes.LAVA, x, y, z, (-10), 1, (-10));
			world.addParticle(ParticleTypes.LAVA, x, y, z, (-10), 1, 0);
			world.addParticle(ParticleTypes.LAVA, x, y, z, 0, 1, (-10));
		});
		WowsMod.queueServerWork(120, () -> {
			{
				Entity _ent = entity;
				_ent.teleportTo((entity.getX()), (entity.getZ()), (entity.getY()));
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport((entity.getX()), (entity.getZ()), (entity.getY()), _ent.getYRot(), _ent.getXRot());
			}
			world.addParticle(ParticleTypes.LAVA, x, y, z, 10, 1, 0);
			world.addParticle(ParticleTypes.LAVA, x, y, z, 0, 1, 10);
			world.addParticle(ParticleTypes.LAVA, x, y, z, 10, 1, 10);
			world.addParticle(ParticleTypes.LAVA, x, y, z, (-10), 1, 10);
			world.addParticle(ParticleTypes.LAVA, x, y, z, 10, 1, (-10));
			world.addParticle(ParticleTypes.LAVA, x, y, z, (-10), 1, (-10));
			world.addParticle(ParticleTypes.LAVA, x, y, z, (-10), 1, 0);
			world.addParticle(ParticleTypes.LAVA, x, y, z, 0, 1, (-10));
		});
		WowsMod.queueServerWork(140, () -> {
			for (int index0 = 0; index0 < 3; index0++) {
				if (world instanceof ServerLevel _level) {
					LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
					entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(x, y, z)));
					entityToSpawn.setVisualOnly(false);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(40 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
						.collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (!(entityiterator instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(WowsModItems.LMGL.get())) : false)) {
						{
							Entity _ent = entityiterator;
							_ent.teleportTo(x, y, z);
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport(x, y, z, _ent.getYRot(), _ent.getXRot());
						}
						if (world instanceof ServerLevel _level) {
							LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
							entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(x, y, z)));
							entityToSpawn.setVisualOnly(false);
							_level.addFreshEntity(entityToSpawn);
						}
						if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 240, 255, false, false));
						if (world instanceof Level _level && !_level.isClientSide())
							_level.explode(null, (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 20, Explosion.BlockInteraction.NONE);
						if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.LUCK, 60, 1, false, false));
						entity.getPersistentData().putDouble("zjdsh", ((entity.getCapability(WowsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WowsModVariables.PlayerVariables())).ak * 100));
						entityiterator.hurt((new EntityDamageSource("generic.player", entity)), 1);
					}
				}
			}
		});
	}
}

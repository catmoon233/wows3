package net.mcreator.wows.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.wows.init.WowsModItems;
import net.mcreator.wows.WowsMod;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class PaotaiDangYouJianDianJiKongQiShiShiTiDeWeiZhiProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(40 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (!((entityiterator instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == WowsModItems.PAOTAI.get())) {
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.END_ROD, x, y, z, 20, (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 1);
					WowsMod.queueServerWork(60, () -> {
						entityiterator.hurt((new DamageSource("generic")), 1);
					});
				}
			}
		}
	}
}

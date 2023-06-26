package net.mcreator.wows.procedures;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.Entity;

import net.mcreator.wows.init.WowsModEntities;
import net.mcreator.wows.entity.FbEntity;

public class FbDangTouSheWuSheZhongCiFangKuaiProcedure {
	public static void execute(Entity entity, Entity immediatesourceentity) {
		if (entity == null || immediatesourceentity == null)
			return;
		if (!entity.level.isClientSide())
			entity.discard();
		{
			Entity _shootFrom = immediatesourceentity;
			Level projectileLevel = _shootFrom.level;
			if (!projectileLevel.isClientSide()) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
						AbstractArrow entityToSpawn = new FbEntity(WowsModEntities.FB.get(), level);
						entityToSpawn.setOwner(shooter);
						entityToSpawn.setBaseDamage(damage);
						entityToSpawn.setKnockback(knockback);
						entityToSpawn.setSilent(true);
						entityToSpawn.setSecondsOnFire(100);
						entityToSpawn.setCritArrow(true);
						entityToSpawn.pickup = AbstractArrow.Pickup.ALLOWED;
						return entityToSpawn;
					}
				}.getArrow(projectileLevel, immediatesourceentity, 0, 0);
				_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
				_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, (float) 0.2, 0);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
		}
	}
}

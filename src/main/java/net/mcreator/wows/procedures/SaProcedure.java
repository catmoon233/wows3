package net.mcreator.wows.procedures;

import net.minecraft.world.scores.criteria.ObjectiveCriteria;
import net.minecraft.world.scores.Scoreboard;
import net.minecraft.world.scores.Objective;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.network.chat.Component;

public class SaProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			Entity _ent = entity;
			Scoreboard _sc = _ent.getLevel().getScoreboard();
			Objective _so = _sc.getObjective("playersx");
			if (_so == null)
				_so = _sc.addObjective("playersx", ObjectiveCriteria.DUMMY, Component.literal("playersx"), ObjectiveCriteria.RenderType.INTEGER);
			_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore(2);
		}
		entity.getPersistentData().putDouble("nx", (Mth.nextInt(RandomSource.create(), 1, 1000000)));
		{
			Entity _ent = entity;
			Scoreboard _sc = _ent.getLevel().getScoreboard();
			Objective _so = _sc.getObjective("ak");
			if (_so == null)
				_so = _sc.addObjective("ak", ObjectiveCriteria.DUMMY, Component.literal("ak"), ObjectiveCriteria.RenderType.INTEGER);
			_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore((int) Math.round((entity.getPersistentData().getDouble("nx") * 0.25) / 2));
		}
		{
			Entity _ent = entity;
			Scoreboard _sc = _ent.getLevel().getScoreboard();
			Objective _so = _sc.getObjective("fy");
			if (_so == null)
				_so = _sc.addObjective("fy", ObjectiveCriteria.DUMMY, Component.literal("fy"), ObjectiveCriteria.RenderType.INTEGER);
			_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore((int) Math.round(entity.getPersistentData().getDouble("nx") * 0.055));
		}
		{
			Entity _ent = entity;
			Scoreboard _sc = _ent.getLevel().getScoreboard();
			Objective _so = _sc.getObjective("healthmax");
			if (_so == null)
				_so = _sc.addObjective("healthmax", ObjectiveCriteria.DUMMY, Component.literal("healthmax"), ObjectiveCriteria.RenderType.INTEGER);
			_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore((int) Math.round(entity.getPersistentData().getDouble("nx") * 0.25 * 30));
		}
		{
			Entity _ent = entity;
			Scoreboard _sc = _ent.getLevel().getScoreboard();
			Objective _so = _sc.getObjective("healthnow");
			if (_so == null)
				_so = _sc.addObjective("healthnow", ObjectiveCriteria.DUMMY, Component.literal("healthnow"), ObjectiveCriteria.RenderType.INTEGER);
			_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore(new Object() {
				public int getScore(String score, Entity _ent) {
					Scoreboard _sc = _ent.getLevel().getScoreboard();
					Objective _so = _sc.getObjective(score);
					if (_so != null)
						return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
					return 0;
				}
			}.getScore("healthmax", entity));
		}
		{
			Entity _ent = entity;
			Scoreboard _sc = _ent.getLevel().getScoreboard();
			Objective _so = _sc.getObjective("hdz");
			if (_so == null)
				_so = _sc.addObjective("hdz", ObjectiveCriteria.DUMMY, Component.literal("hdz"), ObjectiveCriteria.RenderType.INTEGER);
			_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore(10000);
		}
		{
			Entity _ent = entity;
			Scoreboard _sc = _ent.getLevel().getScoreboard();
			Objective _so = _sc.getObjective("healthj");
			if (_so == null)
				_so = _sc.addObjective("healthj", ObjectiveCriteria.DUMMY, Component.literal("healthj"), ObjectiveCriteria.RenderType.INTEGER);
			_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore(0);
		}
		{
			Entity _ent = entity;
			Scoreboard _sc = _ent.getLevel().getScoreboard();
			Objective _so = _sc.getObjective("hdznow2");
			if (_so == null)
				_so = _sc.addObjective("hdznow2", ObjectiveCriteria.DUMMY, Component.literal("hdznow2"), ObjectiveCriteria.RenderType.INTEGER);
			_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore(10000);
		}
		{
			Entity _ent = entity;
			Scoreboard _sc = _ent.getLevel().getScoreboard();
			Objective _so = _sc.getObjective("hdzhf");
			if (_so == null)
				_so = _sc.addObjective("hdzhf", ObjectiveCriteria.DUMMY, Component.literal("hdzhf"), ObjectiveCriteria.RenderType.INTEGER);
			_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore(400);
		}
		entity.setCustomName(Component.literal((entity.getPersistentData().getDouble("nx") + "\u00A76\u5E74\u566C\u91D1\u767D\u864E")));
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.HEAL, 40, 10));
	}
}

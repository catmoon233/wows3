package net.mcreator.wows.procedures;

import net.minecraft.world.scores.criteria.ObjectiveCriteria;
import net.minecraft.world.scores.Scoreboard;
import net.minecraft.world.scores.Objective;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.arguments.MessageArgument;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.CommandSourceStack;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.DoubleArgumentType;

public class SxsetlcProcedure {
	public static void execute(CommandContext<CommandSourceStack> arguments) {
		{
			Entity _ent = (new Object() {
				public Entity getEntity() {
					try {
						return EntityArgument.getEntity(arguments, "mb");
					} catch (CommandSyntaxException e) {
						e.printStackTrace();
						return null;
					}
				}
			}.getEntity());
			Scoreboard _sc = _ent.getLevel().getScoreboard();
			Objective _so = _sc.getObjective((new Object() {
				public String getMessage() {
					try {
						return MessageArgument.getMessage(arguments, "sm").getString();
					} catch (CommandSyntaxException ignored) {
						return "";
					}
				}
			}).getMessage());
			if (_so == null)
				_so = _sc.addObjective((new Object() {
					public String getMessage() {
						try {
							return MessageArgument.getMessage(arguments, "sm").getString();
						} catch (CommandSyntaxException ignored) {
							return "";
						}
					}
				}).getMessage(), ObjectiveCriteria.DUMMY, Component.literal((new Object() {
					public String getMessage() {
						try {
							return MessageArgument.getMessage(arguments, "sm").getString();
						} catch (CommandSyntaxException ignored) {
							return "";
						}
					}
				}).getMessage()), ObjectiveCriteria.RenderType.INTEGER);
			_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore((int) DoubleArgumentType.getDouble(arguments, "nm"));
		}
	}
}

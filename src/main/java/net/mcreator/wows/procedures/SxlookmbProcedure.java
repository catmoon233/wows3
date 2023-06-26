package net.mcreator.wows.procedures;

import net.minecraft.world.scores.Scoreboard;
import net.minecraft.world.scores.Objective;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.arguments.MessageArgument;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.CommandSourceStack;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;

public class SxlookmbProcedure {
	public static void execute(CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player && !_player.level.isClientSide())
			_player.displayClientMessage(Component.literal(("" + (new Object() {
				public int getScore(String score, Entity _ent) {
					Scoreboard _sc = _ent.getLevel().getScoreboard();
					Objective _so = _sc.getObjective(score);
					if (_so != null)
						return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
					return 0;
				}
			}.getScore((new Object() {
				public String getMessage() {
					try {
						return MessageArgument.getMessage(arguments, "sm").getString();
					} catch (CommandSyntaxException ignored) {
						return "";
					}
				}
			}).getMessage(), (new Object() {
				public Entity getEntity() {
					try {
						return EntityArgument.getEntity(arguments, "mb");
					} catch (CommandSyntaxException e) {
						e.printStackTrace();
						return null;
					}
				}
			}.getEntity()))))), false);
	}
}

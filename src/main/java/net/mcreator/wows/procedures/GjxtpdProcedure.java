package net.mcreator.wows.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.network.chat.Component;

import net.mcreator.wows.network.WowsModVariables;

public class GjxtpdProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double sjs1 = 0;
		double sjs2 = 0;
		double sjs3 = 0;
		double shza = 0;
		sjs1 = Mth.nextInt(RandomSource.create(), 1, 100);
		sjs2 = Mth.nextInt(RandomSource.create(), 1, 100);
		sjs3 = Mth.nextInt(RandomSource.create(), 1, 100);
		if ((entity.getCapability(WowsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WowsModVariables.PlayerVariables())).shanbi >= sjs1) {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("\u5BF9\u65B9\u95EA\u907F\u4E86\u4F60\u4E00\u6B21\u4F24\u5BB3"), false);
		}
		if ((entity.getCapability(WowsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WowsModVariables.PlayerVariables())).shanbi <= sjs1) {
		}
	}
}

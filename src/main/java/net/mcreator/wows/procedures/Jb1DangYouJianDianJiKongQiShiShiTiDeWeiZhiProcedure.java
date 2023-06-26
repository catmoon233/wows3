package net.mcreator.wows.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.network.chat.Component;

import net.mcreator.wows.network.WowsModVariables;

public class Jb1DangYouJianDianJiKongQiShiShiTiDeWeiZhiProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double sa = 0;
		sa = Mth.nextInt(RandomSource.create(), 1, 3);
		if (sa != 3) {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("\u5438\u6536\u5931\u8D25"), false);
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 20, Explosion.BlockInteraction.NONE);
			(itemstack).shrink(1);
		}
		if (sa == 3) {
			(itemstack).shrink(1);
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("\u5438\u6536\u6210\u529F"), false);
			{
				double _setval = (entity.getCapability(WowsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WowsModVariables.PlayerVariables())).ak + itemstack.getOrCreateTag().getDouble("sh");
				entity.getCapability(WowsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.ak = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (entity.getCapability(WowsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WowsModVariables.PlayerVariables())).fy + itemstack.getOrCreateTag().getDouble("fy");
				entity.getCapability(WowsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.fy = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}

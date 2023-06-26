package net.mcreator.wows.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.network.chat.Component;

import net.mcreator.wows.init.WowsModItems;

public class UisDangShiTiBeiShaSiShiProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		ItemStack asw = ItemStack.EMPTY;
		double assx = 0;
		asw = new ItemStack(WowsModItems.JB_1.get());
		asw.getOrCreateTag().putDouble("nx", (entity.getPersistentData().getDouble("nx")));
		if (world instanceof Level _level && !_level.isClientSide()) {
			ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, asw);
			entityToSpawn.setPickUpDelay(10);
			_level.addFreshEntity(entityToSpawn);
		}
		if (assx == 0) {
			assx = 1;
			asw.getOrCreateTag().putDouble("sh", Math.round(asw.getOrCreateTag().getDouble("nx") * Mth.nextDouble(RandomSource.create(), 0.005, 0.03)));
			asw.getOrCreateTag().putDouble("sm", Math.round(asw.getOrCreateTag().getDouble("nx") * Mth.nextDouble(RandomSource.create(), 0.0095, 0.1)));
			asw.getOrCreateTag().putDouble("fy", Math.round(asw.getOrCreateTag().getDouble("nx") * Mth.nextDouble(RandomSource.create(), 0.005, 0.03)));
			(asw).setHoverName(Component.literal(("\u00A77\u653B\u51FB\u529B " + asw.getOrCreateTag().getDouble("sh") + "\u00A77\u9632\u5FA1 " + asw.getOrCreateTag().getDouble("fy") + "\u00A77\u8840\u91CF " + asw.getOrCreateTag().getDouble("sm")
					+ "\u00A77\u5E74\u9650 " + asw.getOrCreateTag().getDouble("nx"))));
		}
	}
}

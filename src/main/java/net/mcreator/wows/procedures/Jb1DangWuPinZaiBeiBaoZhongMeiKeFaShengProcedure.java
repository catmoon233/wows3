package net.mcreator.wows.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.network.chat.Component;

public class Jb1DangWuPinZaiBeiBaoZhongMeiKeFaShengProcedure {
	public static void execute(ItemStack itemstack) {
		ItemStack asw = ItemStack.EMPTY;
		double assx = 0;
		double sh = 0;
		double fy = 0;
		double sn = 0;
		if (assx == 0) {
			assx = 1;
			itemstack.getOrCreateTag().putDouble("sh", (itemstack.getOrCreateTag().getDouble("nx") * Mth.nextDouble(RandomSource.create(), 0.005, 0.03)));
			itemstack.getOrCreateTag().putDouble("sm", (itemstack.getOrCreateTag().getDouble("nx") * Mth.nextDouble(RandomSource.create(), 0.005, 0.03)));
			itemstack.getOrCreateTag().putDouble("fy", (itemstack.getOrCreateTag().getDouble("nx") * Mth.nextDouble(RandomSource.create(), 0.005, 0.03)));
			(itemstack).setHoverName(Component.literal(("\u653B\u51FB\u529B" + itemstack.getOrCreateTag().getDouble("sh") + "\u9632\u5FA1" + itemstack.getOrCreateTag().getDouble("fy") + "\u8840\u91CF" + itemstack.getOrCreateTag().getDouble("sm")
					+ "\u5E74\u9650" + itemstack.getOrCreateTag().getDouble("nx"))));
		}
	}
}

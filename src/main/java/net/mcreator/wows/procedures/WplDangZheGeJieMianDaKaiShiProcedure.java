package net.mcreator.wows.procedures;

import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.Component;

import net.mcreator.wows.network.WowsModVariables;

import java.util.function.Supplier;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Map;

public class WplDangZheGeJieMianDaKaiShiProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double cs = 0;
		double js2 = 0;
		double js = 0;
		js = 0;
		for (int index0 = 0; index0 < 61; index0++) {
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = (new Object() {
					public ItemStack getItemStack(int sltid, ItemStack _isc) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
						return _retval.get();
					}
				}.getItemStack((int) js, ((entity.getCapability(WowsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WowsModVariables.PlayerVariables())).bb)));
				_setstack.setCount(1);
				((Slot) _slots.get((int) js)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			js = js + 1;
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal(("" + js)), false);
		}
	}
}

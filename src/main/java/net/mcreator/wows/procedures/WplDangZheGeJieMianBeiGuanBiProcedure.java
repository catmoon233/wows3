package net.mcreator.wows.procedures;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.wows.network.WowsModVariables;

import java.util.function.Supplier;
import java.util.Map;

public class WplDangZheGeJieMianBeiGuanBiProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double cs = 0;
		double js2 = 0;
		double js = 0;
		js2 = 0;
		for (int index0 = 0; index0 < 61; index0++) {
			{
				ItemStack _isc = ((entity.getCapability(WowsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WowsModVariables.PlayerVariables())).bb);
				final ItemStack _setstack = (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get((int) js2)).getItem() : ItemStack.EMPTY);
				final int _sltid = (int) js2;
				_setstack.setCount(1);
				_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
			js2 = js2 + 1;
		}
	}
}

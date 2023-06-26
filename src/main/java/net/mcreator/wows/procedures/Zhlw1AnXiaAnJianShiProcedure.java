package net.mcreator.wows.procedures;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.wows.network.WowsModVariables;

import java.util.concurrent.atomic.AtomicReference;

public class Zhlw1AnXiaAnJianShiProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(WowsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WowsModVariables.PlayerVariables())).lw1zt == 1) {
			if ((new Object() {
				public ItemStack getItemStack(int sltid, Entity entity) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).copy());
					});
					return _retval.get();
				}
			}.getItemStack(1, entity)).getItem() == Blocks.AIR.asItem()) {
				{
					final int _slotid = 1;
					final ItemStack _setstack = ((entity.getCapability(WowsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WowsModVariables.PlayerVariables())).lw1);
					_setstack.setCount(1);
					entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable _modHandler)
							_modHandler.setStackInSlot(_slotid, _setstack);
					});
				}
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("\u53EC\u5524\u7075\u6B66\u6210\u529F"), false);
				{
					double _setval = 2;
					entity.getCapability(WowsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.lw1zt = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (!((new Object() {
				public ItemStack getItemStack(int sltid, Entity entity) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).copy());
					});
					return _retval.get();
				}
			}.getItemStack(1, entity)).getItem() == Blocks.AIR.asItem())) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("\u680F\u4F4D\u4E00\u6709\u7269\u54C1\u53EC\u5524\u7075\u6B66\u5931\u8D25"), false);
			}
		} else if ((entity.getCapability(WowsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WowsModVariables.PlayerVariables())).lw1zt == 2) {
			{
				double _setval = 1;
				entity.getCapability(WowsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.lw1zt = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("\u5DF2\u5C06\u7075\u6B66\u64A4\u56DE"), false);
			{
				final int _slotid = 1;
				final ItemStack _setstack = new ItemStack(Blocks.AIR);
				_setstack.setCount(1);
				entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable _modHandler)
						_modHandler.setStackInSlot(_slotid, _setstack);
				});
			}
		}
		if ((entity.getCapability(WowsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WowsModVariables.PlayerVariables())).lw1zt == 0) {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("\u4F60\u8FD8\u672A\u89E3\u9501\u7075\u6B66"), false);
		}
	}
}

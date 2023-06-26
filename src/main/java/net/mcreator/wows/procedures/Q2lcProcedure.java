package net.mcreator.wows.procedures;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.wows.init.WowsModItems;

import java.util.concurrent.atomic.AtomicReference;

public class Q2lcProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == WowsModItems.Q_2.get()) {
			if (!((new Object() {
				public ItemStack getItemStack(int sltid, Entity entity) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).copy());
					});
					return _retval.get();
				}
			}.getItemStack(1, entity)).getItem() == WowsModItems.LLQ.get())) {
				if (!((new Object() {
					public ItemStack getItemStack(int sltid, Entity entity) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
						return _retval.get();
					}
				}.getItemStack(1, entity)).getItem() == Blocks.AIR.asItem())) {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("\u8BF7\u52FF\u5728\u5FEB\u6377\u680F\u7B2C\u4E8C\u4E2A\u4F4D\u7F6E\u653E\u7F6E\u7269\u54C1"), false);
				}
				if ((new Object() {
					public ItemStack getItemStack(int sltid, Entity entity) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
						return _retval.get();
					}
				}.getItemStack(1, entity)).getItem() == Blocks.AIR.asItem()) {
					if (entity.getPersistentData().getDouble("llnow") > 10) {
						{
							final int _slotid = 1;
							final ItemStack _setstack = new ItemStack(WowsModItems.LLQ.get());
							_setstack.setCount(1);
							entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
								if (capability instanceof IItemHandlerModifiable _modHandler)
									_modHandler.setStackInSlot(_slotid, _setstack);
							});
						}
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal("\u5DF2\u88C5\u586B"), false);
						entity.getPersistentData().putDouble("llnow", (entity.getPersistentData().getDouble("llnow") - 10));
					}
				}
			}
		}
	}
}


package net.mcreator.wows.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;

import net.mcreator.wows.procedures.JipaoSongKaiAnJianShiProcedure;
import net.mcreator.wows.procedures.JipaoAnXiaAnJianShiProcedure;
import net.mcreator.wows.WowsMod;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class JipaoMessage {
	int type, pressedms;

	public JipaoMessage(int type, int pressedms) {
		this.type = type;
		this.pressedms = pressedms;
	}

	public JipaoMessage(FriendlyByteBuf buffer) {
		this.type = buffer.readInt();
		this.pressedms = buffer.readInt();
	}

	public static void buffer(JipaoMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.type);
		buffer.writeInt(message.pressedms);
	}

	public static void handler(JipaoMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			pressAction(context.getSender(), message.type, message.pressedms);
		});
		context.setPacketHandled(true);
	}

	public static void pressAction(Player entity, int type, int pressedms) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(entity.blockPosition()))
			return;
		if (type == 0) {

			JipaoAnXiaAnJianShiProcedure.execute(world, entity);
		}
		if (type == 1) {

			JipaoSongKaiAnJianShiProcedure.execute(world, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		WowsMod.addNetworkMessage(JipaoMessage.class, JipaoMessage::buffer, JipaoMessage::new, JipaoMessage::handler);
	}
}

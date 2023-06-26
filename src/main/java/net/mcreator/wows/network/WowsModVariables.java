package net.mcreator.wows.network;

import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.capabilities.CapabilityToken;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.Capability;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.nbt.Tag;
import net.minecraft.nbt.NbtUtils;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.Direction;
import net.minecraft.client.Minecraft;

import net.mcreator.wows.WowsMod;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class WowsModVariables {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		WowsMod.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer, PlayerVariablesSyncMessage::new, PlayerVariablesSyncMessage::handler);
	}

	@SubscribeEvent
	public static void init(RegisterCapabilitiesEvent event) {
		event.register(PlayerVariables.class);
	}

	@Mod.EventBusSubscriber
	public static class EventBusVariableHandlers {
		@SubscribeEvent
		public static void onPlayerLoggedInSyncPlayerVariables(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getEntity().level.isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
			if (!event.getEntity().level.isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getEntity().level.isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void clonePlayer(PlayerEvent.Clone event) {
			event.getOriginal().revive();
			PlayerVariables original = ((PlayerVariables) event.getOriginal().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			PlayerVariables clone = ((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			clone.ak = original.ak;
			clone.atafter = original.atafter;
			clone.bb = original.bb;
			clone.bb1 = original.bb1;
			clone.bb3 = original.bb3;
			clone.bjbl = original.bjbl;
			clone.bjjl = original.bjjl;
			clone.cssz = original.cssz;
			clone.dl = original.dl;
			clone.fs = original.fs;
			clone.fsbl = original.fsbl;
			clone.fy = original.fy;
			clone.fyct = original.fyct;
			clone.fyts = original.fyts;
			clone.gjct = original.gjct;
			clone.gjst = original.gjst;
			clone.gjts = original.gjts;
			clone.hdhf = original.hdhf;
			clone.hdz = original.hdz;
			clone.hdznow = original.hdznow;
			clone.hdznow2 = original.hdznow2;
			clone.healthmax = original.healthmax;
			clone.healthnow = original.healthnow;
			clone.healthnow4 = original.healthnow4;
			clone.hj = original.hj;
			clone.isno = original.isno;
			clone.lever = original.lever;
			clone.lever2 = original.lever2;
			clone.levernow = original.levernow;
			clone.levernow2 = original.levernow2;
			clone.leverup = original.leverup;
			clone.leverup2 = original.leverup2;
			clone.liliang = original.liliang;
			clone.ll = original.ll;
			clone.llhf = original.llhf;
			clone.llnow = original.llnow;
			clone.llnow2 = original.llnow2;
			clone.lw1 = original.lw1;
			clone.lw1zt = original.lw1zt;
			clone.lw2 = original.lw2;
			clone.lwdl = original.lwdl;
			clone.lws1 = original.lws1;
			clone.lws2 = original.lws2;
			clone.lwsf = original.lwsf;
			clone.lwsf2 = original.lwsf2;
			clone.mbhd = original.mbhd;
			clone.mbhd2 = original.mbhd2;
			clone.mbxl = original.mbxl;
			clone.mbxlmax = original.mbxlmax;
			clone.minjie = original.minjie;
			clone.ms = original.ms;
			clone.nx = original.nx;
			clone.playersx = original.playersx;
			clone.sh = original.sh;
			clone.sh1 = original.sh1;
			clone.shanbi = original.shanbi;
			clone.smhf = original.smhf;
			clone.smts = original.smts;
			clone.start = original.start;
			clone.tipo = original.tipo;
			clone.tlhf = original.tlhf;
			clone.tlhfs = original.tlhfs;
			clone.tlmax = original.tlmax;
			clone.tlnow2 = original.tlnow2;
			clone.tlxh = original.tlxh;
			clone.tlxh2 = original.tlxh2;
			clone.wd = original.wd;
			clone.wplopen = original.wplopen;
			clone.xixue = original.xixue;
			clone.xixuebl = original.xixuebl;
			clone.xueliangwb = original.xueliangwb;
			clone.xz1 = original.xz1;
			clone.xz2 = original.xz2;
			clone.xz3 = original.xz3;
			clone.ydsd = original.ydsd;
			clone.zcsh = original.zcsh;
			clone.zcsh2 = original.zcsh2;
			clone.zdl = original.zdl;
			clone.zhdl = original.zhdl;
			clone.zl = original.zl;
			clone.zs = original.zs;
			clone.zsxg = original.zsxg;
			if (!event.isWasDeath()) {
			}
		}
	}

	public static final Capability<PlayerVariables> PLAYER_VARIABLES_CAPABILITY = CapabilityManager.get(new CapabilityToken<PlayerVariables>() {
	});

	@Mod.EventBusSubscriber
	private static class PlayerVariablesProvider implements ICapabilitySerializable<Tag> {
		@SubscribeEvent
		public static void onAttachCapabilities(AttachCapabilitiesEvent<Entity> event) {
			if (event.getObject() instanceof Player && !(event.getObject() instanceof FakePlayer))
				event.addCapability(new ResourceLocation("wows", "player_variables"), new PlayerVariablesProvider());
		}

		private final PlayerVariables playerVariables = new PlayerVariables();
		private final LazyOptional<PlayerVariables> instance = LazyOptional.of(() -> playerVariables);

		@Override
		public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
			return cap == PLAYER_VARIABLES_CAPABILITY ? instance.cast() : LazyOptional.empty();
		}

		@Override
		public Tag serializeNBT() {
			return playerVariables.writeNBT();
		}

		@Override
		public void deserializeNBT(Tag nbt) {
			playerVariables.readNBT(nbt);
		}
	}

	public static class PlayerVariables {
		public double ak = 10.0;
		public double atafter = 0;
		public ItemStack bb = ItemStack.EMPTY;
		public double bb1 = 0.0;
		public BlockState bb3 = Blocks.AIR.defaultBlockState();
		public double bjbl = 0;
		public double bjjl = 0;
		public double cssz = 0;
		public String dl = "\"\"";
		public double fs = 0;
		public double fsbl = 0;
		public double fy = 0.0;
		public double fyct = 0;
		public double fyts = 0;
		public double gjct = 0;
		public String gjst = "\"\"";
		public double gjts = 0;
		public double hdhf = 0;
		public double hdz = 0;
		public double hdznow = 0;
		public double hdznow2 = 0;
		public double healthmax = 0;
		public double healthnow = 0;
		public double healthnow4 = 0;
		public double hj = 0;
		public double isno = 0;
		public double lever = 0;
		public double lever2 = 0;
		public double levernow = 0;
		public double levernow2 = 0;
		public double leverup = 0;
		public double leverup2 = 0;
		public double liliang = 0;
		public double ll = 0;
		public double llhf = 0.0;
		public double llnow = 0;
		public double llnow2 = 0;
		public ItemStack lw1 = ItemStack.EMPTY;
		public double lw1zt = 0;
		public ItemStack lw2 = ItemStack.EMPTY;
		public double lwdl = 0;
		public ItemStack lws1 = ItemStack.EMPTY;
		public ItemStack lws2 = ItemStack.EMPTY;
		public double lwsf = 0;
		public double lwsf2 = 0;
		public double mbhd = 0;
		public double mbhd2 = 0;
		public double mbxl = 0;
		public double mbxlmax = 0;
		public double minjie = 0;
		public double ms = 0;
		public double nx = 0;
		public double playersx = 3.0;
		public double sh = 0;
		public double sh1 = 0;
		public double shanbi = 0.0;
		public double smhf = 10.0;
		public double smts = 0;
		public double start = 0;
		public double tipo = 0;
		public double tlhf = 5.0;
		public boolean tlhfs = false;
		public double tlmax = 100.0;
		public double tlnow2 = 0.0;
		public double tlxh = 2.5;
		public boolean tlxh2 = false;
		public String wd = "w";
		public double wplopen = 0;
		public double xixue = 0;
		public double xixuebl = 0;
		public String xueliangwb = "\"\"";
		public double xz1 = 0;
		public double xz2 = 0;
		public double xz3 = 0;
		public double ydsd = 0;
		public double zcsh = 0;
		public double zcsh2 = 0;
		public double zdl = 0;
		public double zhdl = 0.0;
		public double zl = 0;
		public double zs = 0;
		public double zsxg = 0.0;

		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayer serverPlayer)
				WowsMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> serverPlayer), new PlayerVariablesSyncMessage(this));
		}

		public Tag writeNBT() {
			CompoundTag nbt = new CompoundTag();
			nbt.putDouble("ak", ak);
			nbt.putDouble("atafter", atafter);
			nbt.put("bb", bb.save(new CompoundTag()));
			nbt.putDouble("bb1", bb1);
			nbt.put("bb3", NbtUtils.writeBlockState(bb3));
			nbt.putDouble("bjbl", bjbl);
			nbt.putDouble("bjjl", bjjl);
			nbt.putDouble("cssz", cssz);
			nbt.putString("dl", dl);
			nbt.putDouble("fs", fs);
			nbt.putDouble("fsbl", fsbl);
			nbt.putDouble("fy", fy);
			nbt.putDouble("fyct", fyct);
			nbt.putDouble("fyts", fyts);
			nbt.putDouble("gjct", gjct);
			nbt.putString("gjst", gjst);
			nbt.putDouble("gjts", gjts);
			nbt.putDouble("hdhf", hdhf);
			nbt.putDouble("hdz", hdz);
			nbt.putDouble("hdznow", hdznow);
			nbt.putDouble("hdznow2", hdznow2);
			nbt.putDouble("healthmax", healthmax);
			nbt.putDouble("healthnow", healthnow);
			nbt.putDouble("healthnow4", healthnow4);
			nbt.putDouble("hj", hj);
			nbt.putDouble("isno", isno);
			nbt.putDouble("lever", lever);
			nbt.putDouble("lever2", lever2);
			nbt.putDouble("levernow", levernow);
			nbt.putDouble("levernow2", levernow2);
			nbt.putDouble("leverup", leverup);
			nbt.putDouble("leverup2", leverup2);
			nbt.putDouble("liliang", liliang);
			nbt.putDouble("ll", ll);
			nbt.putDouble("llhf", llhf);
			nbt.putDouble("llnow", llnow);
			nbt.putDouble("llnow2", llnow2);
			nbt.put("lw1", lw1.save(new CompoundTag()));
			nbt.putDouble("lw1zt", lw1zt);
			nbt.put("lw2", lw2.save(new CompoundTag()));
			nbt.putDouble("lwdl", lwdl);
			nbt.put("lws1", lws1.save(new CompoundTag()));
			nbt.put("lws2", lws2.save(new CompoundTag()));
			nbt.putDouble("lwsf", lwsf);
			nbt.putDouble("lwsf2", lwsf2);
			nbt.putDouble("mbhd", mbhd);
			nbt.putDouble("mbhd2", mbhd2);
			nbt.putDouble("mbxl", mbxl);
			nbt.putDouble("mbxlmax", mbxlmax);
			nbt.putDouble("minjie", minjie);
			nbt.putDouble("ms", ms);
			nbt.putDouble("nx", nx);
			nbt.putDouble("playersx", playersx);
			nbt.putDouble("sh", sh);
			nbt.putDouble("sh1", sh1);
			nbt.putDouble("shanbi", shanbi);
			nbt.putDouble("smhf", smhf);
			nbt.putDouble("smts", smts);
			nbt.putDouble("start", start);
			nbt.putDouble("tipo", tipo);
			nbt.putDouble("tlhf", tlhf);
			nbt.putBoolean("tlhfs", tlhfs);
			nbt.putDouble("tlmax", tlmax);
			nbt.putDouble("tlnow2", tlnow2);
			nbt.putDouble("tlxh", tlxh);
			nbt.putBoolean("tlxh2", tlxh2);
			nbt.putString("wd", wd);
			nbt.putDouble("wplopen", wplopen);
			nbt.putDouble("xixue", xixue);
			nbt.putDouble("xixuebl", xixuebl);
			nbt.putString("xueliangwb", xueliangwb);
			nbt.putDouble("xz1", xz1);
			nbt.putDouble("xz2", xz2);
			nbt.putDouble("xz3", xz3);
			nbt.putDouble("ydsd", ydsd);
			nbt.putDouble("zcsh", zcsh);
			nbt.putDouble("zcsh2", zcsh2);
			nbt.putDouble("zdl", zdl);
			nbt.putDouble("zhdl", zhdl);
			nbt.putDouble("zl", zl);
			nbt.putDouble("zs", zs);
			nbt.putDouble("zsxg", zsxg);
			return nbt;
		}

		public void readNBT(Tag Tag) {
			CompoundTag nbt = (CompoundTag) Tag;
			ak = nbt.getDouble("ak");
			atafter = nbt.getDouble("atafter");
			bb = ItemStack.of(nbt.getCompound("bb"));
			bb1 = nbt.getDouble("bb1");
			bb3 = NbtUtils.readBlockState(nbt.getCompound("bb3"));
			bjbl = nbt.getDouble("bjbl");
			bjjl = nbt.getDouble("bjjl");
			cssz = nbt.getDouble("cssz");
			dl = nbt.getString("dl");
			fs = nbt.getDouble("fs");
			fsbl = nbt.getDouble("fsbl");
			fy = nbt.getDouble("fy");
			fyct = nbt.getDouble("fyct");
			fyts = nbt.getDouble("fyts");
			gjct = nbt.getDouble("gjct");
			gjst = nbt.getString("gjst");
			gjts = nbt.getDouble("gjts");
			hdhf = nbt.getDouble("hdhf");
			hdz = nbt.getDouble("hdz");
			hdznow = nbt.getDouble("hdznow");
			hdznow2 = nbt.getDouble("hdznow2");
			healthmax = nbt.getDouble("healthmax");
			healthnow = nbt.getDouble("healthnow");
			healthnow4 = nbt.getDouble("healthnow4");
			hj = nbt.getDouble("hj");
			isno = nbt.getDouble("isno");
			lever = nbt.getDouble("lever");
			lever2 = nbt.getDouble("lever2");
			levernow = nbt.getDouble("levernow");
			levernow2 = nbt.getDouble("levernow2");
			leverup = nbt.getDouble("leverup");
			leverup2 = nbt.getDouble("leverup2");
			liliang = nbt.getDouble("liliang");
			ll = nbt.getDouble("ll");
			llhf = nbt.getDouble("llhf");
			llnow = nbt.getDouble("llnow");
			llnow2 = nbt.getDouble("llnow2");
			lw1 = ItemStack.of(nbt.getCompound("lw1"));
			lw1zt = nbt.getDouble("lw1zt");
			lw2 = ItemStack.of(nbt.getCompound("lw2"));
			lwdl = nbt.getDouble("lwdl");
			lws1 = ItemStack.of(nbt.getCompound("lws1"));
			lws2 = ItemStack.of(nbt.getCompound("lws2"));
			lwsf = nbt.getDouble("lwsf");
			lwsf2 = nbt.getDouble("lwsf2");
			mbhd = nbt.getDouble("mbhd");
			mbhd2 = nbt.getDouble("mbhd2");
			mbxl = nbt.getDouble("mbxl");
			mbxlmax = nbt.getDouble("mbxlmax");
			minjie = nbt.getDouble("minjie");
			ms = nbt.getDouble("ms");
			nx = nbt.getDouble("nx");
			playersx = nbt.getDouble("playersx");
			sh = nbt.getDouble("sh");
			sh1 = nbt.getDouble("sh1");
			shanbi = nbt.getDouble("shanbi");
			smhf = nbt.getDouble("smhf");
			smts = nbt.getDouble("smts");
			start = nbt.getDouble("start");
			tipo = nbt.getDouble("tipo");
			tlhf = nbt.getDouble("tlhf");
			tlhfs = nbt.getBoolean("tlhfs");
			tlmax = nbt.getDouble("tlmax");
			tlnow2 = nbt.getDouble("tlnow2");
			tlxh = nbt.getDouble("tlxh");
			tlxh2 = nbt.getBoolean("tlxh2");
			wd = nbt.getString("wd");
			wplopen = nbt.getDouble("wplopen");
			xixue = nbt.getDouble("xixue");
			xixuebl = nbt.getDouble("xixuebl");
			xueliangwb = nbt.getString("xueliangwb");
			xz1 = nbt.getDouble("xz1");
			xz2 = nbt.getDouble("xz2");
			xz3 = nbt.getDouble("xz3");
			ydsd = nbt.getDouble("ydsd");
			zcsh = nbt.getDouble("zcsh");
			zcsh2 = nbt.getDouble("zcsh2");
			zdl = nbt.getDouble("zdl");
			zhdl = nbt.getDouble("zhdl");
			zl = nbt.getDouble("zl");
			zs = nbt.getDouble("zs");
			zsxg = nbt.getDouble("zsxg");
		}
	}

	public static class PlayerVariablesSyncMessage {
		public PlayerVariables data;

		public PlayerVariablesSyncMessage(FriendlyByteBuf buffer) {
			this.data = new PlayerVariables();
			this.data.readNBT(buffer.readNbt());
		}

		public PlayerVariablesSyncMessage(PlayerVariables data) {
			this.data = data;
		}

		public static void buffer(PlayerVariablesSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeNbt((CompoundTag) message.data.writeNBT());
		}

		public static void handler(PlayerVariablesSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					PlayerVariables variables = ((PlayerVariables) Minecraft.getInstance().player.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
					variables.ak = message.data.ak;
					variables.atafter = message.data.atafter;
					variables.bb = message.data.bb;
					variables.bb1 = message.data.bb1;
					variables.bb3 = message.data.bb3;
					variables.bjbl = message.data.bjbl;
					variables.bjjl = message.data.bjjl;
					variables.cssz = message.data.cssz;
					variables.dl = message.data.dl;
					variables.fs = message.data.fs;
					variables.fsbl = message.data.fsbl;
					variables.fy = message.data.fy;
					variables.fyct = message.data.fyct;
					variables.fyts = message.data.fyts;
					variables.gjct = message.data.gjct;
					variables.gjst = message.data.gjst;
					variables.gjts = message.data.gjts;
					variables.hdhf = message.data.hdhf;
					variables.hdz = message.data.hdz;
					variables.hdznow = message.data.hdznow;
					variables.hdznow2 = message.data.hdznow2;
					variables.healthmax = message.data.healthmax;
					variables.healthnow = message.data.healthnow;
					variables.healthnow4 = message.data.healthnow4;
					variables.hj = message.data.hj;
					variables.isno = message.data.isno;
					variables.lever = message.data.lever;
					variables.lever2 = message.data.lever2;
					variables.levernow = message.data.levernow;
					variables.levernow2 = message.data.levernow2;
					variables.leverup = message.data.leverup;
					variables.leverup2 = message.data.leverup2;
					variables.liliang = message.data.liliang;
					variables.ll = message.data.ll;
					variables.llhf = message.data.llhf;
					variables.llnow = message.data.llnow;
					variables.llnow2 = message.data.llnow2;
					variables.lw1 = message.data.lw1;
					variables.lw1zt = message.data.lw1zt;
					variables.lw2 = message.data.lw2;
					variables.lwdl = message.data.lwdl;
					variables.lws1 = message.data.lws1;
					variables.lws2 = message.data.lws2;
					variables.lwsf = message.data.lwsf;
					variables.lwsf2 = message.data.lwsf2;
					variables.mbhd = message.data.mbhd;
					variables.mbhd2 = message.data.mbhd2;
					variables.mbxl = message.data.mbxl;
					variables.mbxlmax = message.data.mbxlmax;
					variables.minjie = message.data.minjie;
					variables.ms = message.data.ms;
					variables.nx = message.data.nx;
					variables.playersx = message.data.playersx;
					variables.sh = message.data.sh;
					variables.sh1 = message.data.sh1;
					variables.shanbi = message.data.shanbi;
					variables.smhf = message.data.smhf;
					variables.smts = message.data.smts;
					variables.start = message.data.start;
					variables.tipo = message.data.tipo;
					variables.tlhf = message.data.tlhf;
					variables.tlhfs = message.data.tlhfs;
					variables.tlmax = message.data.tlmax;
					variables.tlnow2 = message.data.tlnow2;
					variables.tlxh = message.data.tlxh;
					variables.tlxh2 = message.data.tlxh2;
					variables.wd = message.data.wd;
					variables.wplopen = message.data.wplopen;
					variables.xixue = message.data.xixue;
					variables.xixuebl = message.data.xixuebl;
					variables.xueliangwb = message.data.xueliangwb;
					variables.xz1 = message.data.xz1;
					variables.xz2 = message.data.xz2;
					variables.xz3 = message.data.xz3;
					variables.ydsd = message.data.ydsd;
					variables.zcsh = message.data.zcsh;
					variables.zcsh2 = message.data.zcsh2;
					variables.zdl = message.data.zdl;
					variables.zhdl = message.data.zhdl;
					variables.zl = message.data.zl;
					variables.zs = message.data.zs;
					variables.zsxg = message.data.zsxg;
				}
			});
			context.setPacketHandled(true);
		}
	}
}

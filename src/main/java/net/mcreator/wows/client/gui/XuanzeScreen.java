package net.mcreator.wows.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.Minecraft;

import net.mcreator.wows.world.inventory.XuanzeMenu;
import net.mcreator.wows.network.XuanzeButtonMessage;
import net.mcreator.wows.WowsMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class XuanzeScreen extends AbstractContainerScreen<XuanzeMenu> {
	private final static HashMap<String, Object> guistate = XuanzeMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_caidan1;
	ImageButton imagebutton_caidan11;

	public XuanzeScreen(XuanzeMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 0;
	}

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		RenderSystem.setShaderTexture(0, new ResourceLocation("wows:textures/screens/sss.png"));
		this.blit(ms, this.leftPos + -711, this.topPos + -427, 0, 0, 1600, 800, 1600, 800);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, Component.translatable("gui.wows.xuanze.label_qing_xuan_ze_ni_de_lu"), -25, -113, -16777216);
		this.font.draw(poseStack, Component.translatable("gui.wows.xuanze.label_ling_wu_da_lu"), -117, -40, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.wows.xuanze.label_zhan_hun_da_lu"), 98, -40, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		imagebutton_caidan1 = new ImageButton(this.leftPos + -135, this.topPos + -85, 64, 140, 0, 0, 140, new ResourceLocation("wows:textures/screens/atlas/imagebutton_caidan1.png"), 64, 280, e -> {
			if (true) {
				WowsMod.PACKET_HANDLER.sendToServer(new XuanzeButtonMessage(0, x, y, z));
				XuanzeButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_caidan1", imagebutton_caidan1);
		this.addRenderableWidget(imagebutton_caidan1);
		imagebutton_caidan11 = new ImageButton(this.leftPos + 80, this.topPos + -85, 64, 140, 0, 0, 140, new ResourceLocation("wows:textures/screens/atlas/imagebutton_caidan11.png"), 64, 280, e -> {
			if (true) {
				WowsMod.PACKET_HANDLER.sendToServer(new XuanzeButtonMessage(1, x, y, z));
				XuanzeButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_caidan11", imagebutton_caidan11);
		this.addRenderableWidget(imagebutton_caidan11);
	}
}

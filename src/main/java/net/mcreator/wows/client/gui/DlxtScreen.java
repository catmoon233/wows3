package net.mcreator.wows.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.wows.world.inventory.DlxtMenu;
import net.mcreator.wows.procedures.DlxtZhiShuZhiProcedure;
import net.mcreator.wows.procedures.DlxtZhiShuZhi2Procedure;
import net.mcreator.wows.procedures.DlxtZhiShuZhi1Procedure;
import net.mcreator.wows.network.DlxtButtonMessage;
import net.mcreator.wows.WowsMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class DlxtScreen extends AbstractContainerScreen<DlxtMenu> {
	private final static HashMap<String, Object> guistate = DlxtMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_fu_wo_cheng_duan_lian;

	public DlxtScreen(DlxtMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 400;
		this.imageHeight = 200;
	}

	private static final ResourceLocation texture = new ResourceLocation("wows:textures/screens/dlxt.png");

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
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
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
		this.font.draw(poseStack,

				DlxtZhiShuZhi1Procedure.execute(entity), 10, 15, -12829636);
		this.font.draw(poseStack,

				DlxtZhiShuZhi2Procedure.execute(entity), 10, 33, -12829636);
		this.font.draw(poseStack,

				DlxtZhiShuZhiProcedure.execute(entity), 10, 51, -12829636);
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
		button_fu_wo_cheng_duan_lian = new Button(this.leftPos + 253, this.topPos + 15, 51, 20, Component.translatable("gui.wows.dlxt.button_fu_wo_cheng_duan_lian"), e -> {
			if (true) {
				WowsMod.PACKET_HANDLER.sendToServer(new DlxtButtonMessage(0, x, y, z));
				DlxtButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:button_fu_wo_cheng_duan_lian", button_fu_wo_cheng_duan_lian);
		this.addRenderableWidget(button_fu_wo_cheng_duan_lian);
	}
}

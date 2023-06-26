package net.mcreator.wows.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.Minecraft;

import net.mcreator.wows.world.inventory.LwjcguiMenu;
import net.mcreator.wows.network.LwjcguiButtonMessage;
import net.mcreator.wows.WowsMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class LwjcguiScreen extends AbstractContainerScreen<LwjcguiMenu> {
	private final static HashMap<String, Object> guistate = LwjcguiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_st1;

	public LwjcguiScreen(LwjcguiMenu container, Inventory inventory, Component text) {
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

		RenderSystem.setShaderTexture(0, new ResourceLocation("wows:textures/screens/caidan.png"));
		this.blit(ms, this.leftPos + -197, this.topPos + -103, 0, 0, 400, 200, 400, 200);

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
		this.font.draw(poseStack, Component.translatable("gui.wows.lwjcgui.label_jue_xing_ling_wu"), -127, 53, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.wows.lwjcgui.label_pz"), -57, -67, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.wows.lwjcgui.label_wx"), -57, -57, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.wows.lwjcgui.label_mz"), -57, -47, -12829636);
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
		imagebutton_st1 = new ImageButton(this.leftPos + -152, this.topPos + 43, 70, 32, 0, 0, 32, new ResourceLocation("wows:textures/screens/atlas/imagebutton_st1.png"), 70, 64, e -> {
			if (true) {
				WowsMod.PACKET_HANDLER.sendToServer(new LwjcguiButtonMessage(0, x, y, z));
				LwjcguiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_st1", imagebutton_st1);
		this.addRenderableWidget(imagebutton_st1);
	}
}

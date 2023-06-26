package net.mcreator.wows.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.Minecraft;

import net.mcreator.wows.world.inventory.ZcdMenu;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class ZcdScreen extends AbstractContainerScreen<ZcdMenu> {
	private final static HashMap<String, Object> guistate = ZcdMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_cdb;
	ImageButton imagebutton_cdb1;
	ImageButton imagebutton_cdb2;
	ImageButton imagebutton_cdb3;
	ImageButton imagebutton_cdb4;
	ImageButton imagebutton_cdb5;

	public ZcdScreen(ZcdMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 0;
	}

	private static final ResourceLocation texture = new ResourceLocation("wows:textures/screens/zcd.png");

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
		this.font.draw(poseStack, Component.translatable("gui.wows.zcd.label_ren_wu_shu_xing"), -119, -32, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.wows.zcd.label_hun_po_cai_dan"), -7, -32, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.wows.zcd.label_cai_dan"), 120, -32, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.wows.zcd.label_cai_dan_3"), -119, 32, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.wows.zcd.label_cai_dan_4"), -7, 32, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.wows.zcd.label_cai_dan_6"), 120, 24, -12829636);
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
		imagebutton_cdb = new ImageButton(this.leftPos + -143, this.topPos + -48, 64, 32, 0, 0, 32, new ResourceLocation("wows:textures/screens/atlas/imagebutton_cdb.png"), 64, 64, e -> {
		});
		guistate.put("button:imagebutton_cdb", imagebutton_cdb);
		this.addRenderableWidget(imagebutton_cdb);
		imagebutton_cdb1 = new ImageButton(this.leftPos + -23, this.topPos + -48, 64, 32, 0, 0, 32, new ResourceLocation("wows:textures/screens/atlas/imagebutton_cdb1.png"), 64, 64, e -> {
		});
		guistate.put("button:imagebutton_cdb1", imagebutton_cdb1);
		this.addRenderableWidget(imagebutton_cdb1);
		imagebutton_cdb2 = new ImageButton(this.leftPos + 96, this.topPos + -48, 64, 32, 0, 0, 32, new ResourceLocation("wows:textures/screens/atlas/imagebutton_cdb2.png"), 64, 64, e -> {
		});
		guistate.put("button:imagebutton_cdb2", imagebutton_cdb2);
		this.addRenderableWidget(imagebutton_cdb2);
		imagebutton_cdb3 = new ImageButton(this.leftPos + -143, this.topPos + 24, 64, 32, 0, 0, 32, new ResourceLocation("wows:textures/screens/atlas/imagebutton_cdb3.png"), 64, 64, e -> {
		});
		guistate.put("button:imagebutton_cdb3", imagebutton_cdb3);
		this.addRenderableWidget(imagebutton_cdb3);
		imagebutton_cdb4 = new ImageButton(this.leftPos + -23, this.topPos + 16, 64, 32, 0, 0, 32, new ResourceLocation("wows:textures/screens/atlas/imagebutton_cdb4.png"), 64, 64, e -> {
		});
		guistate.put("button:imagebutton_cdb4", imagebutton_cdb4);
		this.addRenderableWidget(imagebutton_cdb4);
		imagebutton_cdb5 = new ImageButton(this.leftPos + 96, this.topPos + 16, 64, 32, 0, 0, 32, new ResourceLocation("wows:textures/screens/atlas/imagebutton_cdb5.png"), 64, 64, e -> {
		});
		guistate.put("button:imagebutton_cdb5", imagebutton_cdb5);
		this.addRenderableWidget(imagebutton_cdb5);
	}
}

package net.mcreator.wows.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.InventoryScreen;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.Minecraft;

import net.mcreator.wows.world.inventory.C1Menu;
import net.mcreator.wows.procedures.UimxProcedure;
import net.mcreator.wows.network.C1ButtonMessage;
import net.mcreator.wows.WowsMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class C1Screen extends AbstractContainerScreen<C1Menu> {
	private final static HashMap<String, Object> guistate = C1Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_st1;
	ImageButton imagebutton_st11;
	ImageButton imagebutton_st12;
	ImageButton imagebutton_st13;

	public C1Screen(C1Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 512;
		this.imageHeight = 512;
	}

	private static final ResourceLocation texture = new ResourceLocation("wows:textures/screens/c_1.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
		if (UimxProcedure.execute(entity) instanceof LivingEntity livingEntity) {
			InventoryScreen.renderEntityInInventoryRaw(this.leftPos + 392, this.topPos + 354, 70, 0f + (float) Math.atan((this.leftPos + 392 - mouseX) / 40.0), (float) Math.atan((this.topPos + 304 - mouseY) / 40.0), livingEntity);
		}
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		RenderSystem.setShaderTexture(0, new ResourceLocation("wows:textures/screens/sss.png"));
		this.blit(ms, this.leftPos + -516, this.topPos + -126, 0, 0, 1600, 800, 1600, 800);

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
		this.font.draw(poseStack, Component.translatable("gui.wows.c_1.label_kai_shi_you_xi"), 93, 199, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.wows.c_1.label_she_zhi"), 98, 244, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.wows.c_1.label_shuo_ming"), 98, 289, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.wows.c_1.label_tui_chu_you_xi"), 93, 334, -12829636);
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
		imagebutton_st1 = new ImageButton(this.leftPos + 68, this.topPos + 189, 70, 32, 0, 0, 32, new ResourceLocation("wows:textures/screens/atlas/imagebutton_st1.png"), 70, 64, e -> {
			if (true) {
				WowsMod.PACKET_HANDLER.sendToServer(new C1ButtonMessage(0, x, y, z));
				C1ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_st1", imagebutton_st1);
		this.addRenderableWidget(imagebutton_st1);
		imagebutton_st11 = new ImageButton(this.leftPos + 68, this.topPos + 234, 70, 32, 0, 0, 32, new ResourceLocation("wows:textures/screens/atlas/imagebutton_st11.png"), 70, 64, e -> {
		});
		guistate.put("button:imagebutton_st11", imagebutton_st11);
		this.addRenderableWidget(imagebutton_st11);
		imagebutton_st12 = new ImageButton(this.leftPos + 68, this.topPos + 324, 70, 32, 0, 0, 32, new ResourceLocation("wows:textures/screens/atlas/imagebutton_st12.png"), 70, 64, e -> {
		});
		guistate.put("button:imagebutton_st12", imagebutton_st12);
		this.addRenderableWidget(imagebutton_st12);
		imagebutton_st13 = new ImageButton(this.leftPos + 68, this.topPos + 279, 70, 32, 0, 0, 32, new ResourceLocation("wows:textures/screens/atlas/imagebutton_st13.png"), 70, 64, e -> {
		});
		guistate.put("button:imagebutton_st13", imagebutton_st13);
		this.addRenderableWidget(imagebutton_st13);
	}
}

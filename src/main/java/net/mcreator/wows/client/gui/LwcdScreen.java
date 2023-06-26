package net.mcreator.wows.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.Minecraft;

import net.mcreator.wows.world.inventory.LwcdMenu;
import net.mcreator.wows.procedures.LwcdZhiShuZhiProcedure;
import net.mcreator.wows.procedures.LwcdZhiShuZhi4Procedure;
import net.mcreator.wows.procedures.LwcdZhiShuZhi3Procedure;
import net.mcreator.wows.procedures.LwcdZhiShuZhi2Procedure;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class LwcdScreen extends AbstractContainerScreen<LwcdMenu> {
	private final static HashMap<String, Object> guistate = LwcdMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public LwcdScreen(LwcdMenu container, Inventory inventory, Component text) {
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
		this.blit(ms, this.leftPos + -199, this.topPos + -104, 0, 0, 400, 200, 400, 200);

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

				LwcdZhiShuZhiProcedure.execute(entity), -183, -80, -12829636);
		this.font.draw(poseStack,

				LwcdZhiShuZhi3Procedure.execute(entity), -183, -72, -12829636);
		this.font.draw(poseStack,

				LwcdZhiShuZhi2Procedure.execute(entity), -183, -64, -12829636);
		this.font.draw(poseStack,

				LwcdZhiShuZhi4Procedure.execute(entity), -183, -56, -12829636);
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
	}
}

package net.mcreator.wows.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.InventoryScreen;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.Minecraft;

import net.mcreator.wows.world.inventory.EuiMenu;
import net.mcreator.wows.procedures.UimxProcedure;
import net.mcreator.wows.procedures.EuiZhiShuZhiProcedure;
import net.mcreator.wows.procedures.EuiZhiShuZhi9Procedure;
import net.mcreator.wows.procedures.EuiZhiShuZhi8Procedure;
import net.mcreator.wows.procedures.EuiZhiShuZhi7Procedure;
import net.mcreator.wows.procedures.EuiZhiShuZhi6Procedure;
import net.mcreator.wows.procedures.EuiZhiShuZhi5Procedure;
import net.mcreator.wows.procedures.EuiZhiShuZhi4Procedure;
import net.mcreator.wows.procedures.EuiZhiShuZhi3Procedure;
import net.mcreator.wows.procedures.EuiZhiShuZhi2Procedure;
import net.mcreator.wows.procedures.EuiZhiShuZhi27Procedure;
import net.mcreator.wows.procedures.EuiZhiShuZhi26Procedure;
import net.mcreator.wows.procedures.EuiZhiShuZhi25Procedure;
import net.mcreator.wows.procedures.EuiZhiShuZhi23Procedure;
import net.mcreator.wows.procedures.EuiZhiShuZhi22Procedure;
import net.mcreator.wows.procedures.EuiZhiShuZhi21Procedure;
import net.mcreator.wows.procedures.EuiZhiShuZhi20Procedure;
import net.mcreator.wows.procedures.EuiZhiShuZhi19Procedure;
import net.mcreator.wows.procedures.EuiZhiShuZhi18Procedure;
import net.mcreator.wows.procedures.EuiZhiShuZhi17Procedure;
import net.mcreator.wows.procedures.EuiZhiShuZhi16Procedure;
import net.mcreator.wows.procedures.EuiZhiShuZhi15Procedure;
import net.mcreator.wows.procedures.EuiZhiShuZhi14Procedure;
import net.mcreator.wows.procedures.EuiZhiShuZhi13Procedure;
import net.mcreator.wows.procedures.EuiZhiShuZhi12Procedure;
import net.mcreator.wows.procedures.EuiZhiShuZhi11Procedure;
import net.mcreator.wows.procedures.EuiZhiShuZhi112Procedure;
import net.mcreator.wows.procedures.EuiZhiShuZhi10Procedure;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class EuiScreen extends AbstractContainerScreen<EuiMenu> {
	private final static HashMap<String, Object> guistate = EuiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public EuiScreen(EuiMenu container, Inventory inventory, Component text) {
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
		if (UimxProcedure.execute(entity) instanceof LivingEntity livingEntity) {
			InventoryScreen.renderEntityInInventoryRaw(this.leftPos + 141, this.topPos + 85, 50, 0f, 0, livingEntity);
		}
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		RenderSystem.setShaderTexture(0, new ResourceLocation("wows:textures/screens/caidan.png"));
		this.blit(ms, this.leftPos + -204, this.topPos + -101, 0, 0, 400, 200, 400, 200);

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

				EuiZhiShuZhiProcedure.execute(entity), -194, -96, -12829636);
		this.font.draw(poseStack,

				EuiZhiShuZhi2Procedure.execute(entity), -194, -86, -12829636);
		this.font.draw(poseStack,

				EuiZhiShuZhi3Procedure.execute(entity), -194, -76, -12829636);
		this.font.draw(poseStack,

				EuiZhiShuZhi4Procedure.execute(entity), -194, -67, -12829636);
		this.font.draw(poseStack,

				EuiZhiShuZhi5Procedure.execute(entity), -194, -56, -12829636);
		this.font.draw(poseStack,

				EuiZhiShuZhi6Procedure.execute(entity), -194, -46, -12829636);
		this.font.draw(poseStack,

				EuiZhiShuZhi7Procedure.execute(entity), -194, -36, -12829636);
		this.font.draw(poseStack,

				EuiZhiShuZhi8Procedure.execute(entity), -194, 84, -12829636);
		this.font.draw(poseStack,

				EuiZhiShuZhi9Procedure.execute(entity), -194, -26, -12829636);
		this.font.draw(poseStack,

				EuiZhiShuZhi10Procedure.execute(entity), -194, -16, -12829636);
		this.font.draw(poseStack,

				EuiZhiShuZhi11Procedure.execute(entity), -194, -6, -12829636);
		this.font.draw(poseStack,

				EuiZhiShuZhi12Procedure.execute(entity), -194, 4, -12829636);
		this.font.draw(poseStack,

				EuiZhiShuZhi13Procedure.execute(entity), -194, 14, -12829636);
		this.font.draw(poseStack,

				EuiZhiShuZhi14Procedure.execute(entity), -194, 24, -12829636);
		this.font.draw(poseStack,

				EuiZhiShuZhi15Procedure.execute(entity), -194, 34, -12829636);
		this.font.draw(poseStack,

				EuiZhiShuZhi16Procedure.execute(entity), -194, 44, -12829636);
		this.font.draw(poseStack,

				EuiZhiShuZhi17Procedure.execute(entity), -194, 54, -12829636);
		this.font.draw(poseStack,

				EuiZhiShuZhi18Procedure.execute(entity), -194, 64, -12829636);
		this.font.draw(poseStack,

				EuiZhiShuZhi19Procedure.execute(entity), -194, 74, -12829636);
		this.font.draw(poseStack,

				EuiZhiShuZhi112Procedure.execute(entity), -64, -96, -12829636);
		this.font.draw(poseStack,

				EuiZhiShuZhi20Procedure.execute(entity), -64, -86, -12829636);
		this.font.draw(poseStack,

				EuiZhiShuZhi21Procedure.execute(entity), -64, -76, -12829636);
		this.font.draw(poseStack,

				EuiZhiShuZhi22Procedure.execute(entity), -64, -66, -12829636);
		this.font.draw(poseStack,

				EuiZhiShuZhi23Procedure.execute(entity), -64, -56, -12829636);
		this.font.draw(poseStack,

				EuiZhiShuZhi25Procedure.execute(entity), -64, -46, -12829636);
		this.font.draw(poseStack,

				EuiZhiShuZhi26Procedure.execute(entity), -64, -36, -12829636);
		this.font.draw(poseStack,

				EuiZhiShuZhi27Procedure.execute(entity), -64, -26, -12829636);
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

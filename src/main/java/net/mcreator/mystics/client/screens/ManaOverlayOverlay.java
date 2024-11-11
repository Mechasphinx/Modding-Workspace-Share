
package net.mcreator.mystics.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.Minecraft;

import net.mcreator.mystics.procedures.Manoverlayprocedure3Procedure;
import net.mcreator.mystics.procedures.Manaoverlayprocedure4Procedure;
import net.mcreator.mystics.procedures.Manaoverlayprocedure2Procedure;
import net.mcreator.mystics.procedures.ManaoverlaydisplayconditionProcedure;
import net.mcreator.mystics.procedures.Mana90Procedure;
import net.mcreator.mystics.procedures.Mana5Procedure;
import net.mcreator.mystics.procedures.Mana4Procedure;
import net.mcreator.mystics.procedures.Mana3Procedure;
import net.mcreator.mystics.procedures.Mana2Procedure;
import net.mcreator.mystics.procedures.Mana100Procedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class ManaOverlayOverlay {
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getWindow().getGuiScaledWidth();
		int h = event.getWindow().getGuiScaledHeight();
		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;
		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level();
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}
		RenderSystem.disableDepthTest();
		RenderSystem.depthMask(false);
		RenderSystem.enableBlend();
		RenderSystem.setShader(GameRenderer::getPositionTexShader);
		RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
		RenderSystem.setShaderColor(1, 1, 1, 1);
		if (true) {
			event.getGuiGraphics().blit(new ResourceLocation("mystics:textures/screens/mana_bar_purple.png"), 0, h - 16, 0, 0, 81, 16, 81, 16);

			if (Mana5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("mystics:textures/screens/mana_pointpurple.png"), 1, h - 16, 0, 0, 20, 16, 20, 16);
			}
			if (Mana4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("mystics:textures/screens/mana2.png"), 1, h - 16, 0, 0, 20, 16, 20, 16);
			}
			if (Manaoverlayprocedure4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("mystics:textures/screens/mana_pointpurple.png"), 17, h - 16, 0, 0, 20, 16, 20, 16);
			}
			if (Manoverlayprocedure3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("mystics:textures/screens/mana2.png"), 17, h - 16, 0, 0, 20, 16, 20, 16);
			}
			if (Mana3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("mystics:textures/screens/mana_pointpurple.png"), 32, h - 16, 0, 0, 20, 16, 20, 16);
			}
			if (Manaoverlayprocedure2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("mystics:textures/screens/mana2.png"), 32, h - 16, 0, 0, 20, 16, 20, 16);
			}
			if (Mana2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("mystics:textures/screens/mana_pointpurple.png"), 48, h - 16, 0, 0, 20, 16, 20, 16);
			}
			if (ManaoverlaydisplayconditionProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("mystics:textures/screens/mana2.png"), 48, h - 16, 0, 0, 20, 16, 20, 16);
			}
			if (Mana90Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("mystics:textures/screens/mana_pointpurple.png"), 64, h - 16, 0, 0, 20, 16, 20, 16);
			}
			if (Mana100Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("mystics:textures/screens/mana2.png"), 64, h - 16, 0, 0, 20, 16, 20, 16);
			}
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}

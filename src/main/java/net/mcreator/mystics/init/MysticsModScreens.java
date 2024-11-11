
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mystics.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.mystics.client.gui.NetheriteGUIScreen;
import net.mcreator.mystics.client.gui.LeatherguiScreen;
import net.mcreator.mystics.client.gui.IronguiScreen;
import net.mcreator.mystics.client.gui.GoldguiScreen;
import net.mcreator.mystics.client.gui.DiamondGUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MysticsModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(MysticsModMenus.LEATHERGUI.get(), LeatherguiScreen::new);
			MenuScreens.register(MysticsModMenus.IRONGUI.get(), IronguiScreen::new);
			MenuScreens.register(MysticsModMenus.GOLDGUI.get(), GoldguiScreen::new);
			MenuScreens.register(MysticsModMenus.DIAMOND_GUI.get(), DiamondGUIScreen::new);
			MenuScreens.register(MysticsModMenus.NETHERITE_GUI.get(), NetheriteGUIScreen::new);
		});
	}
}

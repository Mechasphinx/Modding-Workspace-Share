
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mystics.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.mystics.client.model.Modelice;
import net.mcreator.mystics.client.model.Modelhat_Converted;
import net.mcreator.mystics.client.model.Modelfirehat;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class MysticsModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelice.LAYER_LOCATION, Modelice::createBodyLayer);
		event.registerLayerDefinition(Modelfirehat.LAYER_LOCATION, Modelfirehat::createBodyLayer);
		event.registerLayerDefinition(Modelhat_Converted.LAYER_LOCATION, Modelhat_Converted::createBodyLayer);
	}
}

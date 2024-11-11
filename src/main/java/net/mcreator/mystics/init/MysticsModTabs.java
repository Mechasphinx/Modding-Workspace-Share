
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mystics.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.mystics.MysticsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MysticsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MysticsMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(MysticsModItems.BEGINNER_WAND.get());
			tabData.accept(MysticsModItems.NEOPHYTE_WAND.get());
			tabData.accept(MysticsModItems.MAGE_WAND.get());
			tabData.accept(MysticsModItems.FIREBALL.get());
			tabData.accept(MysticsModItems.HEATWAVE.get());
			tabData.accept(MysticsModItems.HADES.get());
			tabData.accept(MysticsModItems.FIREBOLT.get());
			tabData.accept(MysticsModItems.NETHER_TELEPORT.get());
			tabData.accept(MysticsModItems.FROST.get());
			tabData.accept(MysticsModItems.ICICLE.get());
			tabData.accept(MysticsModItems.HAILSTROM.get());
			tabData.accept(MysticsModItems.HOARFROST.get());
			tabData.accept(MysticsModItems.JACK_FROST.get());
			tabData.accept(MysticsModItems.QUICKSAND.get());
			tabData.accept(MysticsModItems.FANGSTRIKE.get());
			tabData.accept(MysticsModItems.TELEPORT.get());
			tabData.accept(MysticsModItems.SUMMON_STORM.get());
			tabData.accept(MysticsModItems.THOU_SHALT_LOVE.get());
			tabData.accept(MysticsModItems.PRIEST_SCEPTER.get());
			tabData.accept(MysticsModItems.SUMMON_ORE.get());
			tabData.accept(MysticsModItems.ROCK_DEFENCE.get());
			tabData.accept(MysticsModItems.DRAGON_FIREBALL.get());
			tabData.accept(MysticsModItems.LIGHTNING_STRIKE.get());
			tabData.accept(MysticsModItems.WANDERING_TRADER_ARMOR_HELMET.get());
			tabData.accept(MysticsModItems.WANDERING_TRADER_ARMOR_CHESTPLATE.get());
			tabData.accept(MysticsModItems.WANDERING_TRADER_ARMOR_LEGGINGS.get());
			tabData.accept(MysticsModItems.WANDERING_TRADER_ARMOR_BOOTS.get());
			tabData.accept(MysticsModItems.FIRE_ROBES_HELMET.get());
			tabData.accept(MysticsModItems.FIRE_ROBES_CHESTPLATE.get());
			tabData.accept(MysticsModItems.FIRE_ROBES_LEGGINGS.get());
			tabData.accept(MysticsModItems.FIRE_ROBES_BOOTS.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(MysticsModItems.LEATHER_SPELLBOOK.get());
			tabData.accept(MysticsModItems.IRON_SPELLBOOK.get());
			tabData.accept(MysticsModItems.GOLD_SPELLBOOK.get());
			tabData.accept(MysticsModItems.DIAMOND_SPELLBOOK.get());
			tabData.accept(MysticsModItems.NETHERITE_SPELLBOOK.get());
		}
	}
}

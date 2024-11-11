
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mystics.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.mystics.MysticsMod;

public class MysticsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MysticsMod.MODID);
	public static final RegistryObject<CreativeModeTab> SPELLS_AND_SPELLBOOKS = REGISTRY.register("spells_and_spellbooks",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.mystics.spells_and_spellbooks")).icon(() -> new ItemStack(MysticsModItems.IRON_SPELLBOOK.get())).displayItems((parameters, tabData) -> {
				tabData.accept(MysticsModItems.LEATHER_SPELLBOOK.get());
				tabData.accept(MysticsModItems.IRON_SPELLBOOK.get());
				tabData.accept(MysticsModItems.GOLD_SPELLBOOK.get());
				tabData.accept(MysticsModItems.DIAMOND_SPELLBOOK.get());
				tabData.accept(MysticsModItems.NETHERITE_SPELLBOOK.get());
				tabData.accept(MysticsModItems.FIREBALL.get());
				tabData.accept(MysticsModItems.NETHER_TELEPORT.get());
				tabData.accept(MysticsModItems.FROST.get());
				tabData.accept(MysticsModItems.ICICLE.get());
				tabData.accept(MysticsModItems.JACK_FROST.get());
				tabData.accept(MysticsModItems.QUICKSAND.get());
				tabData.accept(MysticsModItems.FANGSTRIKE.get());
				tabData.accept(MysticsModItems.TELEPORT.get());
				tabData.accept(MysticsModItems.SUMMON_STORM.get());
				tabData.accept(MysticsModItems.THOU_SHALT_LOVE.get());
				tabData.accept(MysticsModItems.SUMMON_ORE.get());
				tabData.accept(MysticsModItems.DRAGON_FIREBALL.get());
				tabData.accept(MysticsModItems.LIGHTNING_STRIKE.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> WANDS_AND_ARMOR = REGISTRY.register("wands_and_armor",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.mystics.wands_and_armor")).icon(() -> new ItemStack(MysticsModItems.WANDERING_TRADER_ARMOR_CHESTPLATE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(MysticsModItems.BEGINNER_WAND.get());
				tabData.accept(MysticsModItems.NEOPHYTE_WAND.get());
				tabData.accept(MysticsModItems.MAGE_WAND.get());
				tabData.accept(MysticsModItems.PRIEST_SCEPTER.get());
				tabData.accept(MysticsModItems.WANDERING_TRADER_ARMOR_HELMET.get());
				tabData.accept(MysticsModItems.WANDERING_TRADER_ARMOR_CHESTPLATE.get());
				tabData.accept(MysticsModItems.WANDERING_TRADER_ARMOR_LEGGINGS.get());
				tabData.accept(MysticsModItems.WANDERING_TRADER_ARMOR_BOOTS.get());
				tabData.accept(MysticsModItems.FIRE_ROBES_HELMET.get());
				tabData.accept(MysticsModItems.FIRE_ROBES_CHESTPLATE.get());
				tabData.accept(MysticsModItems.FIRE_ROBES_LEGGINGS.get());
				tabData.accept(MysticsModItems.FIRE_ROBES_BOOTS.get());
				tabData.accept(MysticsModItems.WIZARDS_STAFF.get());
			})

					.build());
}

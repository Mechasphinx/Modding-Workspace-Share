package net.mcreator.mystics.procedures;

import top.theillusivec4.curios.api.CuriosApi;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.mystics.init.MysticsModItems;

public class SpellbookOverlayProcedureProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(MysticsModItems.LEATHER_SPELLBOOK.get(), lv).isPresent() : false) {
			return true;
		} else if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(MysticsModItems.IRON_SPELLBOOK.get(), lv).isPresent() : false) {
			return true;
		} else if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(MysticsModItems.GOLD_SPELLBOOK.get(), lv).isPresent() : false) {
			return true;
		} else if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(MysticsModItems.DIAMOND_SPELLBOOK.get(), lv).isPresent() : false) {
			return true;
		} else if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(MysticsModItems.NETHERITE_SPELLBOOK.get(), lv).isPresent() : false) {
			return true;
		}
		return false;
	}
}

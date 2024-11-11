package net.mcreator.mystics.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;

import net.mcreator.mystics.network.MysticsModVariables;
import net.mcreator.mystics.init.MysticsModItems;

public class WanderingTraderArmorLeggingsTickEventProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem() == MysticsModItems.WANDERING_TRADER_ARMOR_LEGGINGS.get()) {
			{
				double _setval = (entity.getCapability(MysticsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MysticsModVariables.PlayerVariables())).Max_Mana + 5;
				entity.getCapability(MysticsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Max_Mana = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else {
			{
				double _setval = 100;
				entity.getCapability(MysticsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Max_Mana = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}

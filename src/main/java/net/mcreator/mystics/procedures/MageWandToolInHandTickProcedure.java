package net.mcreator.mystics.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.mystics.network.MysticsModVariables;
import net.mcreator.mystics.init.MysticsModItems;

public class MageWandToolInHandTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == MysticsModItems.MAGE_WAND.get()) {
			{
				double _setval = (entity.getCapability(MysticsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MysticsModVariables.PlayerVariables())).Max_Mana + 100;
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

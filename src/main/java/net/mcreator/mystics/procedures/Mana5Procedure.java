package net.mcreator.mystics.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.mystics.network.MysticsModVariables;

public class Mana5Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity.getCapability(MysticsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MysticsModVariables.PlayerVariables())).mana >= 10
				/ ((entity.getCapability(MysticsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MysticsModVariables.PlayerVariables())).Max_Mana * 100)) {
			return true;
		}
		return false;
	}
}

package net.mcreator.mystics.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.mystics.network.MysticsModVariables;

public class JackFrostEntitySwingsItemProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (!((entity.getCapability(MysticsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MysticsModVariables.PlayerVariables())).mana <= 100)) {
			{
				double _setval = (entity.getCapability(MysticsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MysticsModVariables.PlayerVariables())).mana - 100;
				entity.getCapability(MysticsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.mana = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = EntityType.SNOW_GOLEM.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
				}
			}
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 100);
		}
	}
}

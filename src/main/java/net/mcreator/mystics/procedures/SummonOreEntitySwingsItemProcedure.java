package net.mcreator.mystics.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

import net.mcreator.mystics.network.MysticsModVariables;

public class SummonOreEntitySwingsItemProcedure {
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
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 100);
			if (Mth.nextDouble(RandomSource.create(), 1, 7) == 1) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.COAL_ORE.defaultBlockState(), 3);
			} else if (Mth.nextDouble(RandomSource.create(), 1, 7) == 2) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.GOLD_ORE.defaultBlockState(), 3);
			} else if (Mth.nextDouble(RandomSource.create(), 1, 7) == 3) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.IRON_ORE.defaultBlockState(), 3);
			} else if (Mth.nextDouble(RandomSource.create(), 1, 7) == 4) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.REDSTONE_ORE.defaultBlockState(), 3);
			} else if (Mth.nextDouble(RandomSource.create(), 1, 7) == 5) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.LAPIS_ORE.defaultBlockState(), 3);
			} else if (Mth.nextDouble(RandomSource.create(), 1, 7) == 6) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.EMERALD_ORE.defaultBlockState(), 3);
			} else if (Mth.nextDouble(RandomSource.create(), 1, 7) == 7) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.DIAMOND_ORE.defaultBlockState(), 3);
			}
		}
	}
}

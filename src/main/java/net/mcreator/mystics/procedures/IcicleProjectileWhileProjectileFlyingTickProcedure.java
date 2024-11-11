package net.mcreator.mystics.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.particles.ParticleTypes;

public class IcicleProjectileWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.addParticle(ParticleTypes.SPIT, x, y, z, 0, 1, 0);
		world.addParticle(ParticleTypes.END_ROD, x, y, z, 0, 1, 0);
	}
}


package net.mcreator.mystics.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.mystics.procedures.NetherTeleportEntitySwingsItemProcedure;

public class NetherTeleportItem extends Item {
	public NetherTeleportItem() {
		super(new Item.Properties().stacksTo(1).fireResistant().rarity(Rarity.UNCOMMON));
	}

	@Override
	public boolean onEntitySwing(ItemStack itemstack, LivingEntity entity) {
		boolean retval = super.onEntitySwing(itemstack, entity);
		NetherTeleportEntitySwingsItemProcedure.execute(entity, itemstack);
		return retval;
	}
}

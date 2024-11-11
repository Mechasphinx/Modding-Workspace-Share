
package net.mcreator.mystics.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.mystics.procedures.IcicleEntitySwingsItemProcedure;

public class IcicleItem extends Item {
	public IcicleItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON));
	}

	@Override
	public boolean onEntitySwing(ItemStack itemstack, LivingEntity entity) {
		boolean retval = super.onEntitySwing(itemstack, entity);
		IcicleEntitySwingsItemProcedure.execute(entity, itemstack);
		return retval;
	}
}

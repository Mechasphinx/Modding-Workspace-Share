
package net.mcreator.mystics.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.mystics.procedures.FangstrikeEntitySwingsItemProcedure;

public class FangstrikeItem extends Item {
	public FangstrikeItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.RARE));
	}

	@Override
	public boolean onEntitySwing(ItemStack itemstack, LivingEntity entity) {
		boolean retval = super.onEntitySwing(itemstack, entity);
		FangstrikeEntitySwingsItemProcedure.execute(entity.level(), entity.getY(), entity, itemstack);
		return retval;
	}
}


package net.mcreator.mystics.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.mystics.procedures.LightningStrikeEntitySwingsItemProcedure;

public class LightningStrikeItem extends Item {
	public LightningStrikeItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.RARE));
	}

	@Override
	public boolean onEntitySwing(ItemStack itemstack, LivingEntity entity) {
		boolean retval = super.onEntitySwing(itemstack, entity);
		LightningStrikeEntitySwingsItemProcedure.execute(entity.level(), entity.getX(), entity.getZ(), entity, itemstack);
		return retval;
	}
}

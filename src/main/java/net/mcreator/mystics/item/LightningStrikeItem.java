
package net.mcreator.mystics.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class LightningStrikeItem extends Item {
	public LightningStrikeItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.RARE));
	}
}

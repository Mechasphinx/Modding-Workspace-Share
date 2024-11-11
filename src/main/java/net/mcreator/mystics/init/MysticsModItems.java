
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mystics.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.mystics.item.WanderingTraderArmorItem;
import net.mcreator.mystics.item.ThouShaltLoveItem;
import net.mcreator.mystics.item.TeleportItem;
import net.mcreator.mystics.item.SummonStormItem;
import net.mcreator.mystics.item.SummonOreItem;
import net.mcreator.mystics.item.RockDefenceItem;
import net.mcreator.mystics.item.QuicksandItem;
import net.mcreator.mystics.item.PriestScepterItem;
import net.mcreator.mystics.item.NetheriteSpellbookItem;
import net.mcreator.mystics.item.NetherTeleportItem;
import net.mcreator.mystics.item.NeophyteWandItem;
import net.mcreator.mystics.item.MageWandItem;
import net.mcreator.mystics.item.LightningStrikeItem;
import net.mcreator.mystics.item.LeatherSpellbookItem;
import net.mcreator.mystics.item.JackFrostItem;
import net.mcreator.mystics.item.IronSpellbookItem;
import net.mcreator.mystics.item.IcicleItem;
import net.mcreator.mystics.item.HoarfrostItem;
import net.mcreator.mystics.item.HeatwaveItem;
import net.mcreator.mystics.item.HailstromItem;
import net.mcreator.mystics.item.HadesItem;
import net.mcreator.mystics.item.GoldSpellbookItem;
import net.mcreator.mystics.item.FrostItem;
import net.mcreator.mystics.item.FireboltItem;
import net.mcreator.mystics.item.FireballItem;
import net.mcreator.mystics.item.FireRobesItem;
import net.mcreator.mystics.item.FangstrikeItem;
import net.mcreator.mystics.item.DragonFireballItem;
import net.mcreator.mystics.item.DiamondSpellbookItem;
import net.mcreator.mystics.item.BeginnerWandItem;
import net.mcreator.mystics.MysticsMod;

public class MysticsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MysticsMod.MODID);
	public static final RegistryObject<Item> BEGINNER_WAND = REGISTRY.register("beginner_wand", () -> new BeginnerWandItem());
	public static final RegistryObject<Item> NEOPHYTE_WAND = REGISTRY.register("neophyte_wand", () -> new NeophyteWandItem());
	public static final RegistryObject<Item> MAGE_WAND = REGISTRY.register("mage_wand", () -> new MageWandItem());
	public static final RegistryObject<Item> LEATHER_SPELLBOOK = REGISTRY.register("leather_spellbook", () -> new LeatherSpellbookItem());
	public static final RegistryObject<Item> IRON_SPELLBOOK = REGISTRY.register("iron_spellbook", () -> new IronSpellbookItem());
	public static final RegistryObject<Item> GOLD_SPELLBOOK = REGISTRY.register("gold_spellbook", () -> new GoldSpellbookItem());
	public static final RegistryObject<Item> DIAMOND_SPELLBOOK = REGISTRY.register("diamond_spellbook", () -> new DiamondSpellbookItem());
	public static final RegistryObject<Item> NETHERITE_SPELLBOOK = REGISTRY.register("netherite_spellbook", () -> new NetheriteSpellbookItem());
	public static final RegistryObject<Item> FIREBALL = REGISTRY.register("fireball", () -> new FireballItem());
	public static final RegistryObject<Item> HEATWAVE = REGISTRY.register("heatwave", () -> new HeatwaveItem());
	public static final RegistryObject<Item> HADES = REGISTRY.register("hades", () -> new HadesItem());
	public static final RegistryObject<Item> FIREBOLT = REGISTRY.register("firebolt", () -> new FireboltItem());
	public static final RegistryObject<Item> NETHER_TELEPORT = REGISTRY.register("nether_teleport", () -> new NetherTeleportItem());
	public static final RegistryObject<Item> FROST = REGISTRY.register("frost", () -> new FrostItem());
	public static final RegistryObject<Item> ICICLE = REGISTRY.register("icicle", () -> new IcicleItem());
	public static final RegistryObject<Item> HAILSTROM = REGISTRY.register("hailstrom", () -> new HailstromItem());
	public static final RegistryObject<Item> HOARFROST = REGISTRY.register("hoarfrost", () -> new HoarfrostItem());
	public static final RegistryObject<Item> JACK_FROST = REGISTRY.register("jack_frost", () -> new JackFrostItem());
	public static final RegistryObject<Item> QUICKSAND = REGISTRY.register("quicksand", () -> new QuicksandItem());
	public static final RegistryObject<Item> FANGSTRIKE = REGISTRY.register("fangstrike", () -> new FangstrikeItem());
	public static final RegistryObject<Item> TELEPORT = REGISTRY.register("teleport", () -> new TeleportItem());
	public static final RegistryObject<Item> SUMMON_STORM = REGISTRY.register("summon_storm", () -> new SummonStormItem());
	public static final RegistryObject<Item> THOU_SHALT_LOVE = REGISTRY.register("thou_shalt_love", () -> new ThouShaltLoveItem());
	public static final RegistryObject<Item> PRIEST_SCEPTER = REGISTRY.register("priest_scepter", () -> new PriestScepterItem());
	public static final RegistryObject<Item> SUMMON_ORE = REGISTRY.register("summon_ore", () -> new SummonOreItem());
	public static final RegistryObject<Item> ROCK_DEFENCE = REGISTRY.register("rock_defence", () -> new RockDefenceItem());
	public static final RegistryObject<Item> DRAGON_FIREBALL = REGISTRY.register("dragon_fireball", () -> new DragonFireballItem());
	public static final RegistryObject<Item> LIGHTNING_STRIKE = REGISTRY.register("lightning_strike", () -> new LightningStrikeItem());
	public static final RegistryObject<Item> WANDERING_TRADER_ARMOR_HELMET = REGISTRY.register("wandering_trader_armor_helmet", () -> new WanderingTraderArmorItem.Helmet());
	public static final RegistryObject<Item> WANDERING_TRADER_ARMOR_CHESTPLATE = REGISTRY.register("wandering_trader_armor_chestplate", () -> new WanderingTraderArmorItem.Chestplate());
	public static final RegistryObject<Item> WANDERING_TRADER_ARMOR_LEGGINGS = REGISTRY.register("wandering_trader_armor_leggings", () -> new WanderingTraderArmorItem.Leggings());
	public static final RegistryObject<Item> WANDERING_TRADER_ARMOR_BOOTS = REGISTRY.register("wandering_trader_armor_boots", () -> new WanderingTraderArmorItem.Boots());
	public static final RegistryObject<Item> FIRE_ROBES_HELMET = REGISTRY.register("fire_robes_helmet", () -> new FireRobesItem.Helmet());
	public static final RegistryObject<Item> FIRE_ROBES_CHESTPLATE = REGISTRY.register("fire_robes_chestplate", () -> new FireRobesItem.Chestplate());
	public static final RegistryObject<Item> FIRE_ROBES_LEGGINGS = REGISTRY.register("fire_robes_leggings", () -> new FireRobesItem.Leggings());
	public static final RegistryObject<Item> FIRE_ROBES_BOOTS = REGISTRY.register("fire_robes_boots", () -> new FireRobesItem.Boots());
	// Start of user code block custom items
	// End of user code block custom items
}


/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mystics.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.mystics.world.inventory.NetheriteGUIMenu;
import net.mcreator.mystics.world.inventory.LeatherguiMenu;
import net.mcreator.mystics.world.inventory.IronguiMenu;
import net.mcreator.mystics.world.inventory.GoldguiMenu;
import net.mcreator.mystics.world.inventory.DiamondGUIMenu;
import net.mcreator.mystics.MysticsMod;

public class MysticsModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, MysticsMod.MODID);
	public static final RegistryObject<MenuType<LeatherguiMenu>> LEATHERGUI = REGISTRY.register("leathergui", () -> IForgeMenuType.create(LeatherguiMenu::new));
	public static final RegistryObject<MenuType<IronguiMenu>> IRONGUI = REGISTRY.register("irongui", () -> IForgeMenuType.create(IronguiMenu::new));
	public static final RegistryObject<MenuType<GoldguiMenu>> GOLDGUI = REGISTRY.register("goldgui", () -> IForgeMenuType.create(GoldguiMenu::new));
	public static final RegistryObject<MenuType<DiamondGUIMenu>> DIAMOND_GUI = REGISTRY.register("diamond_gui", () -> IForgeMenuType.create(DiamondGUIMenu::new));
	public static final RegistryObject<MenuType<NetheriteGUIMenu>> NETHERITE_GUI = REGISTRY.register("netherite_gui", () -> IForgeMenuType.create(NetheriteGUIMenu::new));
}

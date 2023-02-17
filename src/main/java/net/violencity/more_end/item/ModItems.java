package net.violencity.more_end.item;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.violencity.more_end.MoreEnd;
import net.violencity.more_end.item.custom.ModArmorMaterial;
import net.violencity.more_end.item.custom.ModItemTier;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MoreEnd.MOD_ID);


    public static final RegistryObject<Item> RAW_ENDERITE = ITEMS.register("raw_enderite",
            () -> new Item(new Item.Properties().stacksTo(64).tab(ModCreativeModeTab.MORE_END).fireResistant()));

    public static final RegistryObject<Item> PURIFIED_ENDERITE = ITEMS.register("purified_enderite",
            () -> new Item(new Item.Properties().stacksTo(64).tab(ModCreativeModeTab.MORE_END).fireResistant()));

    public static final RegistryObject<Item> ENDIUM = ITEMS.register("endium",
            () -> new Item(new Item.Properties().stacksTo(64).tab(ModCreativeModeTab.MORE_END).fireResistant()));

    public static final RegistryObject<Item> ENDERITE_HELMET = ITEMS.register("enderite_helmet",
            () -> new ArmorItem(ModArmorMaterial.ENDERITE_GEAR, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.MORE_END)));

    public static final RegistryObject<Item> ENDERITE_CHESTPLATE = ITEMS.register("enderite_chestplate",
            () -> new ArmorItem(ModArmorMaterial.ENDERITE_GEAR, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.MORE_END)));

    public static final RegistryObject<Item> ENDERITE_LEGGINGS = ITEMS.register("enderite_leggings",
            () -> new ArmorItem(ModArmorMaterial.ENDERITE_GEAR, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.MORE_END)));

    public static final RegistryObject<Item> ENDERITE_BOOTS = ITEMS.register("enderite_boots",
            () -> new ArmorItem(ModArmorMaterial.ENDERITE_GEAR, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.MORE_END)));

    public static final RegistryObject<Item> ENDIUM_HELMET = ITEMS.register("endium_helmet",
            () -> new ArmorItem(ModArmorMaterial.ENDIUM_GEAR, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.MORE_END)));

    public static final RegistryObject<Item> ENDIUM_CHESTPLATE = ITEMS.register("endium_chestplate",
            () -> new ArmorItem(ModArmorMaterial.ENDIUM_GEAR, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.MORE_END)));

    public static final RegistryObject<Item> ENDIUM_LEGGINGS = ITEMS.register("endium_leggings",
            () -> new ArmorItem(ModArmorMaterial.ENDIUM_GEAR, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.MORE_END)));

    public static final RegistryObject<Item> ENDIUM_BOOTS = ITEMS.register("endium_boots",
            () -> new ArmorItem(ModArmorMaterial.ENDIUM_GEAR, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.MORE_END)));

    public static final RegistryObject<Item> ENDERITE_SWORD = ITEMS.register("enderite_sword",
            () -> new SwordItem(ModItemTier.ENDERITE_TOOLS, 2, -2.4F, new Item.Properties().tab(ModCreativeModeTab.MORE_END)));

    public static final RegistryObject<Item> ENDIUM_SWORD = ITEMS.register("endium_sword",
            () -> new SwordItem(ModItemTier.ENDIUM_TOOLS, 5, -1.0F, new Item.Properties().tab(ModCreativeModeTab.MORE_END)));

    public static final RegistryObject<Item> ENDIUM_AXE = ITEMS.register("endium_axe",
            () -> new AxeItem(ModItemTier.ENDIUM_TOOLS, 6, -1.0F, new Item.Properties().tab(ModCreativeModeTab.MORE_END)));

    public static final RegistryObject<Item> CRYSTAL_HEART = ITEMS.register("crystal_heart",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MORE_END).fireResistant().stacksTo(64)));

    public static final RegistryObject<Item> WARDEN_SOUL = ITEMS.register("warden_soul",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MORE_END).fireResistant().stacksTo(64)));




    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}

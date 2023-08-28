package net.m4rk34.marks_mod.item;

import net.m4rk34.marks_mod.ExampleMod;
import net.m4rk34.marks_mod.item.custom.FuelItem;
import net.m4rk34.marks_mod.item.custom.MetalDetectorItem;
import net.m4rk34.marks_mod.item.custom.ModArmorItem;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ExampleMod.MOD_ID);

    public static final RegistryObject<Item> PINK_DIAMOND = ITEMS.register("pink_diamond",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PINK_DIAMOND_STAFF = ITEMS.register("pink_diamond_staff",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PINE_CONE = ITEMS.register("pine_cone",
            () -> new FuelItem(new Item.Properties(), 400));
    public static final RegistryObject<Item> BUBLIKI = ITEMS.register("bubliki",
            () -> new Item(new Item.Properties().food(ModFoods.BUBLIKI).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector",
            () -> new MetalDetectorItem(new Item.Properties().durability(100)));

    public static final RegistryObject<Item> PINK_DIAMOND_SWORD = ITEMS.register("pink_diamond_sword",
            () -> new SwordItem(ModToolTiers.PINK_DIAMOND, 3, -2.4F, new Item.Properties()));
    public static final RegistryObject<Item> PINK_DIAMOND_PICKAXE = ITEMS.register("pink_diamond_pickaxe",
            () -> new PickaxeItem(ModToolTiers.PINK_DIAMOND, 1, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> PINK_DIAMOND_AXE = ITEMS.register("pink_diamond_axe",
            () -> new AxeItem(ModToolTiers.PINK_DIAMOND, 5.0F, -3.0F, new Item.Properties()));
    public static final RegistryObject<Item> PINK_DIAMOND_SHOVEL = ITEMS.register("pink_diamond_shovel",
            () -> new ShovelItem(ModToolTiers.PINK_DIAMOND, 1.5F, -3.0F, new Item.Properties()));
    public static final RegistryObject<Item> PINK_DIAMOND_HOE = ITEMS.register("pink_diamond_hoe",
            () -> new HoeItem(ModToolTiers.PINK_DIAMOND, -3, 0.0F, new Item.Properties()));


    public static final RegistryObject<Item> PINK_DIAMOND_HELMET = ITEMS.register("pink_diamond_helmet",
            () -> new ModArmorItem(ModArmorMaterials.PINK_DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> PINK_DIAMOND_CHESTPLATE = ITEMS.register("pink_diamond_chestplate",
            () -> new ArmorItem(ModArmorMaterials.PINK_DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> PINK_DIAMOND_LEGGINGS = ITEMS.register("pink_diamond_leggings",
            () -> new ArmorItem(ModArmorMaterials.PINK_DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> PINK_DIAMOND_BOOTS = ITEMS.register("pink_diamond_boots",
            () -> new ArmorItem(ModArmorMaterials.PINK_DIAMOND, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
package net.m4rk34.marks_mod.item;

import net.m4rk34.marks_mod.ExampleMod;
import net.m4rk34.marks_mod.item.custom.FuelItem;
import net.m4rk34.marks_mod.item.custom.MetalDetectorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ExampleMod.MOD_ID);

    public static final RegistryObject<Item> PINK_DIAMOND = ITEMS.register("pink_diamond",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PINE_CONE = ITEMS.register("pine_cone",
            () -> new FuelItem(new Item.Properties(), 400));
    public static final RegistryObject<Item> BUBLIKI = ITEMS.register("bubliki",
            () -> new Item(new Item.Properties().food(ModFoods.BUBLIKI).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector",
            () -> new MetalDetectorItem(new Item.Properties().durability(100)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
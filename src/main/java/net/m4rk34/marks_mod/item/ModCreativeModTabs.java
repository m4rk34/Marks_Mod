package net.m4rk34.marks_mod.item;

import net.m4rk34.marks_mod.ExampleMod;
import net.m4rk34.marks_mod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ExampleMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MARK_TAB = CREATIVE_MODE_TABS.register("mark_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.PINK_DIAMOND.get()))
                    .title(Component.translatable("creativetab.mark_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.PINK_DIAMOND.get());

                        pOutput.accept(ModBlocks.PINK_DIAMOND_BLOCK.get());

                        pOutput.accept((ModBlocks.CHOOKIE_ORE.get()));
                        pOutput.accept((ModItems.METAL_DETECTOR.get()));

                        pOutput.accept(ModBlocks.SOUND_BLOCK.get());

                        pOutput.accept((ModItems.BUBLIKI.get()));
                        pOutput.accept((ModItems.PINE_CONE.get()));
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}

package net.m4rk34.marks_mod.item;

import net.m4rk34.marks_mod.ExampleMod;
import net.m4rk34.marks_mod.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier PINK_DIAMOND = TierSortingRegistry.registerTier(
            new ForgeTier(3, 1561, 8.0f, 3.0f, 10,
                    ModTags.Blocks.NEEDS_PINK_DIAMOND_TOOL, () -> Ingredient.of(ModItems.PINK_DIAMOND.get())),
            new ResourceLocation(ExampleMod.MOD_ID, "pink_diamond"), List.of(Tiers.NETHERITE), List.of());
}

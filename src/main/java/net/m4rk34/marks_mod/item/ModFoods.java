package net.m4rk34.marks_mod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {

    public static final FoodProperties BUBLIKI = new FoodProperties.Builder().fast().alwaysEat().nutrition(2)
            .saturationMod(0.2f)
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 8000, 5), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 3000, 2), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 8000, 1), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 8000, 2), 1.0f)
            .build();
    public static final FoodProperties STRAWBERRY = new FoodProperties.Builder().nutrition(2)
            .saturationMod(0.2f)
            .build();
}

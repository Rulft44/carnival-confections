package net.rulft.carnivalconfections.init;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static final FoodComponent CANDIED_APPLE = new FoodComponent.Builder().nutrition(6).saturationModifier(1f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 350, 1), 1f).build();
    public static final FoodComponent POPCORN = new FoodComponent.Builder().nutrition(8).saturationModifier(2f).build();
    public static final FoodComponent STRONG_CANDY = new FoodComponent.Builder().nutrition(2).alwaysEdible().snack().statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 400, 1), 1f).statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 400, 1), 1f).saturationModifier(0.5f).build();
    public static final FoodComponent ENERGETIC_CANDY = new FoodComponent.Builder().nutrition(2).alwaysEdible().snack().statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 400, 1), 1f).statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 400, 1), 1f).saturationModifier(0.5f).build();
    public static final FoodComponent SPECIAL_CANDY = new FoodComponent.Builder().nutrition(2).alwaysEdible().snack().statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 400, 1), 1f).saturationModifier(0.5f).build();
    public static final FoodComponent WISP_CANDY = new FoodComponent.Builder().nutrition(2).alwaysEdible().snack().statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 400, 1), 1f).statusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, 400, 1), 1f).saturationModifier(0.5f).build();
}

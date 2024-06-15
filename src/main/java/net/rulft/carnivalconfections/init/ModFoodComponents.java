package net.rulft.carnivalconfections.init;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static final FoodComponent CANDIED_APPLE = new FoodComponent.Builder().nutrition(6).saturationModifier(1f).build();
    public static final FoodComponent CANDY = new FoodComponent.Builder().nutrition(2).alwaysEdible().snack().statusEffect(new StatusEffectInstance(StatusEffects., 100, 1), 0.1f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100, 1), 0.1f).statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 100, 1), 0.1f).saturationModifier(0.5f).build();
}

package net.rulft.carnivalconfections.effect;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.rulft.carnivalconfections.CarnivalConfections;

public class ModEffects {
    public static StatusEffect GHOST;

    public static StatusEffect registerStatusEffect(String name) {
        return Registry.register(Registries.STATUS_EFFECT, Identifier.of(CarnivalConfections.MOD_ID, name),
                new GhostEffect(StatusEffectCategory.NEUTRAL, 12308678));

    }

    public static void registerEffects() {
        GHOST = registerStatusEffect("ghost");
    }
}

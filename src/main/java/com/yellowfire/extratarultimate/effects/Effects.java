package com.yellowfire.extratarultimate.effects;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class Effects {
    public static final StatusEffect INVULNERABILITY = new Invulnerability();

    public static void register(Function<String, Identifier> id) {
        Registry.register(Registries.STATUS_EFFECT, id.apply("invulnerability"), INVULNERABILITY);
    }
}

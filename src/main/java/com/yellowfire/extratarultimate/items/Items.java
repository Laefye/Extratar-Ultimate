package com.yellowfire.extratarultimate.items;

import com.yellowfire.extratarultimate.Sounds;
import com.yellowfire.extratarultimate.effects.Effects;
import com.yellowfire.extratarultimate.entities.Entities;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.function.Function;

public class Items {
    public static ArrayList<Item> items = new ArrayList<>();

    public static Item YELLOW_PEACH = new Item(new FabricItemSettings().food(new FoodComponent.Builder()
            .hunger(5)
            .snack()
            .build())
    );

    public static Item TRIANGLE = new Item(new FabricItemSettings().food(new FoodComponent.Builder()
            .hunger(7)
            .snack()
            .build())
    );

    public static Item GOLDEN_TRIANGLE = new Item(new FabricItemSettings().food(new FoodComponent.Builder()
                    .hunger(7)
                    .snack()
                    .alwaysEdible()
                    .statusEffect(new StatusEffectInstance(
                            StatusEffects.ABSORPTION,
                            60 * 20,
                            1
                    ), 1)
                    .statusEffect(new StatusEffectInstance(
                            StatusEffects.REGENERATION,
                            10 * 20
                    ), 1)
                    .build())
    );

    public static Item ENCHANTED_GOLDEN_TRIANGLE = new EnchantedGoldenAppleItem(new FabricItemSettings().food(new FoodComponent.Builder()
                    .hunger(7)
                    .snack()
                    .alwaysEdible()
                    .statusEffect(new StatusEffectInstance(
                            StatusEffects.ABSORPTION,
                            90 * 20,
                            1
                    ), 1)
                    .statusEffect(new StatusEffectInstance(
                            StatusEffects.RESISTANCE,
                            3 * 60 * 20
                    ), 1)
                    .statusEffect(new StatusEffectInstance(
                            StatusEffects.REGENERATION,
                            20 * 20,
                            1
                    ), 1)
                    .statusEffect(new StatusEffectInstance(
                            StatusEffects.FIRE_RESISTANCE,
                            3 * 60 * 20
                    ), 1)
                    .build())
    );

    public static Item CHUK_CHUK = new Item(new FabricItemSettings().food(new FoodComponent.Builder()
                    .hunger(4)
                    .snack()
                    .build())
    );

    public static Item BOILED_WATER_BOTTLE = new BottleFoodItem(new FabricItemSettings()
            .food(new FoodComponent.Builder()
                    .hunger(4)
                    .snack()
                    .build())
            .maxCount(16)
    );

    public static Item TEA_WITH_MILK_BOTTLE = new BottleFoodItem(new FabricItemSettings()
            .food(new FoodComponent.Builder()
                    .hunger(4)
                    .snack()
                    .build())
            .maxCount(16)
    );

    public static Item ASTRA_SYRUP_BOTTLE = new BottleFoodItem(new FabricItemSettings()
            .food(new FoodComponent.Builder()
                    .hunger(4)
                    .snack()
                    .statusEffect(new StatusEffectInstance(Effects.INVULNERABILITY, 30 * 20), 1)
                    .build())
            .maxCount(16),
            true
    );

    public static Item PANACEA = new Panacea(new FabricItemSettings()
            .food(new FoodComponent.Builder()
                    .hunger(1)
                    .snack()
                    .alwaysEdible()
                    .build())
    );

    public static Item LUMINOUS_STEW = new StewItem(new FabricItemSettings()
            .food(new FoodComponent.Builder()
                    .hunger(3)
                    .snack()
                    .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 5*20), 1)
                    .build())
            .maxCount(1)
    );

    public static Item RAW_TELDER_STEEL = new Item(new FabricItemSettings());
    public static Item EARTH_CRYSTAL = new Item(new FabricItemSettings());
    public static Item NETHER_CRYSTAL = new Item(new FabricItemSettings());
    public static Item END_CRYSTAL = new Item(new FabricItemSettings());
    public static Item TELDER_PULVERIS = new TelderPulveris(new FabricItemSettings());
    public static Item TELDER_STEEL_INGOT = new Item(new FabricItemSettings());
    public static Item TELDER_STEEL_NUGGET = new Item(new FabricItemSettings());
    public static Item TELDER_STEEL_GEAR = new Item(new FabricItemSettings());
    public static Item TELDER_CLOTH = new ClothItem(new FabricItemSettings());
    public static Item TELDER_MAGIC_CLOTH = new MagicClothItem(new FabricItemSettings());
    public static Item TELDER_FLEECE = new Item(new FabricItemSettings());
    public static Item ASTRA_PETAL = new Item(new FabricItemSettings());
    public static Item YELLOW_PEACH_DISC = new MusicDiscItem(15, Sounds.YELLOW_PEACH_RECORD, new FabricItemSettings(), 3 * 60 + 15);
    public static Item TRIANGLE_DISC = new MusicDiscItem(15, Sounds.TRIANGLE_RECORD, new FabricItemSettings(), 2 * 60 + 54);
    public static Item FENNEC_SPAWN_EGG = new SpawnEggItem(Entities.FENNEC, 0x8a5741, 0xdbd0c2, new FabricItemSettings());


    public static void register(Function<String, Identifier> id) {
        registerItem(YELLOW_PEACH, "yellow_peach", id);
        registerItem(TRIANGLE, "triangle", id);
        registerItem(GOLDEN_TRIANGLE, "golden_triangle", id);
        registerItem(ENCHANTED_GOLDEN_TRIANGLE, "enchanted_golden_triangle", id);
        registerItem(CHUK_CHUK, "chuk_chuk", id);
        registerItem(BOILED_WATER_BOTTLE, "boiled_water_bottle", id);
        registerItem(TEA_WITH_MILK_BOTTLE, "tea_with_milk_bottle", id);
        registerItem(ASTRA_SYRUP_BOTTLE, "astra_syrup_bottle", id);
        registerItem(PANACEA, "panacea", id);
        registerItem(LUMINOUS_STEW, "luminous_stew", id);
        registerItem(RAW_TELDER_STEEL, "raw_telder_steel", id);
        registerItem(EARTH_CRYSTAL, "earth_crystal", id);
        registerItem(NETHER_CRYSTAL, "nether_crystal", id);
        registerItem(END_CRYSTAL, "end_crystal", id);
        registerItem(TELDER_PULVERIS, "telder_pulveris", id);
        registerItem(TELDER_STEEL_INGOT, "telder_steel_ingot", id);
        registerItem(TELDER_STEEL_NUGGET, "telder_steel_nugget", id);
        registerItem(TELDER_STEEL_GEAR, "telder_steel_gear", id);
        registerItem(TELDER_CLOTH, "telder_cloth", id);
        registerItem(TELDER_MAGIC_CLOTH, "telder_magic_cloth", id);
        registerItem(TELDER_FLEECE, "telder_fleece", id);
        registerItem(ASTRA_PETAL, "astra_petal", id);
        registerItem(YELLOW_PEACH_DISC, "yellow_peach_disc", id);
        registerItem(TRIANGLE_DISC, "triangle_disc", id);
        registerItem(FENNEC_SPAWN_EGG, "fennec_spawn_egg", id);
    }

    private static void registerItem(Item item, String path, Function<String, Identifier> id) {
        items.add(item);
        Registry.register(Registries.ITEM, id.apply(path), item);
    }
}

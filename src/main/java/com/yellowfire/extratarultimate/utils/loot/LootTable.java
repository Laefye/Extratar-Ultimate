package com.yellowfire.extratarultimate.utils.loot;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.random.Random;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public record LootTable(ArrayList<Loot> loots, ArrayList<AbstractFunction> functions) {



    private static class AbstractFunction {
        public Optional<Function<Random, Integer>> getCount() {
            return Optional.empty();
        }
    }

    private static class RandomCount extends AbstractFunction {
        private final int min;
        private final int max;

        public RandomCount(int min, int max) {
            this.min = min;
            this.max = max;
        }

        @Override
        public Optional<Function<Random, Integer>> getCount() {
            return Optional.of(random -> random.nextBetween(min, max));
        }
    }

    public record Loot(Item item, ArrayList<AbstractFunction> functions) {
        private int getCount(Random random) {
            int count = 0;
            for (var func : functions) {
                var c = func.getCount();
                if (c.isPresent()) {
                    count = c.get().apply(random);
                }
            }
            return count;
        }
    }

    public static class LootGenerator {
        private final ArrayList<AbstractFunction> functions = new ArrayList<>();
        private Item item = null;

        public LootGenerator addRandomCount(int min, int max) {
            functions.add(new RandomCount(min, max));
            return this;
        }

        public Loot build() {
            return new Loot(item, functions);
        }
    }

    public static class LootTableGenerator {
        private final ArrayList<AbstractFunction> functions = new ArrayList<>();
        private ArrayList<Loot> loots = null;

        public LootTableGenerator addRandomCount(int min, int max) {
            functions.add(new RandomCount(min, max));
            return this;
        }

        public LootTable build() {
            return new LootTable(loots, functions);
        }
    }

    public static LootGenerator of(Item item) {
        var generator = new LootGenerator();
        generator.item = item;
        return generator;
    }

    public static LootTableGenerator of(Loot... loots) {
        var generator = new LootTableGenerator();
        generator.loots = new ArrayList<>(List.of(loots));
        return generator;
    }

    private int getCount(Random random) {
        int count = 0;
        for (var func : functions) {
            var c = func.getCount();
            if (c.isPresent()) {
                count = c.get().apply(random);
            }
        }
        return count;
    }

    private ItemStack getRandomItemStack(Random random) {
        var loot = loots.get(random.nextInt(loots.size()));
        return new ItemStack(loot.item, loot.getCount(random));
    }

    public ArrayList<ItemStack> execute(Random random) {
        var stacks = new ArrayList<ItemStack>();
        for (int i = 0; i < getCount(random); i++) {
            stacks.add(getRandomItemStack(random));
        }
        return stacks;
    }
}

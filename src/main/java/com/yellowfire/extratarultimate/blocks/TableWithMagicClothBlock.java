package com.yellowfire.extratarultimate.blocks;

import com.yellowfire.extratarultimate.items.Items;
import com.yellowfire.extratarultimate.utils.loot.LootTable;
import net.minecraft.entity.ItemEntity;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class TableWithMagicClothBlock extends TableBlock {

    public TableWithMagicClothBlock(Settings settings) {
        super(settings);
    }

    private static final LootTable LOOT_TABLE = LootTable.of(
            LootTable.of(Items.TRIANGLE).addRandomCount(1, 2).build(),
            LootTable.of(Items.CHUK_CHUK).addRandomCount(1, 2).build(),
            LootTable.of(net.minecraft.item.Items.APPLE).addRandomCount(1, 5).build(),
            LootTable.of(net.minecraft.item.Items.BAKED_POTATO).addRandomCount(1, 2).build(),
            LootTable.of(net.minecraft.item.Items.CARROT).addRandomCount(1, 3).build(),
            LootTable.of(net.minecraft.item.Items.COOKED_BEEF).addRandomCount(1, 2).build(),
            LootTable.of(net.minecraft.item.Items.COOKED_CHICKEN).addRandomCount(1, 2).build(),
            LootTable.of(net.minecraft.item.Items.COOKED_COD).addRandomCount(1, 2).build(),
            LootTable.of(net.minecraft.item.Items.COOKED_SALMON).addRandomCount(1, 2).build()
    ).addRandomCount(1, 5).build();

    public void generateFood(World world, Vec3d center) {
        for (var stack : LOOT_TABLE.execute(world.random)) {
            var itemEntity = new ItemEntity(world, center.x, center.y, center.z, stack);
            itemEntity.setVelocity(Items.getItemVelocity(world));
            world.spawnEntity(itemEntity);
        }
    }

    public void generateParticles(World world, Vec3d center) {
        for (int i = 0; i < 50; i++) {
            var offX = world.random.nextFloat() * 1 - 0.5;
            var offY = world.random.nextFloat() * 0.5 - 0.25;
            var offZ = world.random.nextFloat() * 1 - 0.5;
            world.addParticle(ParticleTypes.SOUL_FIRE_FLAME, center.x + offX, center.y + offY, center.z + offZ, 0,0,0);
        }
    }
}

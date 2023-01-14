package com.yellowfire.extratarultimate.blocks;

import com.yellowfire.extratarultimate.items.Items;
import com.yellowfire.extratarultimate.utils.loot.LootTable;
import net.minecraft.entity.ItemEntity;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import java.util.stream.Collectors;

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

    public void generateParticles(ServerWorld world, Vec3d center) {
        var players = world.getPlayers().stream()
                .filter(player -> player.getPos().distanceTo(center) < 100)
                .toList();
        for (var player : players) {
            world.spawnParticles(
                    player, ParticleTypes.SOUL_FIRE_FLAME, true, center.x, center.y, center.z, 50, 0.2, 0.1, 0.2, 0);
        }
    }
}

package com.yellowfire.extratarultimate.blocks;

import com.google.common.collect.ImmutableList;
import com.yellowfire.extratarultimate.items.Items;
import com.yellowfire.extratarultimate.utils.loot.LootTable;
import net.minecraft.block.Block;
import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.ItemScatterer;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

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

    public static void drop(World world, Vec3d center) {
        for (var stack : LOOT_TABLE.execute(world.random)) {
            var itemEntity = new ItemEntity(world, center.x, center.y, center.z, stack);
            itemEntity.setVelocity(world.random.nextTriangular(0.0, 0.11485), world.random.nextTriangular(0.2, 0.11485), world.random.nextTriangular(0.0, 0.11485));
            world.spawnEntity(itemEntity);
        }
    }
}

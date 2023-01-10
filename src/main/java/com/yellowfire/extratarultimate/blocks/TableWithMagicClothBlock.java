package com.yellowfire.extratarultimate.blocks;

import com.google.common.collect.ImmutableList;
import com.yellowfire.extratarultimate.items.Items;
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

    private static ImmutableList<Item> FOODS = ImmutableList.of(
            Items.TRIANGLE,
            Items.GOLDEN_TRIANGLE,
            Items.CHUK_CHUK,
            Items.YELLOW_PEACH,
            net.minecraft.item.Items.APPLE,
            net.minecraft.item.Items.BAKED_POTATO,
            net.minecraft.item.Items.CARROT,
            net.minecraft.item.Items.COOKED_BEEF,
            net.minecraft.item.Items.COOKED_CHICKEN,
            net.minecraft.item.Items.COOKED_COD,
            net.minecraft.item.Items.COOKED_SALMON);

    public static void drop(World world, Vec3d center) {
        for (int i = 0; i < world.random.nextBetween(1,3); i++) {
            var item = FOODS.get(world.random.nextInt(FOODS.size()));
            var itemEntity = new ItemEntity(world, center.x, center.y, center.z, new ItemStack(item, world.random.nextBetween(1, 3)));
            itemEntity.setVelocity(world.random.nextTriangular(0.0, 0.11485), world.random.nextTriangular(0.2, 0.11485), world.random.nextTriangular(0.0, 0.11485));
            world.spawnEntity(itemEntity);
        }
    }
}

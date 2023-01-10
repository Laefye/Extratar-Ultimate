package com.yellowfire.extratarultimate.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.Waterloggable;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;
import org.jetbrains.annotations.Nullable;

public class TableBlock extends WaterloggableBlock {
    private static final VoxelShape TOP;
    private static final VoxelShape BOTTOM;
    private static final VoxelShape SHAPE;

    public TableBlock(Settings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    static {
        BOTTOM = Block.createCuboidShape(2,0, 2, 14, 11, 14);
        TOP = Block.createCuboidShape(0,11, 0, 16, 16, 16);
        SHAPE = VoxelShapes.union(BOTTOM, TOP);
    }
}

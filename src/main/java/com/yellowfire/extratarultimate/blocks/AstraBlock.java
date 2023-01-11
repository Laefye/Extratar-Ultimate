package com.yellowfire.extratarultimate.blocks;

import net.minecraft.block.*;
import net.minecraft.block.Blocks;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class AstraBlock extends FlowerBlock {
    public AstraBlock(Settings settings) {
        super(StatusEffects.SPEED, 0, settings);
    }

    private static final VoxelShape SHAPE = Block.createCuboidShape(5, 0, 5, 11, 5, 11);

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        Vec3d vec3d = state.getModelOffset(world, pos);
        return SHAPE.offset(vec3d.x, vec3d.y, vec3d.z);
    }
}

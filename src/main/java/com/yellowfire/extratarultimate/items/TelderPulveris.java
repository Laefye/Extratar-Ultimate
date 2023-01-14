package com.yellowfire.extratarultimate.items;

import com.yellowfire.extratarultimate.blocks.Blocks;
import com.yellowfire.extratarultimate.blocks.TableWithMagicClothBlock;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.command.ParticleCommand;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.ActionResult;

public class TelderPulveris extends Item {
    public TelderPulveris(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        var world = context.getWorld();
        var pos = context.getBlockPos();
        var state = world.getBlockState(pos);
        if (state.getBlock() == Blocks.TELDER_TABLE_WITH_MAGIC_CLOTH) {
            var block = ((TableWithMagicClothBlock) Blocks.TELDER_TABLE_WITH_MAGIC_CLOTH);
            var center = pos.up().toCenterPos().subtract(0, 0.4, 0);
            if (world.isClient) {
                return ActionResult.SUCCESS;
            }
            var player = context.getPlayer();
            if (player != null && !player.isCreative()) {
                context.getStack().decrement(1);
            }
            block.generateFood(world, center);
            block.generateParticles((ServerWorld) world, center);
            return ActionResult.CONSUME;
        }
        return super.useOnBlock(context);
    }
}

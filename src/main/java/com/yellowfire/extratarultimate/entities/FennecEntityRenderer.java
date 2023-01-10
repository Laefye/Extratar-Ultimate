package com.yellowfire.extratarultimate.entities;

import com.yellowfire.extratarultimate.ExtratarUltimate;
import com.yellowfire.extratarultimate.client.ExtratarUltimateClient;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class FennecEntityRenderer extends MobEntityRenderer<FennecEntity, FennecEntityModel> {
    public FennecEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new FennecEntityModel(context.getPart(Entities.MODEL_FENNEC_LAYER)), 0.5f);
    }

    @Override
    public Identifier getTexture(FennecEntity entity) {
        return ExtratarUltimate.id("textures/entity/fennec.png");
    }
}

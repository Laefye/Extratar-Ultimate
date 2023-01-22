package com.yellowfire.extratarultimate.client.models;

import net.minecraft.client.model.*;

public class HelmetModels {
    public static TexturedModelData getTexturedModelDataHelmetTypeA() {
        ModelData modelData = new ModelData();
        ModelPartData root = modelData.getRoot();

        ModelPartData helmet = root.addChild(HelmetModel.HELMET, ModelPartBuilder.create().uv(0, 0).cuboid(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

        ModelPartData FaceLeft_r1 = helmet.addChild("FaceLeft_r1", ModelPartBuilder.create().uv(0, 16).cuboid(0.0F, -5.0F, -5.0F, 0.0F, 10.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(4.0F, -3.0F, -4.0F, 0.0F, 0.925F, 0.0F));

        ModelPartData FaceRight_r1 = helmet.addChild("FaceRight_r1", ModelPartBuilder.create().uv(0, 16).cuboid(0.0F, -5.0F, -5.0F, 0.0F, 10.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(-4.0F, -3.0F, -4.0F, 0.0F, -0.925F, 0.0F));

        return TexturedModelData.of(modelData, 64, 64);
    }
}

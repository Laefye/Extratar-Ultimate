package com.yellowfire.extratarultimate.client.renderers;

import com.yellowfire.extratarultimate.client.models.FennecEntityModel;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.feature.FeatureRenderer;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.Identifier;

public class HelmetFeatureRenderer<T extends LivingEntity, M extends BipedEntityModel<T>> extends FeatureRenderer<T, M> {
    public FennecEntityModel model = new FennecEntityModel(FennecEntityModel.getTexturedModelData().createModel());

    public HelmetFeatureRenderer(FeatureRendererContext<T, M> context) {
        super(context);
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, T entity, float limbAngle, float limbDistance, float tickDelta, float animationProgress, float headYaw, float headPitch) {
        /*
        var helmet = entity.getEquippedStack(EquipmentSlot.HEAD);
        if (!helmet.isEmpty() && helmet.getItem() instanceof HelmetWithEars) {
            matrices.push();
            var head = model.getHeadParts().iterator().next();
            head.copyTransform(getContextModel().head);
            var vertexConsumer = ItemRenderer.getArmorGlintConsumer(vertexConsumers, RenderLayer.getArmorCutoutNoCull(getHelmetTexture()), false, false);
            head.render(matrices, vertexConsumer, light, 1, 1, 1, 1, 1);
            matrices.pop();
        }*/
    }

    public Identifier getHelmetTexture() {
        return new Identifier("minecraft", "textures/block/stone.png");
    }
}

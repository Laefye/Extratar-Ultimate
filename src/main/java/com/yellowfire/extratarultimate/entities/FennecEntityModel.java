package com.yellowfire.extratarultimate.entities;

import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.AnimalModel;
import net.minecraft.client.render.entity.model.EntityModelPartNames;
import net.minecraft.client.render.entity.model.FoxEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.passive.FoxEntity;
import net.minecraft.util.math.MathHelper;

public class FennecEntityModel extends AnimalModel<FennecEntity> {
    private final ModelPart body;
    private final ModelPart head;
    private final ModelPart rightHindLeg;
    private final ModelPart leftHindLeg;
    private final ModelPart rightFrontLeg;
    private final ModelPart leftFrontLeg;
    private final ModelPart tail;

    public FennecEntityModel(ModelPart modelPart) {
        this.body = modelPart.getChild(EntityModelPartNames.BODY);
        this.head = modelPart.getChild(EntityModelPartNames.HEAD);
        this.rightHindLeg = modelPart.getChild(EntityModelPartNames.RIGHT_HIND_LEG);
        this.leftHindLeg = modelPart.getChild(EntityModelPartNames.LEFT_HIND_LEG);
        this.rightFrontLeg = modelPart.getChild(EntityModelPartNames.RIGHT_FRONT_LEG);
        this.leftFrontLeg = modelPart.getChild(EntityModelPartNames.LEFT_FRONT_LEG);
        this.tail = body.getChild(EntityModelPartNames.TAIL);
    }

    public static TexturedModelData getTexturedModelData() {
        ModelData meshdefinition = new ModelData();
        ModelPartData partdefinition = meshdefinition.getRoot();

        ModelPartData head = partdefinition.addChild("head", ModelPartBuilder.create().uv(0, 0).cuboid(-3.0F, -3.0F, -4.0F, 6.0F, 6.0F, 4.0F, new Dilation(0.0F))
                .uv(0, 10).cuboid(-1.5F, 1.0F, -6.0F, 3.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 16.0F, -5.0F));

        ModelPartData b_r1 = head.addChild("b_r1", ModelPartBuilder.create().uv(20, 0).mirrored().cuboid(-4.0F, -16.0F, -3.0F, 5.0F, 8.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(0.0F, 8.0F, 0.0F, -0.0873F, 0.0873F, -0.1309F));

        ModelPartData a_r1 = head.addChild("a_r1", ModelPartBuilder.create().uv(20, 0).cuboid(0.0F, -16.0F, -3.0F, 5.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 8.0F, 0.0F, -0.0873F, -0.0873F, 0.1309F));

        ModelPartData left_hind_leg = partdefinition.addChild("left_hind_leg", ModelPartBuilder.create().uv(56, 0).cuboid(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(1.75F, 16.0F, 5.0F));

        ModelPartData right_hind_leg = partdefinition.addChild("right_hind_leg", ModelPartBuilder.create().uv(56, 0).cuboid(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-1.75F, 16.0F, 5.0F));

        ModelPartData left_front_leg = partdefinition.addChild("left_front_leg", ModelPartBuilder.create().uv(56, 0).cuboid(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(1.75F, 16.0F, -3.0F));

        ModelPartData right_front_leg = partdefinition.addChild("right_front_leg", ModelPartBuilder.create().uv(56, 0).cuboid(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-1.75F, 16.0F, -3.0F));

        ModelPartData root = partdefinition.addChild("body", ModelPartBuilder.create().uv(0, 16).cuboid(-3.0F, -10.0F, -5.0F, 6.0F, 6.0F, 10.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

        ModelPartData tail = root.addChild("tail", ModelPartBuilder.create().uv(33, 18).cuboid(-2.5F, -2.5F, 0.0F, 5.0F, 5.0F, 9.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -7.5F, 5.0F));

        return TexturedModelData.of(meshdefinition, 64, 32);
    }

    @Override
    public void setAngles(FennecEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
        this.head.pitch = headPitch * 0.017453292F;
        this.head.yaw = headYaw * 0.017453292F;

        this.rightHindLeg.pitch = MathHelper.cos(limbAngle * 0.6662F) * limbDistance;
        this.leftHindLeg.pitch = MathHelper.cos(limbAngle * 0.6662F + 3.1415927F) * 1F * limbDistance;
        this.rightFrontLeg.pitch = MathHelper.cos(limbAngle * 0.6662F + 3.1415927F) * 1F * limbDistance;
        this.leftFrontLeg.pitch = MathHelper.cos(limbAngle * 0.6662F) * limbDistance;
        this.tail.yaw = MathHelper.cos(limbAngle * 0.6662F) * limbDistance;
        this.tail.pitch = 5 / 180f * MathHelper.PI;
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha) {
        super.render(matrices, vertices, light, overlay, red, green, blue, alpha);
    }

    @Override
    protected Iterable<ModelPart> getHeadParts() {
        return ImmutableList.of(head);
    }


    @Override
    protected Iterable<ModelPart> getBodyParts() {
        return ImmutableList.of(body, leftHindLeg, rightHindLeg, rightFrontLeg, leftFrontLeg);
    }

    @Override
    public void animateModel(FennecEntity entity, float limbAngle, float limbDistance, float tickDelta) {
    }
}

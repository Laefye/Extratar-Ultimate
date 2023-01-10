package com.yellowfire.extratarultimate.entities;

import com.yellowfire.extratarultimate.ExtratarUltimate;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class Entities {
    public static EntityType<FennecEntity> FENNEC = FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, FennecEntity::new)
            .dimensions(EntityDimensions.fixed(0.6F, 0.85F)).build();
    public static final EntityModelLayer MODEL_FENNEC_LAYER = new EntityModelLayer(ExtratarUltimate.id("fennec"), "main");

    public static void register(Function<String, Identifier> id) {
        Registry.register(Registries.ENTITY_TYPE, id.apply("fennec"), FENNEC);
        FabricDefaultAttributeRegistry.register(FENNEC, FennecEntity.createFennecAttributes());
    }

    public static void clientRegister(Function<String, Identifier> id) {
        EntityRendererRegistry.register(Entities.FENNEC, FennecEntityRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(MODEL_FENNEC_LAYER, FennecEntityModel::getTexturedModelData);
    }
}

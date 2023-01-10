package com.yellowfire.extratarultimate.blocks;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

import java.util.ArrayList;
import java.util.function.Function;

public class Blocks {
    public static ArrayList<Item> items = new ArrayList<>();

    public static Block TELDER_STEEL_ORE = new Block(FabricBlockSettings.of(Material.METAL)
            .mapColor(MapColor.STONE_GRAY)
            .strength(30f)
            .sounds(BlockSoundGroup.STONE)
            .requiresTool()
    );

    public static Block EARTH_CRYSTAL_ORE = new ExperienceDroppingBlock(FabricBlockSettings.of(Material.METAL)
            .mapColor(MapColor.STONE_GRAY)
            .sounds(BlockSoundGroup.STONE)
            .requiresTool()
            .strength(3.0F, 3.0F), UniformIntProvider.create(1, 3));


    public static Block NETHER_CRYSTAL_ORE = new ExperienceDroppingBlock(FabricBlockSettings.of(Material.METAL)
            .mapColor(MapColor.RED)
            .sounds(BlockSoundGroup.STONE)
            .requiresTool()
            .strength(3.0F, 3.0F), UniformIntProvider.create(3, 6));

    public static Block END_CRYSTAL_ORE = new ExperienceDroppingBlock(FabricBlockSettings.of(Material.METAL)
            .mapColor(MapColor.WHITE_GRAY)
            .sounds(BlockSoundGroup.STONE)
            .requiresTool()
            .strength(3.0F, 3.0F), UniformIntProvider.create(5, 7));

    public static Block EARTH_CRYSTAL_BLOCK = new Block(FabricBlockSettings.of(Material.METAL)
            .mapColor(MapColor.GREEN)
            .strength(3.0F, 3.0F)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool()
    );

    public static Block NETHER_CRYSTAL_BLOCK = new Block(FabricBlockSettings.of(Material.METAL)
            .mapColor(MapColor.RED)
            .strength(3.0F, 3.0F)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool()
    );

    public static Block END_CRYSTAL_BLOCK = new Block(FabricBlockSettings.of(Material.METAL)
            .mapColor(MapColor.IRON_GRAY)
            .strength(3.0F, 3.0F)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool()
    );

    public static Block TELDER_STEEL_BLOCK = new Block(FabricBlockSettings.of(Material.METAL)
            .mapColor(MapColor.BLACK)
            .strength(30f)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool()
    );

    public static Block MECHANICAL_STRUCTURE = new Block(FabricBlockSettings.of(Material.METAL)
            .mapColor(MapColor.BLACK)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool()
            .strength(2.0F, 6.0F)
    );

    public static Block ETHERSOAKED_STONE = new Block(FabricBlockSettings.of(Material.STONE)
            .mapColor(MapColor.STONE_GRAY)
            .strength(1.5F, 6.0F)
            .sounds(BlockSoundGroup.STONE)
            .requiresTool()
    );

    public static Block ETHERSOAKED_STONE_STAIRS = new StairsBlock(ETHERSOAKED_STONE.getDefaultState(), FabricBlockSettings.of(Material.STONE)
            .mapColor(MapColor.STONE_GRAY)
            .strength(1.5F, 6.0F)
            .sounds(BlockSoundGroup.STONE)
            .requiresTool()
    );

    public static Block ETHERSOAKED_STONE_SLAB = new SlabBlock(FabricBlockSettings.of(Material.STONE)
            .mapColor(MapColor.STONE_GRAY)
            .strength(1.5F, 6.0F)
            .sounds(BlockSoundGroup.STONE)
            .requiresTool()
    );

    public static Block ETHERSOAKED_STONE_WALL = new WallBlock(FabricBlockSettings.of(Material.STONE)
            .mapColor(MapColor.STONE_GRAY)
            .strength(1.5F, 6.0F)
            .sounds(BlockSoundGroup.STONE)
            .requiresTool()
    );

    public static Block ETHERSOAKED_COBBLESTONE = new Block(FabricBlockSettings.of(Material.STONE)
            .mapColor(MapColor.STONE_GRAY)
            .strength(2f, 6f)
            .sounds(BlockSoundGroup.STONE)
            .requiresTool()
    );

    public static Block MOSSY_ETHERSOAKED_COBBLESTONE = new Block(FabricBlockSettings.of(Material.STONE)
            .mapColor(MapColor.STONE_GRAY)
            .strength(2f, 6f)
            .sounds(BlockSoundGroup.STONE)
            .requiresTool()
    );

    public static Block ETHERSOAKED_COBBLESTONE_STAIRS = new StairsBlock(ETHERSOAKED_COBBLESTONE.getDefaultState(), FabricBlockSettings.of(Material.STONE)
            .mapColor(MapColor.STONE_GRAY)
            .strength(2f, 6f)
            .sounds(BlockSoundGroup.STONE)
            .requiresTool()
    );

    public static Block ETHERSOAKED_COBBLESTONE_SLAB = new SlabBlock(FabricBlockSettings.of(Material.STONE)
            .mapColor(MapColor.STONE_GRAY)
            .strength(2f, 6f)
            .sounds(BlockSoundGroup.STONE)
            .requiresTool()
    );

    public static Block ETHERSOAKED_COBBLESTONE_WALL = new WallBlock(FabricBlockSettings.of(Material.STONE)
            .mapColor(MapColor.STONE_GRAY)
            .strength(2f, 6f)
            .sounds(BlockSoundGroup.STONE)
            .requiresTool()
    );

    public static Block ETHERSOAKED_STONE_BRICKS = new Block(FabricBlockSettings.of(Material.STONE)
            .mapColor(MapColor.STONE_GRAY)
            .strength(1.5F, 6.0F)
            .sounds(BlockSoundGroup.STONE)
            .requiresTool()
    );

    public static Block ETHERSOAKED_STONE_BRICK_STAIRS = new StairsBlock(ETHERSOAKED_STONE.getDefaultState(), FabricBlockSettings.of(Material.STONE)
            .mapColor(MapColor.STONE_GRAY)
            .strength(1.5F, 6.0F)
            .sounds(BlockSoundGroup.STONE)
            .requiresTool()
    );

    public static Block ETHERSOAKED_STONE_BRICK_SLAB = new SlabBlock(FabricBlockSettings.of(Material.STONE)
            .mapColor(MapColor.STONE_GRAY)
            .strength(1.5F, 6.0F)
            .sounds(BlockSoundGroup.STONE)
            .requiresTool()
    );

    public static Block ETHERSOAKED_STONE_BRICK_WALL = new WallBlock(FabricBlockSettings.of(Material.STONE)
            .mapColor(MapColor.STONE_GRAY)
            .strength(1.5F, 6.0F)
            .sounds(BlockSoundGroup.STONE)
            .requiresTool()
    );

    public static Block MOSSY_ETHERSOAKED_STONE_BRICKS = new Block(FabricBlockSettings.of(Material.STONE)
            .mapColor(MapColor.STONE_GRAY)
            .strength(1.5F, 6.0F)
            .sounds(BlockSoundGroup.STONE)
            .requiresTool()
    );

    public static Block POLISHED_ETHERSOAKED_STONE = new Block(FabricBlockSettings.of(Material.STONE)
            .mapColor(MapColor.STONE_GRAY)
            .strength(1.5F, 6.0F)
            .sounds(BlockSoundGroup.STONE)
            .requiresTool()
    );

    public static Block TELDER_LOG = new PillarBlock(FabricBlockSettings.of(Material.WOOD)
            .mapColor(MapColor.BROWN)
            .strength(2f, 3f)
            .sounds(BlockSoundGroup.WOOD)
    );

    public static Block STRIPPED_TELDER_LOG = new PillarBlock(FabricBlockSettings.of(Material.WOOD)
            .mapColor(MapColor.BROWN)
            .strength(2f, 3f)
            .sounds(BlockSoundGroup.WOOD)
    );

    public static Block TELDER_WOOD = new Block(FabricBlockSettings.of(Material.WOOD)
            .mapColor(MapColor.BROWN)
            .strength(2f, 3f)
            .sounds(BlockSoundGroup.WOOD)
    );

    public static Block STRIPPED_TELDER_WOOD = new Block(FabricBlockSettings.of(Material.WOOD)
            .mapColor(MapColor.BROWN)
            .strength(2f, 3f)
            .sounds(BlockSoundGroup.WOOD)
    );

    public static Block TELDER_WOODEN_PLANKS = new Block(FabricBlockSettings.of(Material.WOOD)
            .mapColor(MapColor.BROWN)
            .strength(2f, 3f)
            .sounds(BlockSoundGroup.WOOD)
    );

    public static Block TELDER_STAIRS = new StairsBlock(TELDER_WOODEN_PLANKS.getDefaultState(), FabricBlockSettings.of(Material.WOOD)
            .mapColor(MapColor.BROWN)
            .strength(2f, 3f)
            .sounds(BlockSoundGroup.WOOD)
    );

    public static Block TELDER_SLAB = new SlabBlock(FabricBlockSettings.of(Material.WOOD)
            .mapColor(MapColor.BROWN)
            .strength(2f, 3f)
            .sounds(BlockSoundGroup.WOOD)
    );

    public static Block TELDER_FENCE = new FenceBlock(FabricBlockSettings.of(Material.WOOD)
            .mapColor(MapColor.BROWN)
            .strength(2f, 3f)
            .sounds(BlockSoundGroup.WOOD)
    );

    public static Block TELDER_FENCE_GATE = new FenceGateBlock(FabricBlockSettings.of(Material.WOOD)
            .mapColor(MapColor.BROWN)
            .strength(2f, 3f)
            .sounds(BlockSoundGroup.WOOD),
            SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN
    );

    public static Block TELDER_DOOR = new DoorBlock(FabricBlockSettings.of(Material.WOOD)
            .mapColor(MapColor.BROWN)
            .strength(2f, 3f)
            .sounds(BlockSoundGroup.WOOD)
            .nonOpaque(),
            SoundEvents.BLOCK_WOODEN_DOOR_OPEN, SoundEvents.BLOCK_WOODEN_DOOR_CLOSE
    );

    public static Block TELDER_TRAPDOOR = new TrapdoorBlock(FabricBlockSettings.of(Material.WOOD)
            .mapColor(MapColor.BROWN)
            .strength(2f, 3f)
            .sounds(BlockSoundGroup.WOOD)
            .nonOpaque(),
            SoundEvents.BLOCK_WOODEN_TRAPDOOR_OPEN, SoundEvents.BLOCK_WOODEN_TRAPDOOR_CLOSE
    );

    public static Block SEALED_TELDER_JAR = new SealedTelderJarBlock(FabricBlockSettings.of(Material.WOOD)
            .mapColor(MapColor.BROWN)
            .nonOpaque()
            .strength(0.2f)
            .sounds(BlockSoundGroup.WOOD)
    );

    public static Block TELDER_JAR = new TelderJarBlock(FabricBlockSettings.of(Material.WOOD)
            .mapColor(MapColor.BROWN)
            .nonOpaque()
            .strength(0.2f)
            .sounds(BlockSoundGroup.WOOD)
    );

    public static BlockEntityType<TelderJarBlockEntity> TELDER_JAR_ENTITY_TYPE;

    public static Block TELDER_CHAIR = new ChairBlock(FabricBlockSettings.of(Material.WOOD)
            .mapColor(MapColor.BROWN)
            .nonOpaque()
            .strength(2f, 3f)
            .sounds(BlockSoundGroup.WOOD));

    public static Block TELDER_TABLE = new TableBlock(FabricBlockSettings.of(Material.WOOD)
            .mapColor(MapColor.BROWN)
            .nonOpaque()
            .strength(2f, 3f)
            .sounds(BlockSoundGroup.WOOD));

    public static Block TELDER_TABLE_WITH_CLOTH = new TableWithClothBlock(FabricBlockSettings.of(Material.WOOD)
            .mapColor(MapColor.BROWN)
            .nonOpaque()
            .strength(2f, 3f)
            .sounds(BlockSoundGroup.WOOD));

    public static BlockEntityType<TableWithClothBlockEntity> TELDER_TABLE_WITH_CLOTH_ENTITY_TYPE;

    public static Block TELDER_TABLE_WITH_MAGIC_CLOTH = new TableWithMagicClothBlock(FabricBlockSettings.of(Material.WOOD)
            .mapColor(MapColor.BROWN)
            .nonOpaque()
            .strength(2f, 3f)
            .sounds(BlockSoundGroup.WOOD));

    public static Block TELDER_CRATE = new TelderCrateBlock(FabricBlockSettings.of(Material.WOOD)
            .mapColor(MapColor.BROWN)
            .nonOpaque()
            .strength(2f, 3f)
            .sounds(BlockSoundGroup.WOOD));

    public static BlockEntityType<CrateBlockEntity> TELDER_CRATE_BLOCK_ENTITY_TYPE;

    public static Block TELDER_SAMOVAR = new TelderSamovarBlock(FabricBlockSettings.of(Material.METAL)
            .mapColor(MapColor.BROWN)
            .nonOpaque()
            .strength(2f, 3f)
            .requiresTool()
            .sounds(BlockSoundGroup.METAL));

    public static Block TELDER_LEAVES = new LeavesBlock(FabricBlockSettings.of(Material.LEAVES)
            .mapColor(MapColor.YELLOW)
            .nonOpaque()
            .luminance(6)
            .ticksRandomly()
            .strength(0.2f)
            .sounds(BlockSoundGroup.GRASS)
    );

    public static Block YELLOWLUME_BLOCK = new Block(FabricBlockSettings.of(Material.LEAVES)
            .mapColor(MapColor.YELLOW)
            .nonOpaque()
            .luminance(3)
            .strength(0.1f)
            .sounds(BlockSoundGroup.STEM)
    );

    public static Block YELLOWLUME_STEM = new Block(FabricBlockSettings.of(Material.LEAVES)
            .mapColor(MapColor.YELLOW)
            .strength(0.1f)
            .sounds(BlockSoundGroup.STEM)
    );

    public static Block YELLOWLUME_PULP = new Block(FabricBlockSettings.of(Material.LEAVES)
            .mapColor(MapColor.YELLOW)
            .luminance(15)
            .strength(0.1f)
            .sounds(BlockSoundGroup.STEM)
    );

    public static Block LITTLE_JAR = new LittleJarBlock(FabricBlockSettings.of(Material.GLASS)
            .mapColor(MapColor.GRAY)
            .strength(0.2f)
            .nonOpaque()
            .sounds(BlockSoundGroup.GLASS)
    );

    public static Block PEACH_JAM_JAR = new LittleJarBlock(FabricBlockSettings.of(Material.GLASS)
            .mapColor(MapColor.GRAY)
            .strength(0.2f)
            .nonOpaque()
            .sounds(BlockSoundGroup.GLASS)
    );

    public static Block BERRY_JAM_JAR = new LittleJarBlock(FabricBlockSettings.of(Material.GLASS)
            .mapColor(MapColor.GRAY)
            .strength(0.2f)
            .nonOpaque()
            .sounds(BlockSoundGroup.GLASS)
    );

    public static Block LITTLE_JAR_WITH_SOUL = new LittleJarWithSoulBlock(FabricBlockSettings.of(Material.GLASS)
            .mapColor(MapColor.GRAY)
            .strength(0.2f)
            .nonOpaque()
            .sounds(BlockSoundGroup.GLASS)
    );

    public static Block LITTLE_JAR_WITH_DIRT = new LittleJarBlock(FabricBlockSettings.of(Material.GLASS)
            .mapColor(MapColor.GRAY)
            .strength(0.2f)
            .nonOpaque()
            .sounds(BlockSoundGroup.GLASS)
    );

    public static Block PEACH_PIE = new PieBlock(FabricBlockSettings.of(Material.CAKE)
            .mapColor(MapColor.GRAY)
            .strength(0.5f)
            .nonOpaque()
            .sounds(BlockSoundGroup.WOOL)
    );

    public static Block BERRY_PIE = new PieBlock(FabricBlockSettings.of(Material.CAKE)
            .mapColor(MapColor.GRAY)
            .strength(0.5f)
            .nonOpaque()
            .sounds(BlockSoundGroup.WOOL)
    );

    public static Block SOUL_CATCHING_STRUCTURE = new SoulCatchingStructureBlock(FabricBlockSettings.of(Material.METAL)
            .mapColor(MapColor.BLACK)
            .strength(2f, 3f)
            .nonOpaque()
            .sounds(BlockSoundGroup.METAL));

    public static Block ANCHOR_CHAIN = new ChainBlock(FabricBlockSettings.of(Material.METAL)
            .sounds(BlockSoundGroup.CHAIN)
            .requiresTool()
            .strength(5.0F, 6.0F));

    public static Block ANCHOR = new AnchorBlock(FabricBlockSettings.of(Material.METAL)
            .sounds(BlockSoundGroup.CHAIN)
            .strength(-1.0F, 3600000.0F)
            .nonOpaque());

    public static Block LIGHTELET = new PlantBlock(FabricBlockSettings.of(Material.REPLACEABLE_PLANT)
            .noCollision()
            .nonOpaque()
            .breakInstantly()
            .sounds(BlockSoundGroup.GRASS)
            .offsetType(AbstractBlock.OffsetType.XZ)
            .luminance(6)
    );

    public static Block YELLOWLUME = new YellowlumeBlock(FabricBlockSettings.of(Material.PLANT)
            .noCollision()
            .breakInstantly()
            .sounds(BlockSoundGroup.GRASS)
            .offsetType(AbstractBlock.OffsetType.XZ)
            .nonOpaque()
            .luminance(6)
    );

    public static Block ALLIUMINANCE = new YellowlumeBlock(FabricBlockSettings.of(Material.PLANT)
            .noCollision()
            .breakInstantly()
            .sounds(BlockSoundGroup.GRASS)
            .offsetType(AbstractBlock.OffsetType.XZ)
            .nonOpaque()
            .luminance(6)
    );

    public static Block ASTRA = new AstraBlock(FabricBlockSettings.of(Material.PLANT)
            .noCollision()
            .breakInstantly()
            .sounds(BlockSoundGroup.GRASS)
            .offsetType(AbstractBlock.OffsetType.XZ)
            .nonOpaque()
            .luminance(3)
    );

    public static void register(Function<String, Identifier> id) {
        registerBlock(EARTH_CRYSTAL_ORE, "earth_crystal_ore", id);
        registerBlock(NETHER_CRYSTAL_ORE, "nether_crystal_ore", id);
        registerBlock(END_CRYSTAL_ORE, "end_crystal_ore", id);
        registerBlock(TELDER_STEEL_ORE, "telder_steel_ore", id);
        registerBlock(EARTH_CRYSTAL_BLOCK, "earth_crystal_block", id);
        registerBlock(NETHER_CRYSTAL_BLOCK, "nether_crystal_block", id);
        registerBlock(END_CRYSTAL_BLOCK, "end_crystal_block", id);
        registerBlock(TELDER_STEEL_BLOCK, "telder_steel_block", id);
        registerBlock(MECHANICAL_STRUCTURE, "mechanical_structure", id);
        registerBlock(ETHERSOAKED_STONE, "ethersoaked_stone", id);
        registerBlock(ETHERSOAKED_STONE_STAIRS, "ethersoaked_stone_stairs", id);
        registerBlock(ETHERSOAKED_STONE_SLAB, "ethersoaked_stone_slab", id);
        registerBlock(ETHERSOAKED_STONE_WALL, "ethersoaked_stone_wall", id);
        registerBlock(ETHERSOAKED_COBBLESTONE, "ethersoaked_cobblestone", id);
        registerBlock(MOSSY_ETHERSOAKED_COBBLESTONE, "mossy_ethersoaked_cobblestone", id);
        registerBlock(ETHERSOAKED_COBBLESTONE_STAIRS, "ethersoaked_cobblestone_stairs", id);
        registerBlock(ETHERSOAKED_COBBLESTONE_SLAB, "ethersoaked_cobblestone_slab", id);
        registerBlock(ETHERSOAKED_COBBLESTONE_WALL, "ethersoaked_cobblestone_wall", id);
        registerBlock(ETHERSOAKED_STONE_BRICKS, "ethersoaked_stone_bricks", id);
        registerBlock(ETHERSOAKED_STONE_BRICK_STAIRS, "ethersoaked_stone_brick_stairs", id);
        registerBlock(ETHERSOAKED_STONE_BRICK_SLAB, "ethersoaked_stone_brick_slab", id);
        registerBlock(ETHERSOAKED_STONE_BRICK_WALL, "ethersoaked_stone_brick_wall", id);
        registerBlock(MOSSY_ETHERSOAKED_STONE_BRICKS, "mossy_ethersoaked_stone_bricks", id);
        registerBlock(POLISHED_ETHERSOAKED_STONE, "polished_ethersoaked_stone", id);
        registerFlammableBlock(TELDER_LOG, "telder_log", id);
        registerFlammableBlock(STRIPPED_TELDER_LOG, "stripped_telder_log", id);
        registerFlammableBlock(TELDER_WOOD, "telder_wood", id);
        registerFlammableBlock(STRIPPED_TELDER_WOOD, "stripped_telder_wood", id);
        registerFlammableBlock(TELDER_WOODEN_PLANKS, "telder_wooden_planks", id);
        registerFlammableBlock(TELDER_SLAB, "telder_slab", id);
        registerFlammableBlock(TELDER_STAIRS, "telder_stairs", id);
        registerFlammableBlock(TELDER_FENCE, "telder_fence", id);
        registerFlammableBlock(TELDER_FENCE_GATE, "telder_fence_gate", id);
        registerFlammableBlock(TELDER_DOOR, "telder_door", id);
        registerFlammableBlock(TELDER_TRAPDOOR, "telder_trapdoor", id);
        registerBlock(SEALED_TELDER_JAR, "sealed_telder_jar", id); // Изменить лут его
        TELDER_JAR_ENTITY_TYPE = registerBlockEntity(TELDER_JAR, "telder_jar", id,
                FabricBlockEntityTypeBuilder.create(TelderJarBlockEntity::new, TELDER_JAR));
        registerFlammableBlock(TELDER_CHAIR, "telder_chair", id);
        registerFlammableBlock(TELDER_TABLE, "telder_table", id);
        TELDER_TABLE_WITH_CLOTH_ENTITY_TYPE = registerBlockEntity(TELDER_TABLE_WITH_CLOTH, "telder_table_with_cloth", id,
                FabricBlockEntityTypeBuilder.create(TableWithClothBlockEntity::new, TELDER_TABLE_WITH_CLOTH));
        registerFlammableBlock(TELDER_TABLE_WITH_MAGIC_CLOTH, "telder_table_with_magic_cloth", id);
        TELDER_CRATE_BLOCK_ENTITY_TYPE = registerBlockEntity(TELDER_CRATE, "telder_crate", id,
                FabricBlockEntityTypeBuilder.create(CrateBlockEntity::new, TELDER_CRATE));
        registerBlock(TELDER_SAMOVAR, "telder_samovar", id);
        registerFlammableBlock(TELDER_LEAVES, "telder_leaves", id);
        registerFlammableBlock(YELLOWLUME_BLOCK, "yellowlume_block", id);
        registerFlammableBlock(YELLOWLUME_PULP, "yellowlume_pulp", id);
        registerFlammableBlock(YELLOWLUME_STEM, "yellowlume_stem", id);
        registerBlock(LITTLE_JAR, "little_jar", id);
        registerBlock(PEACH_JAM_JAR, "peach_jam_jar", id,
                new JarDrinkableBlockItem(PEACH_JAM_JAR, new FabricItemSettings()
                        .food(new FoodComponent.Builder()
                                .hunger(10)
                                .snack()
                                .build())
                        .maxCount(16))
                );
        registerBlock(BERRY_JAM_JAR, "berry_jam_jar", id,
                new JarDrinkableBlockItem(BERRY_JAM_JAR, new FabricItemSettings()
                        .food(new FoodComponent.Builder()
                                .hunger(8)
                                .snack()
                                .build())
                        .maxCount(16))
                );
        registerBlock(LITTLE_JAR_WITH_SOUL, "little_jar_with_soul", id);
        registerBlock(LITTLE_JAR_WITH_DIRT, "little_jar_with_dirt", id);
        registerBlock(PEACH_PIE, "peach_pie", id);
        registerBlock(BERRY_PIE, "berry_pie", id);
        registerBlock(SOUL_CATCHING_STRUCTURE, "soul_catching_structure", id);
        registerBlock(ANCHOR_CHAIN, "anchor_chain", id);
        registerBlock(ANCHOR, "anchor", id);
        registerFlammableBlock(LIGHTELET, "lightelet", id);
        registerFlammableBlock(YELLOWLUME, "yellowlume", id);
        registerFlammableBlock(ALLIUMINANCE, "alliuminance", id);
        registerFlammableBlock(ASTRA, "astra", id);
    }

    private static <T extends Item> void registerBlock(Block block, String path, Function<String, Identifier> id, T item) {
        Registry.register(Registries.BLOCK, id.apply(path), block);
        Registry.register(Registries.ITEM, id.apply(path), item);
        items.add(item);
    }

    private static void registerBlock(Block block, String path, Function<String, Identifier> id) {
        var item = new BlockItem(block, new FabricItemSettings());
        registerBlock(block, path, id, item);
    }

    private static <T extends BlockEntity> BlockEntityType<T> registerBlockEntity(Block block, String path, Function<String, Identifier> id, FabricBlockEntityTypeBuilder<T> builder) {
        registerBlock(block, path, id);
        return Registry.register(Registries.BLOCK_ENTITY_TYPE, id.apply(path), builder.build(null));
    }

    private static void registerFlammableBlock(Block block, String path, Function<String, Identifier> id) {
        registerBlock(block, path, id);
        FlammableBlockRegistry.getDefaultInstance().add(block, 5, 5);
    }
}

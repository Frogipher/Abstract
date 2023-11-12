package net.frogipher.abstractmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.frogipher.abstractmod.AbstractMod;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    //terracotta
    public static final Block TERRACOTTA_SHINGLES = registerBlock("terracotta_shingles", new Block(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).mapColor(MapColor.OAK_TAN)));
    public static final Block RED_SHINGLES = registerBlock("red_shingles", new Block(FabricBlockSettings.copyOf(Blocks.RED_TERRACOTTA).mapColor(MapColor.TERRACOTTA_RED)));
    public static final Block ORANGE_SHINGLES = registerBlock("orange_shingles", new Block(FabricBlockSettings.copyOf(Blocks.ORANGE_TERRACOTTA).mapColor(MapColor.TERRACOTTA_ORANGE)));
    public static final Block YELLOW_SHINGLES = registerBlock("yellow_shingles", new Block(FabricBlockSettings.copyOf(Blocks.YELLOW_TERRACOTTA).mapColor(MapColor.TERRACOTTA_YELLOW)));
    public static final Block LIME_SHINGLES = registerBlock("lime_shingles", new Block(FabricBlockSettings.copyOf(Blocks.LIME_TERRACOTTA).mapColor(MapColor.TERRACOTTA_LIME)));
    public static final Block GREEN_SHINGLES = registerBlock("green_shingles", new Block(FabricBlockSettings.copyOf(Blocks.GREEN_TERRACOTTA).mapColor(MapColor.TERRACOTTA_GREEN)));
    public static final Block CYAN_SHINGLES = registerBlock("cyan_shingles", new Block(FabricBlockSettings.copyOf(Blocks.CYAN_TERRACOTTA).mapColor(MapColor.TERRACOTTA_CYAN)));
    public static final Block LIGHT_BLUE_SHINGLES = registerBlock("light_blue_shingles", new Block(FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_TERRACOTTA).mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)));
    public static final Block BLUE_SHINGLES = registerBlock("blue_shingles", new Block(FabricBlockSettings.copyOf(Blocks.BLUE_TERRACOTTA).mapColor(MapColor.TERRACOTTA_BLUE)));
    public static final Block PURPLE_SHINGLES = registerBlock("purple_shingles", new Block(FabricBlockSettings.copyOf(Blocks.PURPLE_TERRACOTTA).mapColor(MapColor.TERRACOTTA_PURPLE)));
    public static final Block MAGENTA_SHINGLES = registerBlock("magenta_shingles", new Block(FabricBlockSettings.copyOf(Blocks.MAGENTA_TERRACOTTA).mapColor(MapColor.TERRACOTTA_MAGENTA)));
    public static final Block PINK_SHINGLES = registerBlock("pink_shingles", new Block(FabricBlockSettings.copyOf(Blocks.PINK_TERRACOTTA).mapColor(MapColor.TERRACOTTA_PINK)));
    public static final Block WHITE_SHINGLES = registerBlock("white_shingles", new Block(FabricBlockSettings.copyOf(Blocks.WHITE_TERRACOTTA).mapColor(MapColor.TERRACOTTA_WHITE)));
    public static final Block LIGHT_GRAY_SHINGLES = registerBlock("light_gray_shingles", new Block(FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_TERRACOTTA).mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)));
    public static final Block GRAY_SHINGLES = registerBlock("gray_shingles", new Block(FabricBlockSettings.copyOf(Blocks.GRAY_TERRACOTTA).mapColor(MapColor.TERRACOTTA_GRAY)));
    public static final Block BROWN_SHINGLES = registerBlock("brown_shingles", new Block(FabricBlockSettings.copyOf(Blocks.BROWN_TERRACOTTA).mapColor(MapColor.TERRACOTTA_BROWN)));
    public static final Block BLACK_SHINGLES = registerBlock("black_shingles", new Block(FabricBlockSettings.copyOf(Blocks.BLACK_TERRACOTTA).mapColor(MapColor.TERRACOTTA_BLACK)));

    //wood
    public static final Block OAK_TRIM = registerBlock("oak_trim", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).mapColor(MapColor.OAK_TAN)));
    public static final Block OAK_PANEL = registerBlock("oak_panel", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).mapColor(MapColor.OAK_TAN)));
    public static final Block SPRUCE_TRIM = registerBlock("spruce_trim", new Block(FabricBlockSettings.copyOf(Blocks.SPRUCE_PLANKS).mapColor(MapColor.SPRUCE_BROWN)));
    public static final Block SPRUCE_PANEL = registerBlock("spruce_panel", new Block(FabricBlockSettings.copyOf(Blocks.SPRUCE_PLANKS).mapColor(MapColor.SPRUCE_BROWN)));
    public static final Block BIRCH_TRIM = registerBlock("birch_trim", new Block(FabricBlockSettings.copyOf(Blocks.BIRCH_PLANKS).mapColor(MapColor.PALE_YELLOW)));
    public static final Block BIRCH_PANEL = registerBlock("birch_panel", new Block(FabricBlockSettings.copyOf(Blocks.BIRCH_PLANKS).mapColor(MapColor.PALE_YELLOW)));
    public static final Block ACACIA_TRIM = registerBlock("acacia_trim", new Block(FabricBlockSettings.copyOf(Blocks.ACACIA_PLANKS).mapColor(MapColor.ORANGE)));
    public static final Block ACACIA_PANEL = registerBlock("acacia_panel", new Block(FabricBlockSettings.copyOf(Blocks.ACACIA_PLANKS).mapColor(MapColor.ORANGE)));
    public static final Block DARK_OAK_TRIM = registerBlock("dark_oak_trim", new Block(FabricBlockSettings.copyOf(Blocks.DARK_OAK_PLANKS).mapColor(MapColor.BROWN)));
    public static final Block DARK_OAK_PANEL = registerBlock("dark_oak_panel", new Block(FabricBlockSettings.copyOf(Blocks.DARK_OAK_PLANKS).mapColor(MapColor.BROWN)));
    public static final Block BAMBOO_TRIM = registerBlock("bamboo_trim", new Block(FabricBlockSettings.copyOf(Blocks.BAMBOO_PLANKS).mapColor(MapColor.PALE_YELLOW)));
    public static final Block BAMBOO_PANEL = registerBlock("bamboo_panel", new Block(FabricBlockSettings.copyOf(Blocks.BAMBOO_PLANKS).mapColor(MapColor.PALE_YELLOW)));
    public static final Block CHERRY_TRIM = registerBlock("cherry_trim", new Block(FabricBlockSettings.copyOf(Blocks.CHERRY_PLANKS).mapColor(MapColor.PINK)));
    public static final Block CHERRY_PANEL = registerBlock("cherry_panel", new Block(FabricBlockSettings.copyOf(Blocks.CHERRY_PLANKS).mapColor(MapColor.PINK)));
    public static final Block MANGROVE_TRIM = registerBlock("mangrove_trim", new Block(FabricBlockSettings.copyOf(Blocks.MANGROVE_PLANKS).mapColor(MapColor.DARK_RED)));
    public static final Block MANGROVE_PANEL = registerBlock("mangrove_panel", new Block(FabricBlockSettings.copyOf(Blocks.MANGROVE_PLANKS).mapColor(MapColor.DARK_RED)));
    public static final Block JUNGLE_TRIM = registerBlock("jungle_trim", new Block(FabricBlockSettings.copyOf(Blocks.JUNGLE_PLANKS).mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)));
    public static final Block JUNGLE_PANEL = registerBlock("jungle_panel", new Block(FabricBlockSettings.copyOf(Blocks.JUNGLE_PLANKS).mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)));
    public static final Block CRIMSON_TRIM = registerBlock("crimson_trim", new Block(FabricBlockSettings.copyOf(Blocks.CRIMSON_PLANKS).mapColor(MapColor.DARK_CRIMSON)));
    public static final Block CRIMSON_PANEL = registerBlock("crimson_panel", new Block(FabricBlockSettings.copyOf(Blocks.CRIMSON_PLANKS).mapColor(MapColor.DARK_CRIMSON)));
    public static final Block WARPED_TRIM = registerBlock("warped_trim", new Block(FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS).mapColor(MapColor.LAPIS_BLUE)));
    public static final Block WARPED_PANEL = registerBlock("warped_panel", new Block(FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS).mapColor(MapColor.LAPIS_BLUE)));

    //custom
    public static final Block CHECKERBOARD = registerBlock("checkerboard", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).mapColor(MapColor.OFF_WHITE)));




    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(AbstractMod.MOD_ID, name), block);
    }
    private static Block registerBlockWithoutBlockItem(String name, Block block){
        return Registry.register(Registries.BLOCK, new Identifier(AbstractMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(AbstractMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks(){
        AbstractMod.LOGGER.info("Registering ModBlocks for " + AbstractMod.MOD_ID);
    }

}

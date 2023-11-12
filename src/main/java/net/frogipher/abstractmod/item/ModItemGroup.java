package net.frogipher.abstractmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.frogipher.abstractmod.AbstractMod;
import net.frogipher.abstractmod.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static ItemGroup ABSTRACT = Registry.register(Registries.ITEM_GROUP,
            new Identifier(AbstractMod.MOD_ID, "abstract"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.abstract"))
                    .icon(() -> new ItemStack(ModBlocks.OAK_TRIM)).entries((displayContext, entries) -> {

                        entries.add(ModBlocks.OAK_TRIM);
                        entries.add(ModBlocks.OAK_PANEL);
                        entries.add(ModBlocks.SPRUCE_TRIM);
                        entries.add(ModBlocks.SPRUCE_PANEL);
                        entries.add(ModBlocks.BIRCH_TRIM);
                        entries.add(ModBlocks.BIRCH_PANEL);
                        entries.add(ModBlocks.JUNGLE_TRIM);
                        entries.add(ModBlocks.JUNGLE_PANEL);
                        entries.add(ModBlocks.ACACIA_TRIM);
                        entries.add(ModBlocks.ACACIA_PANEL);
                        entries.add(ModBlocks.DARK_OAK_TRIM);
                        entries.add(ModBlocks.DARK_OAK_PANEL);
                        entries.add(ModBlocks.MANGROVE_TRIM);
                        entries.add(ModBlocks.MANGROVE_PANEL);
                        entries.add(ModBlocks.CHERRY_TRIM);
                        entries.add(ModBlocks.CHERRY_PANEL);
                        entries.add(ModBlocks.BAMBOO_TRIM);
                        entries.add(ModBlocks.BAMBOO_PANEL);
                        entries.add(ModBlocks.CRIMSON_TRIM);
                        entries.add(ModBlocks.CRIMSON_PANEL);
                        entries.add(ModBlocks.WARPED_TRIM);
                        entries.add(ModBlocks.WARPED_PANEL);
                        entries.add(ModBlocks.TERRACOTTA_SHINGLES);
                        entries.add(ModBlocks.WHITE_SHINGLES);
                        entries.add(ModBlocks.LIGHT_GRAY_SHINGLES);
                        entries.add(ModBlocks.GRAY_SHINGLES);
                        entries.add(ModBlocks.BLACK_SHINGLES);
                        entries.add(ModBlocks.BROWN_SHINGLES);
                        entries.add(ModBlocks.RED_SHINGLES);
                        entries.add(ModBlocks.ORANGE_SHINGLES);
                        entries.add(ModBlocks.YELLOW_SHINGLES);
                        entries.add(ModBlocks.LIME_SHINGLES);
                        entries.add(ModBlocks.GREEN_SHINGLES);
                        entries.add(ModBlocks.CYAN_SHINGLES);
                        entries.add(ModBlocks.LIGHT_BLUE_SHINGLES);
                        entries.add(ModBlocks.BLUE_SHINGLES);
                        entries.add(ModBlocks.PURPLE_SHINGLES);
                        entries.add(ModBlocks.MAGENTA_SHINGLES);
                        entries.add(ModBlocks.PINK_SHINGLES);
                        entries.add(ModBlocks.CHECKERBOARD);

                    }).build());

    public static void registerItemGroups(){

    }

}

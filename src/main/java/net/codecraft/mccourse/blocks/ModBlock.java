package net.codecraft.mccourse.blocks;

import net.codecraft.mccourse.MccourseMod;
import net.codecraft.mccourse.blocks.custom.*;
import net.codecraft.mccourse.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlock {
    public static final Block STEEL_BLOCK = registerBlock("steel_block",new Block(FabricBlockSettings.of(Material.METAL)
                    .requiresTool().nonOpaque()),
            ModItemGroup.TUTMODGENERAL);
    public static final Block STEEL_ORE = registerBlock("steel_ore",new Block(FabricBlockSettings.of(Material.METAL)
                    .requiresTool()),
            ModItemGroup.TUTMODGENERAL);
    public static final Block RAW_STEEL_BLOCK = registerBlock("raw_steel_block",new Block(FabricBlockSettings.of(Material.METAL)
                    .requiresTool()),
            ModItemGroup.TUTMODGENERAL);
    public static final Block DEEPSLATE_STEEL_ORE = registerBlock("deepslate_steel_ore",new Block(FabricBlockSettings.of(Material.METAL)
                    .requiresTool()),
            ModItemGroup.TUTMODGENERAL);
    public static final Block SPEEDY_BLOCK = registerBlock("speedy_block",
            new SpeedyBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool()), ModItemGroup.TUTMODGENERAL);

    public static final Block STEEL_STAIRS = registerBlock("steel_stairs",
            new ModStairsBlock(ModBlock.STEEL_BLOCK.getDefaultState(),
                    FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.TUTMODGENERAL);

    public static final Block STEEL_SLAB = registerBlock("steel_slab",
            new SlabBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.TUTMODGENERAL);

    public static final Block STEEL_BUTTON = registerBlock("steel_button",
            new ModStoneButtonBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.TUTMODGENERAL);

    public static final Block STEEL_PRESSURE_PLATE = registerBlock("steel_pressure_plate",
            new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.TUTMODGENERAL);


    public static final Block STEEL_FENCE = registerBlock("steel_fence",
            new FenceBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.TUTMODGENERAL);

    public static final Block STEEL_FENCE_GATE = registerBlock("steel_fence_gate",
            new FenceGateBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.TUTMODGENERAL);

    public static final Block STEEL_WALL = registerBlock("steel_wall",
            new WallBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.TUTMODGENERAL);

    public static final Block CHERRY_BLOSSOM_DOOR = registerBlock("cherry_blossom_door",
            new ModDoorBlock(FabricBlockSettings.of(Material.WOOD).strength(4.0f).requiresTool().nonOpaque()), ModItemGroup.TUTMODGENERAL);

    public static final Block CHEERY_BLOSSOM_TRAPDOOR = registerBlock("cherry_blossom_trapdoor",
            new ModTrapdoorBlock(FabricBlockSettings.of(Material.WOOD).strength(4.0f).requiresTool().nonOpaque()), ModItemGroup.TUTMODGENERAL);

    private static Block registerBlock(String name, Block block, ItemGroup itemGroup){
        registerBlockItem(name,block,itemGroup);
        return Registry.register(Registry.BLOCK,new Identifier(MccourseMod.MOD_ID,name),block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup itemGroup) {
        return Registry.register(Registry.ITEM,new Identifier(MccourseMod.MOD_ID,name),
                new BlockItem(block,new FabricItemSettings().group(itemGroup)));
    }
    public static void registerModBlock(){
        System.out.println("registering Blocks "+MccourseMod.MOD_ID);
    }

}

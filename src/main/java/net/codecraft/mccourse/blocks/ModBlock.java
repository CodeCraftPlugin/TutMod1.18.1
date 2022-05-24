package net.codecraft.mccourse.blocks;

import net.codecraft.mccourse.MccourseMod;
import net.codecraft.mccourse.blocks.custom.*;
import net.codecraft.mccourse.blocks.custom.crops.TurnipCrop;
import net.codecraft.mccourse.fluid.Fluids;
import net.codecraft.mccourse.item.ModItemGroup;
import net.codecraft.mccourse.sound.Sounds;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.entity.effect.StatusEffects;
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
                    .requiresTool().strength(0.1f)),
            ModItemGroup.TUTMODGENERAL);

    public static final Block RAW_STEEL_BLOCK = registerBlock("raw_steel_block",new Block(FabricBlockSettings.of(Material.METAL)
                    .requiresTool()),
            ModItemGroup.TUTMODGENERAL);

    public static final Block DEEPSLATE_STEEL_ORE = registerBlock("deepslate_steel_ore",new Block(FabricBlockSettings.of(Material.METAL)
                    .requiresTool().strength(4.5f, 3.0f)),
            ModItemGroup.TUTMODGENERAL);
    public static final Block SPEEDY_BLOCK = registerBlock("speedy_block",
            new SpeedyBlock(FabricBlockSettings.of(Material.STONE).strength(0.1f).requiresTool()), ModItemGroup.TUTMODGENERAL);

    public static final Block STEEL_STAIRS = registerBlock("steel_stairs",
            new ModStairsBlock(ModBlock.STEEL_BLOCK.getDefaultState(),
                    FabricBlockSettings.of(Material.METAL).strength(0.1f).requiresTool()), ModItemGroup.TUTMODGENERAL);

    public static final Block STEEL_SLAB = registerBlock("steel_slab",
            new SlabBlock(FabricBlockSettings.of(Material.METAL).strength(0.1f).requiresTool()), ModItemGroup.TUTMODGENERAL);

    public static final Block STEEL_BUTTON = registerBlock("steel_button",
            new ModStoneButtonBlock(FabricBlockSettings.of(Material.METAL).strength(0.1f).requiresTool()), ModItemGroup.TUTMODGENERAL);

    public static final Block STEEL_PRESSURE_PLATE = registerBlock("steel_pressure_plate",
            new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.of(Material.METAL).strength(0.1f).requiresTool()), ModItemGroup.TUTMODGENERAL);

    public static final Block STEEL_FENCE = registerBlock("steel_fence",
            new FenceBlock(FabricBlockSettings.of(Material.METAL).strength(0.1f).requiresTool()), ModItemGroup.TUTMODGENERAL);

    public static final Block STEEL_FENCE_GATE = registerBlock("steel_fence_gate",
            new FenceGateBlock(FabricBlockSettings.of(Material.METAL).strength(0.1f).requiresTool()), ModItemGroup.TUTMODGENERAL);

    public static final Block STEEL_WALL = registerBlock("steel_wall",
            new WallBlock(FabricBlockSettings.of(Material.METAL).strength(0.1f).requiresTool()), ModItemGroup.TUTMODGENERAL);

    public static final Block CHERRY_BLOSSOM_DOOR = registerBlock("cherry_blossom_door",
            new ModDoorBlock(FabricBlockSettings.of(Material.WOOD).strength(0.1f).requiresTool().nonOpaque()), ModItemGroup.TUTMODGENERAL);

    public static final Block CHEERY_BLOSSOM_TRAPDOOR = registerBlock("cherry_blossom_trapdoor",
            new ModTrapdoorBlock(FabricBlockSettings.of(Material.WOOD).strength(0.1f).requiresTool().nonOpaque()), ModItemGroup.TUTMODGENERAL);

    public static final Block STEEL_LAMP = registerBlock("steel_lamp",
            new SteelLampBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()
                    .luminance((state) -> state.get(SteelLampBlock.CLICKED) ? 15 : 0)
                    .sounds(Sounds.ORICHALCUM_SOUNDS)), ModItemGroup.TUTMODGENERAL);

    public static final Block TURNP_CROP = registerBlockWithoutItem("turnip_crop",
            new TurnipCrop(FabricBlockSettings.copyOf(Blocks.BEETROOTS)));
    //Flower
    public static final Block PINK_ROSE = registerBlock("pink_rose",
            new FlowerBlock(StatusEffects.DOLPHINS_GRACE,9,FabricBlockSettings.copyOf(Blocks.PINK_TULIP)),ModItemGroup.TUTMODGENERAL);

    public static final Block POTTED_PINK_ROSE = registerBlockWithoutItem("potted_pink_rose",
            new FlowerPotBlock(ModBlock.PINK_ROSE,FabricBlockSettings.copyOf(Blocks.PINK_TULIP)));

    //Fluids
    public static final Block HONEY_FLUID_BLOCK = registerBlockWithoutItem("honey_fluid_block",
            new Fluid(Fluids.HONEY_STILL,FabricBlockSettings.of(Material.WATER).nonOpaque().dropsNothing().noCollision()));
    //Methods
    private static Block registerBlockWithoutItem(String name, Block block){
        return Registry.register(Registry.BLOCK,new Identifier(MccourseMod.MOD_ID,name),block);
    }


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

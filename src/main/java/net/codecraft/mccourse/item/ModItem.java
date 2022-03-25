package net.codecraft.mccourse.item;

import net.codecraft.mccourse.MccourseMod;
import net.codecraft.mccourse.item.custom.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterials;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItem {
    //Items
    public static final Item DOWSING_ROD = registerItem("dowsing_rod",
            new DowsingRodItem(new FabricItemSettings().group(ModItemGroup.TUTMODGENERAL).maxDamage(32)));
    public static final Item MJOLLNIR  = registerItem("mjollnir",new Leonear(new FabricItemSettings().group(ModItemGroup.TUTMODGENERAL)));
    public static final Item STEEL_INGOT = registerItem("steel_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.TUTMODGENERAL)));
    public static final Item RAW_STEEL = registerItem("raw_steel",
            new Item(new FabricItemSettings().group(ModItemGroup.TUTMODGENERAL)));
    public static final Item TURNIP = registerItem("turnip",
            new Item(new FabricItemSettings().group(ModItemGroup.TUTMODGENERAL).food(ModFoodComponents.TURNIP)));
    public static final Item COAL_SLIVER = registerItem("coal_sliver",
            new Item(new FabricItemSettings().group(ModItemGroup.TUTMODGENERAL)));
    //Tool
    public static final Item STEEL_PICKAXE = registerItem("steel_pickaxe",
            new ModPickaxeItem(ModToolMaterial.STEEL,-3,20f,new FabricItemSettings().group(ModItemGroup.TUTMODGENERAL)));
    public static final Item STEEL_AXE = registerItem("steel_axe",
            new ModAxeItem(ModToolMaterial.STEEL,5  ,20f,new FabricItemSettings().group(ModItemGroup.TUTMODGENERAL)));
    public static final Item STEEL_SHOVEL = registerItem("steel_shovel",
            new ModShovelItem(ModToolMaterial.STEEL,-10,20f,new FabricItemSettings().group(ModItemGroup.TUTMODGENERAL)));
    public static final Item STEEL_HOE = registerItem("steel_hoe",
            new ModHoeItem(ModToolMaterial.STEEL,-11,20f,new FabricItemSettings().group(ModItemGroup.TUTMODGENERAL)));
    public static final Item STEEL_SWORD = registerItem("steel_sword",
            new SwordItem(ModToolMaterial.STEEL,4,20f,new FabricItemSettings().group(ModItemGroup.TUTMODGENERAL)));
    public static final Item WOOD_PAXEL = registerItem("wood_paxel",new PaxelItem(ToolMaterials.WOOD,6,6,
            new FabricItemSettings().group(ModItemGroup.TUTMODGENERAL)));

    //Methods
   private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MccourseMod.MOD_ID, name),item);
    }
    public static void registerModItem(){
        MccourseMod.LOGGER.info("The Item are registered by"+MccourseMod.MOD_ID);
    }
}

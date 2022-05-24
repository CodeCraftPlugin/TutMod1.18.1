package net.codecraft.mccourse.item;

import net.codecraft.mccourse.MccourseMod;
import net.codecraft.mccourse.blocks.ModBlock;
import net.codecraft.mccourse.fluid.Fluids;
import net.codecraft.mccourse.item.custom.*;
import net.codecraft.mccourse.sound.Sounds;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
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

    public static final Item STEEL_BOW = registerItem("steel_bow",
            new BowItem(new FabricItemSettings().group(ModItemGroup.TUTMODGENERAL)));
    public static final Item TURNIP = registerItem("turnip",
            new Item(new FabricItemSettings().group(ModItemGroup.TUTMODGENERAL).food(ModFoodComponents.TURNIP)));
    public static final Item COAL_SLIVER = registerItem("coal_sliver",
            new Item(new FabricItemSettings().group(ModItemGroup.TUTMODGENERAL)));
    public static final Item DATA_TABLET = registerItem("data_tablet",
            new DataTabletItem(new FabricItemSettings().group(ModItemGroup.TUTMODGENERAL)));
    public static final Item TURNIP_SEEDS = registerItem("turnip_seeds",
            new AliasedBlockItem(ModBlock.TURNP_CROP,new FabricItemSettings().group(ModItemGroup.TUTMODGENERAL)));
    //Tools
    public static final Item STEEL_PICKAXE = registerItem("steel_pickaxe",
            new ModPickaxeItem(ModToolMaterial.STEEL,-3,5f,new FabricItemSettings().group(ModItemGroup.TUTMODGENERAL)));
    public static final Item STEEL_AXE = registerItem("steel_axe",
            new ModAxeItem(ModToolMaterial.STEEL,5  ,15f,new FabricItemSettings().group(ModItemGroup.TUTMODGENERAL)));
    public static final Item STEEL_SHOVEL = registerItem("steel_shovel",
            new ModShovelItem(ModToolMaterial.STEEL,-10,0f,new FabricItemSettings().group(ModItemGroup.TUTMODGENERAL)));
    public static final Item STEEL_HOE = registerItem("steel_hoe",
            new ModHoeItem(ModToolMaterial.STEEL,-11,0f,new FabricItemSettings().group(ModItemGroup.TUTMODGENERAL)));
    public static final Item STEEL_SWORD = registerItem("steel_sword",
            new SwordItem(ModToolMaterial.STEEL,4,20f,new FabricItemSettings().group(ModItemGroup.TUTMODGENERAL)));
    // Custom Tools
    public static final Item STEEL_PAXEL = registerItem("steel_paxel",
            new PaxelItem(ModToolMaterial.STEEL,15,1,new FabricItemSettings().group(ModItemGroup.TUTMODGENERAL)));
    //Armors
    //Helmet
    public static final Item STEEL_HELMET = registerItem("steel_helmet",
            new ArmorItem(ModArmorMaterials.STEEL, EquipmentSlot.HEAD,new FabricItemSettings().group(ModItemGroup.TUTMODGENERAL)));
    //Chestplate
    public static final Item STEEL_CHESTPLATE = registerItem("steel_chestplate",
            new ArmorItem(ModArmorMaterials.STEEL, EquipmentSlot.CHEST,new FabricItemSettings().group(ModItemGroup.TUTMODGENERAL)));
    //Leggings
    public static final Item STEEL_LEGGINGS = registerItem("steel_leggings",
            new ArmorItem(ModArmorMaterials.STEEL, EquipmentSlot.LEGS,new FabricItemSettings().group(ModItemGroup.TUTMODGENERAL)));
    //Boots
    public static final Item STEEL_BOOTS = registerItem("steel_boots",
            new ArmorItem(ModArmorMaterials.STEEL, EquipmentSlot.FEET,new FabricItemSettings().group(ModItemGroup.TUTMODGENERAL)));
    //Music Disk
    public static final Item BAR_BRAWL_MUSIC_DISK = registerItem("bar_brawl_music_disc",
            new MusicDiskItem(9, Sounds.BAR_BRAWL,new FabricItemSettings().group(ModItemGroup.TUTMODGENERAL).maxCount(1)));
    //Bucket Items
    public static final Item HONEY_BUCKET = registerItem("honey_bucket",
            new BucketItem(Fluids.HONEY_STILL, new FabricItemSettings().group(ModItemGroup.TUTMODGENERAL).maxCount(1)));
    //Methods
   private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MccourseMod.MOD_ID, name),item);
    }
    public static void registerModItem(){
        MccourseMod.LOGGER.info("The Item are registered by"+MccourseMod.MOD_ID);
    }
}

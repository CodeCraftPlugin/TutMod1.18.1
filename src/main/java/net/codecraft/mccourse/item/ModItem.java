package net.codecraft.mccourse.item;

import net.codecraft.mccourse.MccourseMod;
import net.codecraft.mccourse.item.custom.DowsingRodItem;
import net.codecraft.mccourse.item.custom.Leonear;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
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
        private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MccourseMod.MOD_ID, name),item);
    }
    public static void registerModItem(){
        MccourseMod.LOGGER.info("The Item are registered by"+MccourseMod.MOD_ID);
    }
}

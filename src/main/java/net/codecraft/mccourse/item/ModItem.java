package net.codecraft.mccourse.item;

import net.codecraft.mccourse.MccourseMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItem {
    //Items
   public static final Item STEEL_INGOT = registerItem("steel_ingot",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    //Methods
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MccourseMod.MOD_ID, name), item);
    }
    public static void registerModItem(){
        MccourseMod.LOGGER.info("The Item are registered by"+MccourseMod.MOD_ID);
    }
}

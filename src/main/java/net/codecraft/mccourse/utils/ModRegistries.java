package net.codecraft.mccourse.utils;

import net.codecraft.mccourse.MccourseMod;
import net.codecraft.mccourse.item.ModItem;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.ComposterBlock;

public class ModRegistries {
    public static void registerModStuffs() {
        registerFuels();
        registerModComposterChances();
    }

    private static void registerFuels() {
        System.out.println("Registering Fuels for + " + MccourseMod.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;
        registry.add(ModItem.COAL_SLIVER,400);
    }
    private static void registerModComposterChances() {
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItem.TURNIP_SEEDS, 0.35f);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItem.TURNIP, 10.00f);
    }
}

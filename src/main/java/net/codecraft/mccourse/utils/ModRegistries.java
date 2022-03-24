package net.codecraft.mccourse.utils;

import net.codecraft.mccourse.MccourseMod;
import net.codecraft.mccourse.item.ModItem;
import net.fabricmc.fabric.api.registry.FuelRegistry;

public class ModRegistries {
    public static void registerModStuffs() {
        registerFuels();
    }

    private static void registerFuels() {
        System.out.println("Registering Fuels for + " + MccourseMod.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;
        registry.add(ModItem.COAL_SLIVER,400);
    }
}

package net.codecraft.mccourse.utils;

import net.codecraft.mccourse.MccourseMod;
import net.codecraft.mccourse.commands.PlayerEventCopyFrom;
import net.codecraft.mccourse.commands.ReturnHomeCommand;
import net.codecraft.mccourse.commands.SetHomeCommand;
import net.codecraft.mccourse.item.ModItem;
import net.fabricmc.fabric.api.command.v1.CommandRegistrationCallback;
import net.fabricmc.fabric.api.entity.event.v1.ServerPlayerEvents;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.ComposterBlock;

public class ModRegistries {
    public static void registerModStuffs() {
        registerFuels();
        registerModComposterChances();
        registerCommands();
        registerEvents();
    }

    private static void registerFuels() {
        System.out.println("Registering Fuels for " + MccourseMod.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;
        registry.add(ModItem.COAL_SLIVER,400);
    }
    private static void registerModComposterChances() {
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItem.TURNIP_SEEDS, 0.35f);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItem.TURNIP, 10.00f);
    }
    private static void registerCommands() {
        CommandRegistrationCallback.EVENT.register(SetHomeCommand::register);
        CommandRegistrationCallback.EVENT.register(ReturnHomeCommand::register);
    }

    private static void registerEvents() {
        ServerPlayerEvents.COPY_FROM.register(new PlayerEventCopyFrom());
    }
}

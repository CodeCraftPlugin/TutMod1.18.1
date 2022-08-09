package net.codecraft.mccourse.screen;

import net.codecraft.mccourse.MccourseMod;
import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ScreenHandler {
    public static ScreenHandlerType<SteelMakerScreenHandler> STEEL_MAKER_SCREEN_HANDLER =
            ScreenHandlerRegistry.registerSimple(new Identifier(MccourseMod.MOD_ID,"steel_maker"),SteelMakerScreenHandler::new);
}

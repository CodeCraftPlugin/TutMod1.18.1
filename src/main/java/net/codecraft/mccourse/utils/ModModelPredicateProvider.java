package net.codecraft.mccourse.utils;

import net.codecraft.mccourse.*;
import net.codecraft.mccourse.item.*;
import net.fabricmc.fabric.api.object.builder.v1.client.model.*;
import net.minecraft.util.*;

public class ModModelPredicateProvider {
    public static void registerModModels() {
        FabricModelPredicateProviderRegistry.register(ModItem.DATA_TABLET, new Identifier(MccourseMod.MOD_ID, "on"),
                ((stack, world, entity, seed) -> stack.hasNbt() ? 1f : 0f));
    }
}

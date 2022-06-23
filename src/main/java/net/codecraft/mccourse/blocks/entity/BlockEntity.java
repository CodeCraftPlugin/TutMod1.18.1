package net.codecraft.mccourse.blocks.entity;

import net.codecraft.mccourse.MccourseMod;
import net.codecraft.mccourse.blocks.ModBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockEntity {
    public static BlockEntityType<SteelMaker> STEEL_MAKER;

    public static void registerAllEntities() {
        STEEL_MAKER = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                new Identifier(MccourseMod.MOD_ID, "steel_maker"),
                FabricBlockEntityTypeBuilder.create(SteelMaker::new,
                        ModBlock.CARBONIZER).build(null));
        System.out.println("test");
    }
}

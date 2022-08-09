package net.codecraft.mccourse.blocks.entity;

import net.codecraft.mccourse.MccourseMod;
import net.codecraft.mccourse.blocks.ModBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockEntity {
    public static final BlockEntityType<SteelMaker> STEEL_MAKER = registerBlockEntity("steel_maker",FabricBlockEntityTypeBuilder.create(SteelMaker::new,
            ModBlock.STEEL_MAKER).build(null));

    private static BlockEntityType registerBlockEntity(String name,BlockEntityType blockEntityType){
        return Registry.register(Registry.BLOCK_ENTITY_TYPE,
                new Identifier(MccourseMod.MOD_ID, name),blockEntityType);
    }

    public static void registeredAllBlockEntity(){
        MccourseMod.LOGGER.info("loaded all block entity");
    }
}

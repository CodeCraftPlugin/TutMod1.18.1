package net.codecraft.mccourse.blocks.custom;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.StairsBlock;

public class ModStairsBlock extends StairsBlock {
    public ModStairsBlock(BlockState baseBlockState, Settings settings) {
        super(baseBlockState, settings);
    }
}

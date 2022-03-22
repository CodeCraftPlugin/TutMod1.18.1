package net.codecraft.mccourse.blocks.custom;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.PressurePlateBlock;

public class ModPressurePlateBlock extends PressurePlateBlock {
    public ModPressurePlateBlock(ActivationRule type, Settings settings) {
        super(type, settings);
    }
}

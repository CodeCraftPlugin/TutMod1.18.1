package net.codecraft.mccourse.blocks.custom;

import net.minecraft.block.FluidBlock;
import net.minecraft.fluid.FlowableFluid;

public class Fluid extends FluidBlock {
    public Fluid(FlowableFluid fluid, Settings settings) {
        super(fluid, settings);
    }
}

package net.codecraft.mccourse;

import net.codecraft.mccourse.blocks.ModBlock;
import net.codecraft.mccourse.fluid.Fluids;
import net.codecraft.mccourse.utils.*;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.fabricmc.fabric.impl.client.rendering.fluid.FluidRendererHookContainer;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.block.FluidRenderer;

public class MccourseModClient implements ClientModInitializer {


    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.CHERRY_BLOSSOM_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.CHEERY_BLOSSOM_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.STEEL_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.TURNP_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.PINK_ROSE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.POTTED_PINK_ROSE, RenderLayer.getCutout());
        FluidRenderHandlerRegistry.INSTANCE.register(Fluids.HONEY_STILL,new SimpleFluidRenderHandler(
                SimpleFluidRenderHandler.WATER_STILL,
                SimpleFluidRenderHandler.WATER_FLOWING,
                SimpleFluidRenderHandler.WATER_OVERLAY,14269273
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(Fluids.HONEY_FLOWING,new SimpleFluidRenderHandler(
                SimpleFluidRenderHandler.WATER_STILL,
                SimpleFluidRenderHandler.WATER_FLOWING,
                SimpleFluidRenderHandler.WATER_OVERLAY,14269273
        ));
        ModModelPredicateProvider.registerModModels();
    }
}

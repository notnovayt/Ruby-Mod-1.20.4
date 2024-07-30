package net.surya.rubymod;

import com.terraformersmc.terraform.boat.api.client.TerraformBoatClientHelper;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;
import net.minecraft.client.render.entity.FlyingItemEntityRenderer;
import net.surya.rubymod.block.ModBlocks;
import net.surya.rubymod.block.entity.ModBlockEntities;
import net.surya.rubymod.block.entity.renderer.GemPolishingBlockEntityRenderer;
import net.surya.rubymod.entity.ModBoats;
import net.surya.rubymod.entity.ModEntities;
import net.surya.rubymod.entity.client.ModModelLayers;
import net.surya.rubymod.entity.client.PorcupineModel;
import net.surya.rubymod.entity.client.PorcupineRenderer;
import net.surya.rubymod.item.ModItems;
import net.surya.rubymod.screen.GemPolishingScreen;
import net.surya.rubymod.screen.ModScreenHandlers;

public class RubyModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RUBY_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RUBY_TRAPDOOR, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.TOMATO_CROP, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CORN_CROP, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DAHLIA, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_DAHLIA, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.HAZELNUT_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.HAZELNUT_SAPLING, RenderLayer.getCutout());

        EntityRendererRegistry.register(ModEntities.PORCUPINE, PorcupineRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.PORCUPINE, PorcupineModel::getTexturedModelData);

        HandledScreens.register(ModScreenHandlers.GEM_POLISHING_SCREEN_HANDLER, GemPolishingScreen::new);

        BlockEntityRendererFactories.register(ModBlockEntities.GEM_POLISHING_STATION_BLOCK_ENTITY,
                GemPolishingBlockEntityRenderer::new);

        TerraformBoatClientHelper.registerModelLayers(ModBoats.HAZELNUT_BOAT_ID, false);

        EntityRendererRegistry.register(ModEntities.DICE_PROJECTILE, FlyingItemEntityRenderer::new);

//        SpriteIdentifierRegistry.INSTANCE.addIdentifier(new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE,
        //    ModBlocks.HAZELNUT_SIGN_TEXTURE));
//        SpriteIdentifierRegistry.INSTANCE.addIdentifier(new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE,
        //   ModBlocks.HAZELNUT_HANGING_SIGN_TEXTURE));
    }
}

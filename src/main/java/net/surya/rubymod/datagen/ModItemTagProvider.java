package net.surya.rubymod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.surya.rubymod.block.ModBlocks;
import net.surya.rubymod.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.RUBY_HELMET, ModItems.RUBY_CHESTPLATE, ModItems.RUBY_LEGGINGS, ModItems.RUBY_BOOTS);

        getOrCreateTagBuilder(ItemTags.MUSIC_DISCS)
                .add(ModItems.KAIKAIKITAN_MUSIC_DISC);

        getOrCreateTagBuilder(ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .add(ModItems.KAIKAIKITAN_MUSIC_DISC);

        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(ModBlocks.HAZELNUT_PLANKS.asItem());

        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.HAZELNUT_LOG.asItem())
                .add(ModBlocks.HAZELNUT_WOOD.asItem())
                .add(ModBlocks.STRIPPED_HAZELNUT_LOG.asItem())
                .add(ModBlocks.STRIPPED_HAZELNUT_WOOD.asItem());
    }
}

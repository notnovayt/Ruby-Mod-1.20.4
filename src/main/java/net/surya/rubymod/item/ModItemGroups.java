package net.surya.rubymod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.surya.rubymod.RubyMod;
import net.surya.rubymod.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(RubyMod.MOD_ID, "ruby"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby"))
                    .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {
                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.RAW_RUBY);

                        entries.add(ModItems.COAL_BRIQUETTE);

                        entries.add(ModItems.TOMATO);

                        entries.add(ModBlocks.RUBY_BLOCK);
                        entries.add(ModBlocks.RAW_RUBY_BLOCK);

                        entries.add(ModItems.METAL_DETECTOR);

                        entries.add(ModItems.RUBY_STAFF);

                        entries.add(ModItems.RUBY_SWORD);
                        entries.add(ModItems.RUBY_AXE);
                        entries.add(ModItems.RUBY_PICKAXE);
                        entries.add(ModItems.RUBY_SHOVEL);
                        entries.add(ModItems.RUBY_HOE);

                        entries.add(ModItems.RUBY_HELMET);
                        entries.add(ModItems.RUBY_CHESTPLATE);
                        entries.add(ModItems.RUBY_LEGGINGS);
                        entries.add(ModItems.RUBY_BOOTS);

                        entries.add(ModItems.TOMATO_SEEDS);

                        entries.add(ModItems.CORN);
                        entries.add(ModItems.CORN_SEEDS);

                        entries.add(ModItems.KAIKAIKITAN_MUSIC_DISC);

                        entries.add(ModItems.PORCUPINE_SPAWN_EGG);

//                        entries.add(ModItems.HAZELNUT_SIGN);
//                        entries.add(ModItems.HANGING_HAZELNUT_SIGN);

                        entries.add(ModBlocks.SOUND_BLOCK);

                        entries.add(ModBlocks.RUBY_ORE);
                        entries.add(ModBlocks.DEEPSLATE_RUBY_ORE);
                        entries.add(ModBlocks.END_STONE_RUBY_ORE);
                        entries.add(ModBlocks.NETHER_RUBY_ORE);

                        entries.add(ModBlocks.RUBY_DOOR);
                        entries.add(ModBlocks.RUBY_STAIRS);
                        entries.add(ModBlocks.RUBY_TRAPDOOR);
                        entries.add(ModBlocks.RUBY_BUTTON);
                        entries.add(ModBlocks.RUBY_FENCE);
                        entries.add(ModBlocks.RUBY_FENCE_GATE);
                        entries.add(ModBlocks.RUBY_PRESSURE_PLATE);
                        entries.add(ModBlocks.RUBY_WALL);
                        entries.add(ModBlocks.RUBY_SLAB);

                        entries.add(ModBlocks.DAHLIA);

                        entries.add(ModBlocks.GEM_POLISHING_STATION);

                        entries.add(ModBlocks.HAZELNUT_LOG);
                        entries.add(ModBlocks.HAZELNUT_LEAVES);
                        entries.add(ModBlocks.HAZELNUT_PLANKS);
                        entries.add(ModBlocks.STRIPPED_HAZELNUT_WOOD);
                        entries.add(ModBlocks.STRIPPED_HAZELNUT_LOG);
                        entries.add(ModBlocks.HAZELNUT_WOOD);

                    }).build());


    public static void registerItemGroups(){
        RubyMod.LOGGER.info("Registering Item Groups for " + RubyMod.MOD_ID);
    }
}

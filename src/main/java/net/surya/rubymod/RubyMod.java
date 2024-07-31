package net.surya.rubymod;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.surya.rubymod.block.ModBlocks;
import net.surya.rubymod.block.entity.ModBlockEntities;
import net.surya.rubymod.entity.ModBoats;
import net.surya.rubymod.entity.ModEntities;
import net.surya.rubymod.entity.custom.PorcupineEntity;
import net.surya.rubymod.item.ModItemGroups;
import net.surya.rubymod.item.ModItems;
import net.surya.rubymod.recipe.ModRecipes;
import net.surya.rubymod.screen.ModScreenHandlers;
import net.surya.rubymod.sound.ModSounds;
import net.surya.rubymod.util.ModCustomTrades;
import net.surya.rubymod.util.ModLootTableModifiers;
import net.surya.rubymod.villager.ModVillagers;
import net.surya.rubymod.world.gen.ModWorldGeneration;
import net.surya.rubymod.world.tree.ModFoliagePlacerTypes;
import net.surya.rubymod.world.tree.ModTrunkPlacerTypes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RubyMod implements ModInitializer {
    public static final String MOD_ID = "rubymod";
	public static final Logger LOGGER = LoggerFactory.getLogger("MOD_ID");

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		FuelRegistry.INSTANCE.add(ModItems.COAL_BRIQUETTE, 200);

		ModLootTableModifiers.modifyLootTables();

		ModCustomTrades.registerCustomTrades();

		ModVillagers.registerVillagers();

		ModSounds.registerSounds();

		ModRecipes.registerRecipes();

		ModBlockEntities.registerBlockEntities();
		ModScreenHandlers.registerScreenHandlers();

		ModTrunkPlacerTypes.register();
		ModFoliagePlacerTypes.register();

		FabricDefaultAttributeRegistry.register(ModEntities.PORCUPINE, PorcupineEntity.createPorcupineAttributes());

		StrippableBlockRegistry.register(ModBlocks.HAZELNUT_LOG, ModBlocks.STRIPPED_HAZELNUT_LOG);
		StrippableBlockRegistry.register(ModBlocks.HAZELNUT_WOOD, ModBlocks.STRIPPED_HAZELNUT_WOOD);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.HAZELNUT_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.HAZELNUT_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_HAZELNUT_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_HAZELNUT_LOG, 5, 5);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.HAZELNUT_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.HAZELNUT_LEAVES, 30, 60);

		ModBoats.registerBoats();

		ModWorldGeneration.generateModWorldGen();
	}
}
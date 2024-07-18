package net.surya.rubymod;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.surya.rubymod.block.ModBlocks;
import net.surya.rubymod.entity.ModEntities;
import net.surya.rubymod.entity.custom.PorcupineEntity;
import net.surya.rubymod.item.ModItemGroups;
import net.surya.rubymod.item.ModItems;
import net.surya.rubymod.sound.ModSounds;
import net.surya.rubymod.util.ModCustomTrades;
import net.surya.rubymod.util.ModLootTableModifiers;
import net.surya.rubymod.villager.ModVillagers;
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

		FabricDefaultAttributeRegistry.register(ModEntities.PORCUPINE, PorcupineEntity.createPorcupineAttributes());
	}
}
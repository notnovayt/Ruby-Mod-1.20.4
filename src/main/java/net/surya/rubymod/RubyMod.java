package net.surya.rubymod;

import net.fabricmc.api.ModInitializer;

import net.surya.rubymod.item.ModItemGroups;
import net.surya.rubymod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RubyMod implements ModInitializer {
    public static final String MOD_ID = "rubymod";
	public static final Logger LOGGER = LoggerFactory.getLogger("MOD_ID");

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
	}
}
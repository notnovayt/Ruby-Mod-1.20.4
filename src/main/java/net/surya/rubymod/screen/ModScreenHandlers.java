package net.surya.rubymod.screen;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.surya.rubymod.RubyMod;

public class ModScreenHandlers {
    public static final ScreenHandlerType<GemPolishingScreenHandler> GEM_POLISHING_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, new Identifier(RubyMod.MOD_ID, "gem_polishing"),
                    new ExtendedScreenHandlerType<>(GemPolishingScreenHandler::new));

    public static void registerScreenHandlers() {
        RubyMod.LOGGER.info("Registering Screen Handlers for " + RubyMod.MOD_ID);
    }
}

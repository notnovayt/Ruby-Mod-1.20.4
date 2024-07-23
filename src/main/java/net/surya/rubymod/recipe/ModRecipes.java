package net.surya.rubymod.recipe;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.surya.rubymod.RubyMod;

public class ModRecipes {
    public static void registerRecipes() {
        Registry.register(Registries.RECIPE_SERIALIZER, new Identifier(RubyMod.MOD_ID, GemPolishingRecipe.Serializer.ID),
                GemPolishingRecipe.Serializer.INSTANCE);
        Registry.register(Registries.RECIPE_TYPE, new Identifier(RubyMod.MOD_ID, GemPolishingRecipe.Type.ID),
                GemPolishingRecipe.Type.INSTANCE);
    }
}

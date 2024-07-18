package net.surya.rubymod.entity.client;

import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;
import net.surya.rubymod.RubyMod;

public class ModModelLayers {
    public static final EntityModelLayer PORCUPINE =
            new EntityModelLayer(new Identifier(RubyMod.MOD_ID, "porcupine"), "main");
}

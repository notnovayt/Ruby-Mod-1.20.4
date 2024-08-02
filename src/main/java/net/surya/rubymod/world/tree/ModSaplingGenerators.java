package net.surya.rubymod.world.tree;

import net.minecraft.block.SaplingGenerator;
import net.surya.rubymod.world.ModConfiguredFeatures;

import java.util.Optional;

public class ModSaplingGenerators {
    public static final SaplingGenerator HAZELNUT =
            new SaplingGenerator("hazelnut", 0f, Optional.empty(),
                    Optional.empty(),
                    Optional.of(ModConfiguredFeatures.HAZELNUT_KEY),
                    Optional.empty(),
                    Optional.empty(),
                    Optional.empty());

}

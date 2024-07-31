package net.surya.rubymod.world.tree;

import net.minecraft.world.gen.foliage.FoliagePlacerType;
import net.surya.rubymod.RubyMod;
import net.surya.rubymod.mixin.FoliagePlacerTypeInvoker;
import net.surya.rubymod.world.tree.custom.HazelnutFoliagePlacer;

public class ModFoliagePlacerTypes {
    public static final FoliagePlacerType<?> HAZELNUT_FOLIAGE_PLACER = FoliagePlacerTypeInvoker.callRegister("hazelnut_foliage_placer",
            HazelnutFoliagePlacer.CODEC);

    public static void register() {
        RubyMod.LOGGER.info("Registering Foliage Placer for " + RubyMod.MOD_ID);
    }
}

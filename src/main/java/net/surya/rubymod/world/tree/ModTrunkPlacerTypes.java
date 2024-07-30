package net.surya.rubymod.world.tree;

import net.minecraft.world.gen.trunk.TrunkPlacerType;
import net.surya.rubymod.RubyMod;
import net.surya.rubymod.mixin.TrunkPlacerTypeInvoker;
import net.surya.rubymod.world.tree.custom.HazelnutTrunkPlacer;

public class ModTrunkPlacerTypes {
    public static final TrunkPlacerType<?> HAZELNUT_TRUNK_PLACER = TrunkPlacerTypeInvoker.callRegister("hazelnut_trunk_placer",
            HazelnutTrunkPlacer.CODEC);

    public static void register() {
        RubyMod.LOGGER.info("Registering Trunk Placers for " + RubyMod.MOD_ID);
    }
}

package net.surya.rubymod.world.biome;

import net.minecraft.util.Identifier;
import net.surya.rubymod.RubyMod;
import net.surya.rubymod.world.biome.surface.ModMaterialRules;
import terrablender.api.Regions;
import terrablender.api.SurfaceRuleManager;
import terrablender.api.TerraBlenderApi;

public class ModTerrablenderAPI implements TerraBlenderApi {
    @Override
    public void onTerraBlenderInitialized() {
        Regions.register(new ModOverworldRegion(new Identifier(RubyMod.MOD_ID, "overworld"), 4));

        SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD, RubyMod.MOD_ID, ModMaterialRules.makeRules());
    }
}
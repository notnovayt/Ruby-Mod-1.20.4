package net.surya.rubymod.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.surya.rubymod.RubyMod;
import net.surya.rubymod.entity.custom.DiceProjectileEntity;
import net.surya.rubymod.entity.custom.PorcupineEntity;

public class ModEntities {
    public static final EntityType<DiceProjectileEntity> DICE_PROJECTILE = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(RubyMod.MOD_ID, "dice_projectile"),
            FabricEntityTypeBuilder.<DiceProjectileEntity>create(SpawnGroup.MISC, DiceProjectileEntity::new)
                    .dimensions(EntityDimensions.fixed(0.25f, 0.25f)).build());

    public static final EntityType<PorcupineEntity> PORCUPINE = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(RubyMod.MOD_ID, "porcupine"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, PorcupineEntity::new)
                    .dimensions(EntityDimensions.fixed(1f, 1f)).build());
}

package ru.joraly.grenadesmod.entity;

import ru.joraly.grenadesmod.GrenadesMod;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, GrenadesMod.MOD_ID);


    public static final RegistryObject<EntityType<KoffaProjectile>> KOFFA_PROJECTILE
            = ENTITY_TYPES.register("koffa_projectile", () -> EntityType.Builder.<KoffaProjectile>of(KoffaProjectile::new, MobCategory.MISC)
            .sized(0.5f, 0.5f).build("koffa_projectile"));

    public static final RegistryObject<EntityType<GrenadeV1Projectile>> GRENADEV1_PROJECTILE
            = ENTITY_TYPES.register("grenadev1_projectile", () -> EntityType.Builder.<GrenadeV1Projectile>of(GrenadeV1Projectile::new, MobCategory.MISC)
            .sized(0.5f, 0.5f).build("grenadev1_projectile"));

    public static final RegistryObject<EntityType<GrenadeV2Projectile>> GRENADEV2_PROJECTILE
            = ENTITY_TYPES.register("grenadev2_projectile", () -> EntityType.Builder.<GrenadeV2Projectile>of(GrenadeV2Projectile::new, MobCategory.MISC)
            .sized(0.5f, 0.5f).build("grenadev2_projectile"));

    public static final RegistryObject<EntityType<GrenadeV3Projectile>> GRENADEV3_PROJECTILE
            = ENTITY_TYPES.register("grenadev3_projectile", () -> EntityType.Builder.<GrenadeV3Projectile>of(GrenadeV3Projectile::new, MobCategory.MISC)
            .sized(0.5f, 0.5f).build("grenadev3_projectile"));

    public static final RegistryObject<EntityType<GrenadeV4Projectile>> GRENADEV4_PROJECTILE
            = ENTITY_TYPES.register("grenadev4_projectile", () -> EntityType.Builder.<GrenadeV4Projectile>of(GrenadeV4Projectile::new, MobCategory.MISC)
            .sized(0.5f, 0.5f).build("grenadev4_projectile"));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}

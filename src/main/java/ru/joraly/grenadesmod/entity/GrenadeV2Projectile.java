package ru.joraly.grenadesmod.entity;

import ru.joraly.grenadesmod.item.ModItems;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.ThrowableItemProjectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;

public class GrenadeV2Projectile extends ThrowableItemProjectile {
    public GrenadeV2Projectile(EntityType<? extends ThrowableItemProjectile> entityType, Level level) {
        super(entityType, level);
    }

    private boolean hasExploded = false;


    public GrenadeV2Projectile(Level level) {
        super(ModEntities.KOFFA_PROJECTILE.get(), level);
    }

    public GrenadeV2Projectile(Level level, LivingEntity livingEntity) {
        super(ModEntities.KOFFA_PROJECTILE.get(), livingEntity, level);
    }


    @Override
    protected Item getDefaultItem() {
        return ModItems.KOFFA.get();
    }

    @Override
    protected void onHitBlock(BlockHitResult res) {
        if(!this.level.isClientSide() && !this.hasExploded){
            this.level.broadcastEntityEvent(this, (byte)3);
            this.level.explode(this, this.getX(), this.getY(), this.getZ(), 10.0F, Explosion.BlockInteraction.BREAK);
            this.hasExploded = true;
        }

        super.onHitBlock(res);
    }
}

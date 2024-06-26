package ru.joraly.grenadesmod.item;

import ru.joraly.grenadesmod.entity.GrenadeV4Projectile;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class GrenadeV4Item extends Item {
    public GrenadeV4Item(Properties properties) { super(properties);}

    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand inter) {
        ItemStack itemstack = player.getItemInHand(inter);
        level.playSound((Player) null, player.getX(), player.getY(), player.getZ(), SoundEvents.SNOWBALL_THROW, SoundSource.NEUTRAL, 0.5F, 0.4F / (level.getRandom().nextFloat() * 0.4F + 0.8F));
        if (!level.isClientSide) {
            GrenadeV4Projectile grenadev4 = new GrenadeV4Projectile(level, player);
            grenadev4.setItem(itemstack);
            grenadev4.shootFromRotation(player, player.getXRot(), player.getYRot(), 0.0F, 1.5F, 1.0F);
            level.addFreshEntity(grenadev4);
        }

        player.awardStat(Stats.ITEM_USED.get(this));
        if (!player.getAbilities().instabuild) {
            itemstack.shrink(1);
        }

        return InteractionResultHolder.sidedSuccess(itemstack, level.isClientSide());
    }
}
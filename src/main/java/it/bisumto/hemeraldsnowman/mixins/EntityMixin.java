package it.bisumto.hemeraldsnowman.mixins;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.slot.Slot;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import static net.minecraft.item.Items.DIAMOND_HELMET;

@Mixin(Entity.class)
public class EntityMixin {

    @Inject(method = "isInvulnerableTo", at = @At("HEAD"), cancellable = true)
    void noExplosion(DamageSource damageSource, CallbackInfoReturnable<Boolean> cir){
        if(damageSource.isExplosive() && (Object)this instanceof PlayerEntity player) {
            if(player.getEquippedStack(EquipmentSlot.HEAD).isOf(DIAMOND_HELMET))
                cir.setReturnValue(false);
        }
    }
}

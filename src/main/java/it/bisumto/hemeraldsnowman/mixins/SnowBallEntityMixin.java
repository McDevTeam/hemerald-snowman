package it.bisumto.hemeraldsnowman.mixins;

import net.minecraft.entity.projectile.thrown.SnowballEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(SnowballEntity.class)
public class SnowBallEntityMixin {

    @ModifyConstant(method = "onEntityHit", constant = @Constant(intValue = 0))
    private int injected(int value) {
        return ++value;
    }
}

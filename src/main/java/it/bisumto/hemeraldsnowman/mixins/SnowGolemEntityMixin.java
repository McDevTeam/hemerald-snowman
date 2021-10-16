package it.bisumto.hemeraldsnowman.mixins;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.RevengeGoal;
import net.minecraft.entity.passive.GolemEntity;
import net.minecraft.entity.passive.SnowGolemEntity;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(SnowGolemEntity.class)
public class SnowGolemEntityMixin extends GolemEntity {

    @Inject(method = "initGoals", at = @At("RETURN"))
    void newRevengeGoal(CallbackInfo ci) {
        this.targetSelector.add(1, new RevengeGoal((SnowGolemEntity) (Object) this));
    }

    protected SnowGolemEntityMixin(EntityType<? extends GolemEntity> entityType, World world) {
        super(entityType, world);
    }
}
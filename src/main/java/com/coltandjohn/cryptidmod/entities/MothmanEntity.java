package com.coltandjohn.cryptidmod.entities;

import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.world.World;

public class MothmanEntity extends CreatureEntity {

    public MothmanEntity(EntityType<? extends CreatureEntity> p_i48575_1_, World p_i48575_2_) {
        super(p_i48575_1_, p_i48575_2_);
    }
//defered work queue for registerAttributes? idk what that means but i thouhgt id write it here
    public static AttributeModifierMap.MutableAttribute setCustomAttributes() {
        return MothmanEntity.registerAttributes()
                .createMutableAttribute(Attributes.MAX_HEALTH, 12.0D)
                .createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.5D);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(1, new SwimGoal(this));
        this.goalSelector.addGoal(3, new LookAtWithoutMovingGoal(this, ));
        this.goalSelector.addGoal(2, new PanicGoal(this, 1.2));
        this.goalSelector.addGoal(4, new FleeSunGoal())
        this.goalSelector.addGoal(5, new BreakBlockGoal())
        this.goalSelector.addGoal(6, new AvoidEntityGoal<>()) //player
        this.goalSelector.addGoal(7, new AvoidEntityGoal<>()) //cats?

    }
}

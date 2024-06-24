package net.rulft.carnivalconfections.effect;

import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import net.rulft.carnivalconfections.init.ModTags;

public class GhostEffect extends StatusEffect {


    protected GhostEffect(StatusEffectCategory category, int color) {
        super(category, color, ParticleTypes.SMALL_GUST);
    }

    @Override
    public boolean applyUpdateEffect(LivingEntity entity, int amplifier) {
        World world = entity.getEntityWorld();
        BlockPos pos = entity.getBlockPos();
        BlockPos belowPos = pos.down();
        BlockState blockBelow = world.getBlockState(belowPos);
        boolean shouldPhase = false;

        // Ensure the player is not falling through the ground
        if (!blockBelow.isAir() && blockBelow.isIn(ModTags.Blocks.NOT_PASSTROUGH_BLOCKS)) {
            // Check if the player is inside a block that is phaseable
            BlockState currentBlock = world.getBlockState(pos);
            if (!currentBlock.isIn(ModTags.Blocks.NOT_PASSTROUGH_BLOCKS)) {
                shouldPhase = true;
            } else {
                // Check blocks around the player horizontally
                for (Direction direction : Direction.Type.HORIZONTAL) {
                    BlockPos offsetPos = pos.offset(direction);
                    BlockState blockState = world.getBlockState(offsetPos);

                    if (!blockState.isIn(ModTags.Blocks.NOT_PASSTROUGH_BLOCKS)) {
                        shouldPhase = true;
                        break;
                    }else if(blockBelow.isIn(ModTags.Blocks.NOT_PASSTROUGH_BLOCKS)){
                        shouldPhase = false;
                    }
                }
            }
        }

        if (shouldPhase) {
            System.out.println("phasing through wall");
            entity.noClip = true;
            entity.setInvulnerable(true);
        } else {
            System.out.println("solid ground or unphaseable block");
            entity.noClip = false;
            entity.setInvulnerable(false);
        }

        return super.applyUpdateEffect(entity, amplifier);
    }

        @Override
        public boolean canApplyUpdateEffect ( int pDuration, int pAmplifier){
            return true;
        }
}

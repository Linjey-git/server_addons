package for_my_self.for_my_self.effects;

import for_my_self.for_my_self.For_my_selfMod;
import io.github.ladysnake.pal.AbilitySource;
import io.github.ladysnake.pal.Pal;
import io.github.ladysnake.pal.VanillaAbilities;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.AttributeContainer;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.player.PlayerEntity;


public class FlightEffect extends StatusEffect {
    public FlightEffect() {
        super(StatusEffectCategory.BENEFICIAL, // whether beneficial or harmful for entities
                0x66cccc); //color
    }

    // This method is called every tick to check whether it should apply the status effect or not
    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        // In our case, we just make it return true so that it applies the status effect every tick.
        return true;
    }

    public static final AbilitySource FLIGHT_EFFECT = Pal.getAbilitySource(For_my_selfMod.MOD_ID,"flight_effect");


    @Override
    public void onApplied(LivingEntity entity, AttributeContainer attributes, int amplifier) {
        if (entity instanceof PlayerEntity) {
            Pal.grantAbility((PlayerEntity) entity, VanillaAbilities.ALLOW_FLYING, FLIGHT_EFFECT);
            // equivalent to: FLIGHT_EFFECT.grantTo((PlayerEntity) entity, VanillaAbilities.ALLOW_FLYING);
        }
    }

    @Override
    public void onRemoved(LivingEntity entity, AttributeContainer attributes, int amplifier) {
        if (entity instanceof PlayerEntity) {
            Pal.revokeAbility((PlayerEntity) entity, VanillaAbilities.ALLOW_FLYING, FLIGHT_EFFECT);
            // equivalent to: FLIGHT_EFFECT.revokeFrom((PlayerEntity) entity, VanillaAbilities.ALLOW_FLYING);
        }
    }

}

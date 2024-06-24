package net.rulft.carnivalconfections.custom;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;
import net.rulft.carnivalconfections.init.ModFoodComponents;

public class Popcorn extends Item {
    private final int maxUses;

    public Popcorn(Settings settings, int maxUses) {
        super(settings.maxDamage(maxUses)); // Set the max damage to the number of uses
        this.maxUses = maxUses;
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        user.setCurrentHand(hand);
        return TypedActionResult.consume(user.getStackInHand(hand));
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        if (user instanceof PlayerEntity) {
            PlayerEntity player = (PlayerEntity) user;

            if (!player.isCreative()) {
                ((PlayerEntity) user).getHungerManager().add(ModFoodComponents.POPCORN.nutrition(), ModFoodComponents.POPCORN.saturation());
                stack.setDamage(stack.getDamage() + 1); // Increment the damage value

                // If the item is fully used, remove it from the inventory
                if (stack.getDamage() >= this.maxUses) {
                    stack.decrement(1);
                }
            }
        }

        return stack;
    }

    @Override
    public UseAction getUseAction(ItemStack stack) {
        return UseAction.EAT;
    }

    @Override
    public int getMaxUseTime(ItemStack stack, LivingEntity user) {
        return 32;
    }

    @Override
    public boolean isItemBarVisible(ItemStack stack) {
        return true; // Show the durability bar
    }

    @Override
    public int getItemBarStep(ItemStack stack) {
        return Math.round(13.0F - (float)stack.getDamage() * 13.0F / (float)this.maxUses);
    }

    @Override
    public int getItemBarColor(ItemStack stack) {
        return 0xF4D29C; // Green color for the durability bar
    }


}
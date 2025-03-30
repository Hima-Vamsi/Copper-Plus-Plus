package com.himavamsi.copper_plus_plus.item;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.world.World;


public class OxidationHandler {
    private static final int RANDOM_TICK_INTERVAL = 136;
    private static final float OXIDATION_CHANCE = 0.02844444F;

    public static void handleOxidation(ItemStack stack, Entity entity) {
        if (!(stack.getItem() instanceof OxidizableItem oxidizable)) {
            return;
        }

        if (oxidizable.getNextOxidationStage() == null || !oxidizable.shouldOxidize(stack)) {
            return;
        }

        World world = entity.getEntityWorld();
        if (world == null || world.isClient) return;

        if (world.random.nextInt(RANDOM_TICK_INTERVAL) != 0) {
            return;
        }

        if (world.random.nextFloat() < OXIDATION_CHANCE) {
            ItemStack newStack = new ItemStack(oxidizable.getNextOxidationStage());

            NbtCompound newNbt = stack.getNbt() != null ? stack.getNbt().copy() : new NbtCompound();
            newStack.setNbt(newNbt);

            if (stack.isDamageable() && newStack.isDamageable()) {
                newStack.setDamage(stack.getDamage());
            }

            if (entity instanceof PlayerEntity player) {
                int slot = player.getInventory().getSlotWithStack(stack);
                if (slot != -1) {
                    player.getInventory().setStack(slot, newStack);
                }
            }
        }
    }
}
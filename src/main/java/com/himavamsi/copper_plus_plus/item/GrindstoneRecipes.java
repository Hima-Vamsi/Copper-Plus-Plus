package com.himavamsi.copper_plus_plus.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class GrindstoneRecipes {
    public static void registerGrindstoneRecipes() {
    }

    public static ItemStack getGrindstoneResult(ItemStack input) {
        if (input.isEmpty() || input.hasEnchantments()) {
            return ItemStack.EMPTY;
        }

        Item inputItem = input.getItem();
        Identifier id = Registry.ITEM.getId(inputItem);
        String path = id.getPath();

        ItemStack result = ItemStack.EMPTY;

        if (path.startsWith("waxed_")) {
            String unwaxedPath = path.replace("waxed_", "");
            Item unwaxedItem = Registry.ITEM.get(new Identifier(id.getNamespace(), unwaxedPath));
            if (unwaxedItem != Items.AIR) {
                result = copyDurability(input, new ItemStack(unwaxedItem));
            }
        }
        else if (path.contains("oxidized")) {
            result = copyDurability(input, new ItemStack(getPreviousStage(inputItem, "oxidized", "weathered")));
        }
        else if (path.contains("weathered")) {
            result = copyDurability(input, new ItemStack(getPreviousStage(inputItem, "weathered", "exposed")));
        }
        else if (path.contains("exposed")) {
            String regularPath = path.replace("exposed_", "");
            Item regularItem = Registry.ITEM.get(new Identifier(id.getNamespace(), regularPath));
            if (regularItem != Items.AIR) {
                result = copyDurability(input, new ItemStack(regularItem));
            }
        }

        if (!result.isEmpty()) {
            NbtCompound nbt = result.getOrCreateNbt();
            nbt.putInt("OxidationTime", 0);
        }

        return result;
    }

    private static Item getPreviousStage(Item current, String currentStage, String previousStage) {
        Identifier id = Registry.ITEM.getId(current);
        String newPath = id.getPath().replace(currentStage, previousStage);
        return Registry.ITEM.get(new Identifier(id.getNamespace(), newPath));
    }

    private static ItemStack copyDurability(ItemStack source, ItemStack target) {
        if (source.isDamageable() && target.isDamageable()) {
            target.setDamage(source.getDamage());
        }
        if (source.hasNbt()) {
            NbtCompound nbt = source.getNbt().copy();
            nbt.remove("OxidationTime");
            target.setNbt(nbt);
        }
        return target;
    }
}
package com.himavamsi.copper_plus_plus.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public interface OxidizableItem {
    Item getNextOxidationStage();

    default boolean shouldOxidize(ItemStack stack) {
        return true;
    }
}
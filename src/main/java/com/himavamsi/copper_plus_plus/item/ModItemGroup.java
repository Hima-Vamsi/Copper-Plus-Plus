package com.himavamsi.copper_plus_plus.item;

import com.himavamsi.copper_plus_plus.Copper;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup COPPER = FabricItemGroupBuilder.build(
            new Identifier(Copper.MOD_ID, "copper"),
            () -> new ItemStack(Items.COPPER_BLOCK));

    public static final ItemGroup EXPOSED_COPPER = FabricItemGroupBuilder.build(
            new Identifier(Copper.MOD_ID, "exposed_copper"),
            () -> new ItemStack(Items.EXPOSED_COPPER));

    public static final ItemGroup WEATHERED_COPPER = FabricItemGroupBuilder.build(
            new Identifier(Copper.MOD_ID, "weathered_copper"),
            () -> new ItemStack(Items.WEATHERED_COPPER));

    public static final ItemGroup OXIDIZED_COPPER = FabricItemGroupBuilder.build(
            new Identifier(Copper.MOD_ID, "oxidized_copper"),
            () -> new ItemStack(Items.OXIDIZED_COPPER));
}

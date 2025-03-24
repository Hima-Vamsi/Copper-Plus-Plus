package com.himavamsi.copper_plus_plus.item;

import com.himavamsi.copper_plus_plus.Copper;
import com.himavamsi.copper_plus_plus.item.custom.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item COPPER_NUGGET = registerItem("copper_nugget", new Item(new FabricItemSettings().group(ModItemGroup.COPPER)));
    public static final Item COPPER_SWORD = registerItem("copper_sword", new SwordItem(ModToolMaterial.COPPER, 3, -2.4F, new FabricItemSettings().group(ModItemGroup.COPPER)));
    public static final Item COPPER_SHOVEL = registerItem("copper_shovel", new ShovelItem(ModToolMaterial.COPPER, 1.5F, -3.0F, new FabricItemSettings().group(ModItemGroup.COPPER)));
    public static final Item COPPER_PICKAXE = registerItem("copper_pickaxe", new ModPickaxeItem(ModToolMaterial.COPPER, 1, -2.8F, new FabricItemSettings().group(ModItemGroup.COPPER)));
    public static final Item COPPER_AXE = registerItem("copper_axe", new ModAxeItem(ModToolMaterial.COPPER, 6.0F, -3.1F, new FabricItemSettings().group(ModItemGroup.COPPER)));
    public static final Item COPPER_HOE = registerItem("copper_hoe", new ModHoeItem(ModToolMaterial.COPPER, -1, -1.0F, new FabricItemSettings().group(ModItemGroup.COPPER)));

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Copper.MOD_ID, name), item);
    }

    public static void registerModItems() {
        System.out.println("Registering Mod Items for " + Copper.MOD_ID);


    }

}

package com.himavamsi.copper_plus_plus.item;

import com.himavamsi.copper_plus_plus.Copper;
import com.himavamsi.copper_plus_plus.item.custom.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item COPPER_NUGGET = registerItem("copper_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.COPPER)));

    public static final Item OXIDIZED_COPPER_SHOVEL = registerItem("oxidized_copper_shovel",
            new OxidizableShovelItem(ModToolMaterial.COPPER, 1.5F, -3.0F,
                    new FabricItemSettings().group(ModItemGroup.OXIDIZED_COPPER),
                    null));

    public static final Item WEATHERED_COPPER_SHOVEL = registerItem("weathered_copper_shovel",
            new OxidizableShovelItem(ModToolMaterial.COPPER, 1.5F, -3.0F,
                    new FabricItemSettings().group(ModItemGroup.WEATHERED_COPPER),
                    OXIDIZED_COPPER_SHOVEL));

    public static final Item EXPOSED_COPPER_SHOVEL = registerItem("exposed_copper_shovel",
            new OxidizableShovelItem(ModToolMaterial.COPPER, 1.5F, -3.0F,
                    new FabricItemSettings().group(ModItemGroup.EXPOSED_COPPER),
                    WEATHERED_COPPER_SHOVEL));

    public static final Item COPPER_SHOVEL = registerItem("copper_shovel",
            new OxidizableShovelItem(ModToolMaterial.COPPER, 1.5F, -3.0F,
                    new FabricItemSettings().group(ModItemGroup.COPPER),
                    EXPOSED_COPPER_SHOVEL));

    public static final Item WAXED_OXIDIZED_COPPER_SHOVEL = registerItem("waxed_oxidized_copper_shovel",
            new OxidizableShovelItem(ModToolMaterial.COPPER, 1.5F, -3.0F,
                    new FabricItemSettings().group(ModItemGroup.OXIDIZED_COPPER),
                    null));

    public static final Item WAXED_WEATHERED_COPPER_SHOVEL = registerItem("waxed_weathered_copper_shovel",
            new OxidizableShovelItem(ModToolMaterial.COPPER, 1.5F, -3.0F,
                    new FabricItemSettings().group(ModItemGroup.WEATHERED_COPPER),
                    null));

    public static final Item WAXED_EXPOSED_COPPER_SHOVEL = registerItem("waxed_exposed_copper_shovel",
            new OxidizableShovelItem(ModToolMaterial.COPPER, 1.5F, -3.0F,
                    new FabricItemSettings().group(ModItemGroup.EXPOSED_COPPER),
                    null));

    public static final Item WAXED_COPPER_SHOVEL = registerItem("waxed_copper_shovel",
            new OxidizableShovelItem(ModToolMaterial.COPPER, 1.5F, -3.0F,
                    new FabricItemSettings().group(ModItemGroup.COPPER),
                    null));

    public static final Item OXIDIZED_COPPER_PICKAXE = registerItem("oxidized_copper_pickaxe",
            new OxidizablePickaxeItem(ModToolMaterial.COPPER, 1, -2.8F,
                    new FabricItemSettings().group(ModItemGroup.OXIDIZED_COPPER),
                    null));

    public static final Item WEATHERED_COPPER_PICKAXE = registerItem("weathered_copper_pickaxe",
            new OxidizablePickaxeItem(ModToolMaterial.COPPER, 1, -2.8F,
                    new FabricItemSettings().group(ModItemGroup.WEATHERED_COPPER),
                    OXIDIZED_COPPER_PICKAXE));

    public static final Item EXPOSED_COPPER_PICKAXE = registerItem("exposed_copper_pickaxe",
            new OxidizablePickaxeItem(ModToolMaterial.COPPER, 1, -2.8F,
                    new FabricItemSettings().group(ModItemGroup.EXPOSED_COPPER),
                    WEATHERED_COPPER_PICKAXE));

    public static final Item COPPER_PICKAXE = registerItem("copper_pickaxe",
            new OxidizablePickaxeItem(ModToolMaterial.COPPER, 1, -2.8F,
                    new FabricItemSettings().group(ModItemGroup.COPPER),
                    EXPOSED_COPPER_PICKAXE));

    public static final Item WAXED_OXIDIZED_COPPER_PICKAXE = registerItem("waxed_oxidized_copper_pickaxe",
            new OxidizablePickaxeItem(ModToolMaterial.COPPER, 1, -2.8F,
                    new FabricItemSettings().group(ModItemGroup.OXIDIZED_COPPER),
                    null));

    public static final Item WAXED_WEATHERED_COPPER_PICKAXE = registerItem("waxed_weathered_copper_pickaxe",
            new OxidizablePickaxeItem(ModToolMaterial.COPPER, 1, -2.8F,
                    new FabricItemSettings().group(ModItemGroup.WEATHERED_COPPER),
                    null));

    public static final Item WAXED_EXPOSED_COPPER_PICKAXE = registerItem("waxed_exposed_copper_pickaxe",
            new OxidizablePickaxeItem(ModToolMaterial.COPPER, 1, -2.8F,
                    new FabricItemSettings().group(ModItemGroup.EXPOSED_COPPER),
                    null));

    public static final Item WAXED_COPPER_PICKAXE = registerItem("waxed_copper_pickaxe",
            new OxidizablePickaxeItem(ModToolMaterial.COPPER, 1, -2.8F,
                    new FabricItemSettings().group(ModItemGroup.COPPER),
                    null));

    public static final Item OXIDIZED_COPPER_AXE = registerItem("oxidized_copper_axe",
            new OxidizableAxeItem(ModToolMaterial.COPPER, 6.0F, -3.1F,
                    new FabricItemSettings().group(ModItemGroup.OXIDIZED_COPPER),
                    null));

    public static final Item WEATHERED_COPPER_AXE = registerItem("weathered_copper_axe",
            new OxidizableAxeItem(ModToolMaterial.COPPER, 6.0F, -3.1F,
                    new FabricItemSettings().group(ModItemGroup.WEATHERED_COPPER),
                    OXIDIZED_COPPER_AXE));

    public static final Item EXPOSED_COPPER_AXE = registerItem("exposed_copper_axe",
            new OxidizableAxeItem(ModToolMaterial.COPPER, 6.0F, -3.1F,
                    new FabricItemSettings().group(ModItemGroup.EXPOSED_COPPER),
                    WEATHERED_COPPER_AXE));

    public static final Item COPPER_AXE = registerItem("copper_axe",
            new OxidizableAxeItem(ModToolMaterial.COPPER, 6.0F, -3.1F,
                    new FabricItemSettings().group(ModItemGroup.COPPER),
                    EXPOSED_COPPER_AXE));

    public static final Item WAXED_OXIDIZED_COPPER_AXE = registerItem("waxed_oxidized_copper_axe",
            new OxidizableAxeItem(ModToolMaterial.COPPER, 6.0F, -3.1F,
                    new FabricItemSettings().group(ModItemGroup.OXIDIZED_COPPER),
                    null));

    public static final Item WAXED_WEATHERED_COPPER_AXE = registerItem("waxed_weathered_copper_axe",
            new OxidizableAxeItem(ModToolMaterial.COPPER, 6.0F, -3.1F,
                    new FabricItemSettings().group(ModItemGroup.WEATHERED_COPPER),
                    null));

    public static final Item WAXED_EXPOSED_COPPER_AXE = registerItem("waxed_exposed_copper_axe",
            new OxidizableAxeItem(ModToolMaterial.COPPER, 6.0F, -3.1F,
                    new FabricItemSettings().group(ModItemGroup.EXPOSED_COPPER),
                    null));

    public static final Item WAXED_COPPER_AXE = registerItem("waxed_copper_axe",
            new OxidizableAxeItem(ModToolMaterial.COPPER, 6.0F, -3.1F,
                    new FabricItemSettings().group(ModItemGroup.COPPER),
                    null));

    public static final Item OXIDIZED_COPPER_HOE = registerItem("oxidized_copper_hoe",
            new OxidizableHoeItem(ModToolMaterial.COPPER, -1, -1.0F,
                    new FabricItemSettings().group(ModItemGroup.OXIDIZED_COPPER),
                    null));

    public static final Item WEATHERED_COPPER_HOE = registerItem("weathered_copper_hoe",
            new OxidizableHoeItem(ModToolMaterial.COPPER, -1, -1.0F,
                    new FabricItemSettings().group(ModItemGroup.WEATHERED_COPPER),
                    OXIDIZED_COPPER_HOE));

    public static final Item EXPOSED_COPPER_HOE = registerItem("exposed_copper_hoe",
            new OxidizableHoeItem(ModToolMaterial.COPPER, -1, -1.0F,
                    new FabricItemSettings().group(ModItemGroup.EXPOSED_COPPER),
                    WEATHERED_COPPER_HOE));

    public static final Item COPPER_HOE = registerItem("copper_hoe",
            new OxidizableHoeItem(ModToolMaterial.COPPER, -1, -1.0F,
                    new FabricItemSettings().group(ModItemGroup.COPPER),
                    EXPOSED_COPPER_HOE));

    public static final Item WAXED_OXIDIZED_COPPER_HOE = registerItem("waxed_oxidized_copper_hoe",
            new OxidizableHoeItem(ModToolMaterial.COPPER, -1, -1.0F,
                    new FabricItemSettings().group(ModItemGroup.OXIDIZED_COPPER),
                    null));

    public static final Item WAXED_WEATHERED_COPPER_HOE = registerItem("waxed_weathered_copper_hoe",
            new OxidizableHoeItem(ModToolMaterial.COPPER, -1, -1.0F,
                    new FabricItemSettings().group(ModItemGroup.WEATHERED_COPPER),
                    null));

    public static final Item WAXED_EXPOSED_COPPER_HOE = registerItem("waxed_exposed_copper_hoe",
            new OxidizableHoeItem(ModToolMaterial.COPPER, -1, -1.0F,
                    new FabricItemSettings().group(ModItemGroup.EXPOSED_COPPER),
                    null));

    public static final Item WAXED_COPPER_HOE = registerItem("waxed_copper_hoe",
            new OxidizableHoeItem(ModToolMaterial.COPPER, -1, -1.0F,
                    new FabricItemSettings().group(ModItemGroup.COPPER),
                    null));

    public static final Item OXIDIZED_COPPER_SWORD = registerItem("oxidized_copper_sword",
            new OxidizableSwordItem(ModToolMaterial.COPPER, 3, -2.4F,
                    new FabricItemSettings().group(ModItemGroup.OXIDIZED_COPPER),
                    null));

    public static final Item WEATHERED_COPPER_SWORD = registerItem("weathered_copper_sword",
            new OxidizableSwordItem(ModToolMaterial.COPPER, 3, -2.4F,
                    new FabricItemSettings().group(ModItemGroup.WEATHERED_COPPER),
                    OXIDIZED_COPPER_SWORD));

    public static final Item EXPOSED_COPPER_SWORD = registerItem("exposed_copper_sword",
            new OxidizableSwordItem(ModToolMaterial.COPPER, 3, -2.4F,
                    new FabricItemSettings().group(ModItemGroup.EXPOSED_COPPER),
                    WEATHERED_COPPER_SWORD));

    public static final Item COPPER_SWORD = registerItem("copper_sword",
            new OxidizableSwordItem(ModToolMaterial.COPPER, 3, -2.4F,
                    new FabricItemSettings().group(ModItemGroup.COPPER),
                    EXPOSED_COPPER_SWORD));

    public static final Item WAXED_OXIDIZED_COPPER_SWORD = registerItem("waxed_oxidized_copper_sword",
            new OxidizableSwordItem(ModToolMaterial.COPPER, 3, -2.4F,
                    new FabricItemSettings().group(ModItemGroup.OXIDIZED_COPPER),
                    null));

    public static final Item WAXED_WEATHERED_COPPER_SWORD = registerItem("waxed_weathered_copper_sword",
            new OxidizableSwordItem(ModToolMaterial.COPPER, 3, -2.4F,
                    new FabricItemSettings().group(ModItemGroup.WEATHERED_COPPER),
                    null));

    public static final Item WAXED_EXPOSED_COPPER_SWORD = registerItem("waxed_exposed_copper_sword",
            new OxidizableSwordItem(ModToolMaterial.COPPER, 3, -2.4F,
                    new FabricItemSettings().group(ModItemGroup.EXPOSED_COPPER),
                    null));

    public static final Item WAXED_COPPER_SWORD = registerItem("waxed_copper_sword",
            new OxidizableSwordItem(ModToolMaterial.COPPER, 3, -2.4F,
                    new FabricItemSettings().group(ModItemGroup.COPPER),
                    null));

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Copper.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Copper.LOGGER.info("Registering Mod Items for " + Copper.MOD_ID);
    }
}
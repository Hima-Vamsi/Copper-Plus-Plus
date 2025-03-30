package com.himavamsi.copper_plus_plus.item.custom;

import com.himavamsi.copper_plus_plus.item.OxidationHandler;
import com.himavamsi.copper_plus_plus.item.OxidizableItem;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class OxidizableShovelItem extends ShovelItem implements OxidizableItem, FabricItem {
    private final Item nextStage;

    public OxidizableShovelItem(ToolMaterial material, float attackDamage, float attackSpeed,
                                Settings settings, Item nextStage) {
        super(material, attackDamage, attackSpeed, settings);
        this.nextStage = nextStage;
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (!world.isClient && entity instanceof PlayerEntity) {
            OxidationHandler.handleOxidation(stack, entity);
        }
    }

    @Override
    public Item getNextOxidationStage() {
        return nextStage;
    }

    @Override
    public boolean allowNbtUpdateAnimation(PlayerEntity player, Hand hand, ItemStack oldStack, ItemStack newStack) {
        return false;
    }

    @Override
    public boolean allowContinuingBlockBreaking(PlayerEntity player, ItemStack oldStack, ItemStack newStack) {
        return true;
    }
}
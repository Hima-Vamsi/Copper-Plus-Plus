package com.himavamsi.copper_plus_plus.mixin;

import com.himavamsi.copper_plus_plus.item.GrindstoneRecipes;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.GrindstoneScreenHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(GrindstoneScreenHandler.class)
public abstract class GrindstoneScreenHandlerMixin {
    @Inject(method = "updateResult", at = @At("HEAD"), cancellable = true)
    private void onUpdateResult(CallbackInfo ci) {
        GrindstoneScreenHandler handler = (GrindstoneScreenHandler) (Object) this;
        ItemStack topStack = handler.getSlot(0).getStack();
        ItemStack bottomStack = handler.getSlot(1).getStack();

        if (!topStack.isEmpty() && !bottomStack.isEmpty()) {
            return;
        }

        ItemStack input = !topStack.isEmpty() ? topStack : bottomStack;
        if (!input.isEmpty() && !input.hasEnchantments()) {
            ItemStack result = GrindstoneRecipes.getGrindstoneResult(input);
            if (!result.isEmpty()) {
                handler.getSlot(2).setStack(result);
                ci.cancel();
            }
        }
    }
}
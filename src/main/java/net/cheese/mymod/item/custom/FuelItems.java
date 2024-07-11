package net.cheese.mymod.item.custom;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import org.jetbrains.annotations.Nullable;

public class FuelItems extends Item {
    private int BurnTime = 0;

    public FuelItems(Properties pProperties, int BurnTime) {
        super(pProperties);
        this.BurnTime = BurnTime;
    }

    @Override
    public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
        return this.BurnTime;
    }
}

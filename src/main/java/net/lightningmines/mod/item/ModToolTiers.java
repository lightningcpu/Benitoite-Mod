package net.lightningmines.mod.item;

import net.lightningmines.mod.util.ModTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModToolTiers {
    public static final Tier BENITOITE = new ForgeTier(
            3000,
            12.0F,
            6.0F,
            15,
            ModTags.Blocks.NEEDS_BENITOITE_TOOL, () -> Ingredient.of(ModItems.BENITOITE.get()),
            ModTags.Blocks.INCORRECT_FOR_BENITOITE_TOOL
    );
}

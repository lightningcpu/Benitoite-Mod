package net.lightningmines.mod.item;

import net.lightningmines.mod.BenitoiteMod;
import net.lightningmines.mod.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier BENITOITE = TierSortingRegistry.registerTier(
            new ForgeTier(5, 3000, 12.0F, 7.0F, 15,
                    ModTags.Blocks.NEEDS_BENITOITE_TOOL, () -> Ingredient.of(ModItems.BENITOITE.get())),
            new ResourceLocation(BenitoiteMod.MOD_ID, "benitoite"), List.of(Tiers.NETHERITE), List.of());

}
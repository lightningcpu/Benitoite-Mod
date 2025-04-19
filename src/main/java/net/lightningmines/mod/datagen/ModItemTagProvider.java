package net.lightningmines.mod.datagen;


import net.lightningmines.mod.BenitoiteMod;
import net.lightningmines.mod.item.ModItems;
import net.lightningmines.mod.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> completableFuture,
                              CompletableFuture<TagLookup<Block>> lookupCompletableFuture, @Nullable ExistingFileHelper existingFileHelper) {
        super(packOutput, completableFuture, lookupCompletableFuture, BenitoiteMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        tag(ItemTags.BEACON_PAYMENT_ITEMS)
                .add(ModItems.BENITOITE.get());

        tag(ModTags.Items.BENITOITE_TOOLS)
                .add(ModItems.BENITOITE_SWORD.get())
                .add(ModItems.BENITOITE_PICKAXE.get())
                .add(ModItems.BENITOITE_AXE.get())
                .add(ModItems.BENITOITE_SHOVEL.get())
                .add(ModItems.BENITOITE_HOE.get())
                .add(ModItems.BENITOITE_HAMMER.get());

        tag(ItemTags.SWORDS).add(ModItems.BENITOITE_SWORD.get());
        tag(ItemTags.PICKAXES).add(ModItems.BENITOITE_PICKAXE.get()).add(ModItems.BENITOITE_HAMMER.get());
        tag(ItemTags.AXES).add(ModItems.BENITOITE_AXE.get());
        tag(ItemTags.SHOVELS).add(ModItems.BENITOITE_SHOVEL.get());
        tag(ItemTags.HOES).add(ModItems.BENITOITE_HOE.get());

        tag(ModTags.Items.BENITOITE_ARMOR)
                .add(ModItems.BENITOITE_HORSE_ARMOR.get());

        tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.BENITOITE_HELMET.get())
                .add(ModItems.BENITOITE_CHESTPLATE.get())
                .add(ModItems.BENITOITE_LEGGINGS.get())
                .add(ModItems.BENITOITE_BOOTS.get());

        tag(ItemTags.HEAD_ARMOR_ENCHANTABLE).add(ModItems.BENITOITE_HELMET.get());
        tag(ItemTags.CHEST_ARMOR_ENCHANTABLE).add(ModItems.BENITOITE_CHESTPLATE.get());
        tag(ItemTags.LEG_ARMOR_ENCHANTABLE).add(ModItems.BENITOITE_LEGGINGS.get());
        tag(ItemTags.FOOT_ARMOR_ENCHANTABLE).add(ModItems.BENITOITE_BOOTS.get());

    }
}

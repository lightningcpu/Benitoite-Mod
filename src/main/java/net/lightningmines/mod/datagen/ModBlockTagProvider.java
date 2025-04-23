package net.lightningmines.mod.datagen;

import net.lightningmines.mod.BenitoiteMod;
import net.lightningmines.mod.block.ModBlocks;
import net.lightningmines.mod.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, BenitoiteMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        tag(BlockTags.BEACON_BASE_BLOCKS)
                .add(ModBlocks.BENITOITE_BLOCK.get());

        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.BENITOITE_BLOCK.get())
                .add(ModBlocks.RAW_BENITOITE_BLOCK.get())
                .add(ModBlocks.BENITOITE_ORE.get());

        tag(Tags.Blocks.NEEDS_NETHERITE_TOOL)
                .add(ModBlocks.BENITOITE_BLOCK.get())
                .add(ModBlocks.RAW_BENITOITE_BLOCK.get())
                .add(ModBlocks.BENITOITE_ORE.get());

        tag(ModTags.Blocks.INCORRECT_FOR_BENITOITE_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_NETHERITE_TOOL);
//                .remove(ModTags.Blocks.NEEDS_BENITOITE_TOOL);
    }
}

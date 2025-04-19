package net.lightningmines.mod.datagen;

import net.lightningmines.mod.BenitoiteMod;
import net.lightningmines.mod.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, BenitoiteMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.BENITOITE_BLOCK);
        blockWithItem(ModBlocks.RAW_BENITOITE_BLOCK);

        blockWithItem(ModBlocks.BENITOITE_ORE);
        blockWithItem(ModBlocks.BENITOITE_DEEPSLATE_ORE);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}

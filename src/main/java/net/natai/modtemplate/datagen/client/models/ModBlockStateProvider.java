package net.natai.modtemplate.datagen.client.models;

import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(DataGenerator gen, String modId, ExistingFileHelper existingFileHelper) {
        super(gen, modId, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

    }

    private void simpleBlockWithItem(Block block) {
        ModelFile model = cubeAll(block);
        simpleBlock(block);
        simpleBlockItem(block, model);
    }
}

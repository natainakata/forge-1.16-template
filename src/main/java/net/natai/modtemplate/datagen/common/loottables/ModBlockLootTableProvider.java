package net.natai.modtemplate.datagen.common.loottables;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.LootTableProvider;
import net.minecraft.data.loot.BlockLootTables;
import net.minecraft.loot.LootParameterSet;
import net.minecraft.loot.LootParameterSets;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.ValidationTracker;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

@ParametersAreNonnullByDefault
@MethodsReturnNonnullByDefault
public class ModBlockLootTableProvider extends LootTableProvider {
    public ModBlockLootTableProvider(DataGenerator gen) {
        super(gen);
    }

    @Override
    protected List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, LootTable.Builder>>>, LootParameterSet>> getTables() {
        return ImmutableList.of(Pair.of(ModBlockLootTables::new, LootParameterSets.BLOCK));
    }

    @Override
    protected void validate(Map<ResourceLocation, LootTable> map, ValidationTracker validationtracker) {
    }

    private static class ModBlockLootTables extends BlockLootTables {
        @Override
        protected Iterable<Block> getKnownBlocks() {
            // return xxx.Blocks.getEntries().stream().map(RegistryObject::get).collect(Collectors.toList());
            return super.getKnownBlocks();
        }

        @Override
        protected void addTables() {
            // registerDropSelfLootTable();
        }
    }
}

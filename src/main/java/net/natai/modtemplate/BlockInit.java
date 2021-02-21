package net.natai.modtemplate;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Collection;

public class BlockInit {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ModTemplate.MOD_ID);

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

    public static Collection<RegistryObject<Block>> getEntries() {
        return BLOCKS.getEntries();
    }
}

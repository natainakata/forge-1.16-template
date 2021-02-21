package net.natai.modtemplate;

import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.natai.modtemplate.datagen.common.loottables.ModBlockLootTableProvider;

public class ItemInit {
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ModTemplate.MOD_ID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

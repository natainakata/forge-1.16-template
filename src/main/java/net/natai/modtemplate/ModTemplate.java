package net.natai.modtemplate;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.*;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.natai.modtemplate.datagen.client.lang.ModEnUsLanguageProvider;
import net.natai.modtemplate.datagen.client.lang.ModJaJpLanguageProvider;
import net.natai.modtemplate.datagen.client.models.ModBlockStateProvider;
import net.natai.modtemplate.datagen.client.models.ModItemModelProvider;
import net.natai.modtemplate.datagen.common.loottables.ModBlockLootTableProvider;
import net.natai.modtemplate.datagen.common.recipes.ModCraftingTableRecipeProvider;
import net.natai.modtemplate.datagen.common.recipes.ModFurnaceRecipeProvider;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(ModTemplate.MOD_ID)
public class ModTemplate {
    public static final String MOD_ID = "modtemplate";
    private static final Logger LOGGER = LogManager.getLogger();

    public ModTemplate() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ItemInit.register(modEventBus);
        BlockInit.register(modEventBus);
        modEventBus.addListener(this::setup);
        modEventBus.addListener(this::enqueueIMC);
        modEventBus.addListener(this::processIMC);
        modEventBus.addListener(this::doClientStuff);
        modEventBus.addListener(this::registerProviders);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void registerProviders(GatherDataEvent event) {
        DataGenerator gen = event.getGenerator();
        if (event.includeClient()) {
            gen.addProvider(new ModBlockStateProvider(gen, MOD_ID, event.getExistingFileHelper()));
            gen.addProvider(new ModItemModelProvider(gen, MOD_ID, event.getExistingFileHelper()));
            gen.addProvider(new ModEnUsLanguageProvider(gen, MOD_ID));
            gen.addProvider(new ModJaJpLanguageProvider(gen, MOD_ID));
        }
        if (event.includeServer()) {
            gen.addProvider(new ModCraftingTableRecipeProvider(gen));
            gen.addProvider(new ModFurnaceRecipeProvider(gen));
            gen.addProvider(new ModBlockLootTableProvider(gen));
        }
    }

    private void setup(final FMLCommonSetupEvent event) {
        LOGGER.info("SETUP START");

        LOGGER.info("SETUP END");
    }

    private void doClientStuff(final FMLClientSetupEvent event) {

    }

    private void enqueueIMC(final InterModEnqueueEvent event) {

    }

    private void processIMC(final InterModProcessEvent event) {

    }

    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
        LOGGER.info("server starting");
    }

}

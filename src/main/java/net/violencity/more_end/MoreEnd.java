package net.violencity.more_end;

import com.mojang.logging.LogUtils;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;
import net.violencity.more_end.block.ModBlocks;
import net.violencity.more_end.item.ModItems;
import net.violencity.more_end.world.feature.ModConfiguredFeatures;
import net.violencity.more_end.world.feature.ModPlacedFeatures;
import org.slf4j.Logger;
import net.minecraft.world.level.biome.Biome;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(MoreEnd.MOD_ID)
public class MoreEnd {
    public static final String MOD_ID = "more_end";
    private static final Logger LOGGER = LogUtils.getLogger();

    public MoreEnd()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        ModConfiguredFeatures.register(modEventBus);
        ModPlacedFeatures.register(modEventBus);

        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);
        //ForgeRegistries.BLOCKS.getKey(Blocks.ANCIENT_DEBRIS);   Access vanilla blocks
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        // Some common setup code
        LOGGER.info("HELLO FROM COMMON SETUP");
        LOGGER.info("HI LOL >> {}", ForgeRegistries.BLOCKS.getKey(Blocks.ANCIENT_DEBRIS));
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
        }
    }
}

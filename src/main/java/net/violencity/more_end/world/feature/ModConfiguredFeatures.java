package net.violencity.more_end.world.feature;

import com.google.common.base.Suppliers;
import net.minecraft.core.Registry;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.violencity.more_end.MoreEnd;
import net.violencity.more_end.block.ModBlocks;
import org.lwjgl.system.SharedLibrary;

import java.util.List;
import java.util.function.Supplier;

public class ModConfiguredFeatures {

    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES =
            DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, MoreEnd.MOD_ID);

    public static final Supplier<List<OreConfiguration.TargetBlockState>> END_ORES =
            Suppliers.memoize(() -> List.of(OreConfiguration.target(
                    new BlockMatchTest(Blocks.END_STONE),
                    ModBlocks.ENDERITE_ORE.get().defaultBlockState()) ));

    public static final RegistryObject<ConfiguredFeature<?, ?>> ENDERITE_ORE = CONFIGURED_FEATURES.register(
            "enderite_ore", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(END_ORES.get()
            , 7)));


    public static void register(IEventBus eventbus) {
        CONFIGURED_FEATURES.register(eventbus);
    }

}

package net.violencity.more_end.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.violencity.more_end.MoreEnd;
import net.violencity.more_end.block.wood.EndWoodType;
import net.violencity.more_end.item.ModCreativeModeTab;
import net.violencity.more_end.item.ModItems;
import org.checkerframework.checker.units.qual.A;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, MoreEnd.MOD_ID);


    public static final RegistryObject<Block> BLOCK_OF_RAW_ENDERITE = registerBlock(
            "block_of_raw_enderite", () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.MORE_END);

    public static final RegistryObject<Block> BLOCK_OF_ENDERITE = registerBlock(
            "block_of_enderite", () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.MORE_END);

    public static final RegistryObject<Block> ENDERITE_ORE = registerBlock(
            "enderite_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(20f).requiresCorrectToolForDrops(), UniformInt.of(3,7)), ModCreativeModeTab.MORE_END);

    public static final RegistryObject<Block> CURSED_LOGS = registerBlock(
            "cursed_logs", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f)), ModCreativeModeTab.MORE_END);

    public static final RegistryObject<Block> CURSED_PLANKS = registerBlock(
            "cursed_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f)), ModCreativeModeTab.MORE_END);

    public static final RegistryObject<Block> CURSED_WOOD= registerBlock(
            "cursed_wood", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f)), ModCreativeModeTab.MORE_END);

    public static final RegistryObject<Block> AMETHYST_LOGS = registerBlock(
            "amethyst_logs", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f)), ModCreativeModeTab.MORE_END);

    public static final RegistryObject<Block> AMETHYST_PLANKS = registerBlock(
            "amethyst_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f)), ModCreativeModeTab.MORE_END);

    public static final RegistryObject<Block> AMETHYST_WOOD = registerBlock(
            "amethyst_wood", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f)), ModCreativeModeTab.MORE_END);

    public static final RegistryObject<Block> AMETHYST_BUSH = registerBlock(
            "amethyst_bush", () -> new Block(BlockBehaviour.Properties.of(Material.LEAVES)
                    .strength(1f).requiresCorrectToolForDrops()), ModCreativeModeTab.MORE_END);

    public static final RegistryObject<Block> AMETHYST_LEAVES = registerBlock(
            "amethyst_leaves", () -> new Block(BlockBehaviour.Properties.of(Material.LEAVES)
                    .strength(1f).requiresCorrectToolForDrops()), ModCreativeModeTab.MORE_END);

    public static final RegistryObject<Block> AMETHYST_DYNECIUM = registerBlock(
            "amethyst_dynecium", () -> new Block(BlockBehaviour.Properties.of(Material.GRASS)
                    .strength(2f)), ModCreativeModeTab.MORE_END);

    public static final RegistryObject<Block> AMETHYST_ROOTED_DYNECIUM = registerBlock(
            "amethyst_rooted_dynecium", () -> new Block(BlockBehaviour.Properties.of(Material.DIRT)
                    .strength(2f)), ModCreativeModeTab.MORE_END);

    public static final RegistryObject<Block> AMETHYST_MOSS = registerBlock(
            "amethyst_moss", () -> new Block(BlockBehaviour.Properties.of(Material.MOSS)
                    .strength(2f)), ModCreativeModeTab.MORE_END);

    public static final RegistryObject<Block> BLOCK_OF_ENDIUM = registerBlock(
            "block_of_endium", () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.MORE_END);


    /*



    NEEDS JSON FILES:

    */


    public static final RegistryObject<Block> ADESTINE_WOOD = registerBlock(
            "adestine_wood", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f)), ModCreativeModeTab.MORE_END);

    public static final RegistryObject<Block> ADESTINE_PLANKS = registerBlock(
            "adestine_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f)), ModCreativeModeTab.MORE_END);

    public static final RegistryObject<Block> ADESTINE_LOGS = registerBlock(
            "adestine_logs", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f)), ModCreativeModeTab.MORE_END);

    public static final RegistryObject<Block> ADESTINE_LEAVES = registerBlock(
            "adestine_leaves", () -> new LeavesBlock(BlockBehaviour.Properties.of(Material.LEAVES)
                    .strength(2f)), ModCreativeModeTab.MORE_END);

    public static final RegistryObject<Block> ADESTINE_STAIRS = registerBlock(
            "adestine_stairs", () -> new StairBlock((Supplier<BlockState>) ModBlocks.ADESTINE_PLANKS.get(), BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f)), ModCreativeModeTab.MORE_END);

    public static final RegistryObject<Block> ADESTINE_TRAPDOOR = registerBlock(
            "adestine_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f)), ModCreativeModeTab.MORE_END);

    public static final RegistryObject<Block> ADESTINE_DOOR = registerBlock(
            "adestine_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f)), ModCreativeModeTab.MORE_END);

    public static final RegistryObject<Block> ADESTINE_FENCE = registerBlock(
            "adestine_fence", () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f)), ModCreativeModeTab.MORE_END);

    public static final RegistryObject<Block> ADESTINE_FENCE_GATE = registerBlock(
            "adestine_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f)), ModCreativeModeTab.MORE_END);

    public static final RegistryObject<Block> ADESTINE_SIGN = registerBlock(
            "adestine_sign", () -> new SignBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f), EndWoodType.ADESTINE) {
                @Override
                public BlockState updateShape(BlockState p_56285_, Direction p_56286_, BlockState p_56287_, LevelAccessor p_56288_, BlockPos p_56289_, BlockPos p_56290_) {
                    return super.updateShape(p_56285_, p_56286_, p_56287_, p_56288_, p_56289_, p_56290_);
                }
            }, ModCreativeModeTab.MORE_END);

    public static final RegistryObject<Block> ADESTINE_BUTTON = registerBlock(
            "adestine_button", () -> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f)), ModCreativeModeTab.MORE_END);

    public static final RegistryObject<Block> ADESTINE_PRESSURE_PLATE = registerBlock(
            "adestine_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f)), ModCreativeModeTab.MORE_END);



    public static final RegistryObject<Block> YOSMITE_WOOD = registerBlock(
            "yosmite_wood", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f)), ModCreativeModeTab.MORE_END);

    public static final RegistryObject<Block> YOSMITE_PLANKS = registerBlock(
            "yosmite_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f)), ModCreativeModeTab.MORE_END);

    public static final RegistryObject<Block> YOSMITE_LOGS = registerBlock(
            "yosmite_logs", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f)), ModCreativeModeTab.MORE_END);

    public static final RegistryObject<Block> YOSMITE_LEAVES = registerBlock(
            "yosmite_leaves", () -> new LeavesBlock(BlockBehaviour.Properties.of(Material.LEAVES)
                    .strength(2f)), ModCreativeModeTab.MORE_END);

    public static final RegistryObject<Block> YOSMITE_STAIRS = registerBlock(
            "yosmite_stairs", () -> new StairBlock((Supplier<BlockState>) ModBlocks.YOSMITE_PLANKS.get(), BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f)), ModCreativeModeTab.MORE_END);

    public static final RegistryObject<Block> YOSMITE_TRAPDOOR = registerBlock(
            "yosmite_trapdoor", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f)), ModCreativeModeTab.MORE_END);

    public static final RegistryObject<Block> YOSMITE_DOOR = registerBlock(
            "yosmite_door", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f)), ModCreativeModeTab.MORE_END);

    public static final RegistryObject<Block> YOSMITE_FENCE = registerBlock(
            "yosmite_fence", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f)), ModCreativeModeTab.MORE_END);

    public static final RegistryObject<Block> YOSMITE_FENCE_GATE = registerBlock(
            "yosmite_fence_gate", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f)), ModCreativeModeTab.MORE_END);

    public static final RegistryObject<Block> YOSMITE_SIGN = registerBlock(
            "yosmite_sign", () -> new SignBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f), EndWoodType.YOSMITE) {
                @Override
                public BlockState updateShape(BlockState p_56285_, Direction p_56286_, BlockState p_56287_, LevelAccessor p_56288_, BlockPos p_56289_, BlockPos p_56290_) {
                    return super.updateShape(p_56285_, p_56286_, p_56287_, p_56288_, p_56289_, p_56290_);
                }
            }, ModCreativeModeTab.MORE_END);

    public static final RegistryObject<Block> YOSMITE_BUTTON = registerBlock(
            "yosmite_button", () -> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f)), ModCreativeModeTab.MORE_END);

    public static final RegistryObject<Block> YOSMITE_PRESSURE_PLATE = registerBlock(
            "yosmite_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f)), ModCreativeModeTab.MORE_END);



    public static final RegistryObject<Block> SERDIC_WOOD = registerBlock(
            "serdic_wood", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f)), ModCreativeModeTab.MORE_END);

    public static final RegistryObject<Block> SERDIC_PLANKS = registerBlock(
            "serdic_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f)), ModCreativeModeTab.MORE_END);

    public static final RegistryObject<Block> SERDIC_LOGS = registerBlock(
            "serdic_logs", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f)), ModCreativeModeTab.MORE_END);

    public static final RegistryObject<Block> SERDIC_LEAVES = registerBlock(
            "serdic_leaves", () -> new LeavesBlock(BlockBehaviour.Properties.of(Material.LEAVES)
                    .strength(2f)), ModCreativeModeTab.MORE_END);

    public static final RegistryObject<Block> SERDIC_STAIRS = registerBlock(
            "serdic_stairs", () -> new StairBlock((Supplier<BlockState>) ModBlocks.SERDIC_PLANKS.get(), BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f)), ModCreativeModeTab.MORE_END);

    public static final RegistryObject<Block> SERDIC_TRAPDOOR = registerBlock(
            "serdic_trapdoor", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f)), ModCreativeModeTab.MORE_END);

    public static final RegistryObject<Block> SERDIC_DOOR = registerBlock(
            "serdic_door", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f)), ModCreativeModeTab.MORE_END);

    public static final RegistryObject<Block> SERDIC_FENCE = registerBlock(
            "serdic_fence", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f)), ModCreativeModeTab.MORE_END);

    public static final RegistryObject<Block> SERDIC_FENCE_GATE = registerBlock(
            "serdic_fence_gate", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f)), ModCreativeModeTab.MORE_END);

    public static final RegistryObject<Block> SERDIC_SIGN = registerBlock(
            "serdic_sign", () -> new SignBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f), EndWoodType.SERDIC) {
                @Override
                public BlockState updateShape(BlockState p_56285_, Direction p_56286_, BlockState p_56287_, LevelAccessor p_56288_, BlockPos p_56289_, BlockPos p_56290_) {
                    return super.updateShape(p_56285_, p_56286_, p_56287_, p_56288_, p_56289_, p_56290_);
                }
            }, ModCreativeModeTab.MORE_END);

    public static final RegistryObject<Block> SERDIC_BUTTON = registerBlock(
            "serdic_button", () -> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f)), ModCreativeModeTab.MORE_END);

    public static final RegistryObject<Block> SERDIC_PRESSURE_PLATE = registerBlock(
            "serdic_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f)), ModCreativeModeTab.MORE_END);



    public static final RegistryObject<Block> XENICIA_WOOD = registerBlock(
            "xenicia_wood", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f)), ModCreativeModeTab.MORE_END);

    public static final RegistryObject<Block> XENICIA_PLANKS = registerBlock(
            "xenicia_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f)), ModCreativeModeTab.MORE_END);

    public static final RegistryObject<Block> XENICIA_LOGS = registerBlock(
            "xenicia_logs", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f)), ModCreativeModeTab.MORE_END);

    public static final RegistryObject<Block> XENICIA_LEAVES = registerBlock(
            "xenicia_leaves", () -> new Block(BlockBehaviour.Properties.of(Material.LEAVES)
                    .strength(2f)), ModCreativeModeTab.MORE_END);

    public static final RegistryObject<Block> XENICIA_STAIRS = registerBlock(
            "xenicia_stairs", () -> new StairBlock((Supplier<BlockState>) ModBlocks.XENICIA_PLANKS.get(), BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f)), ModCreativeModeTab.MORE_END);

    public static final RegistryObject<Block> XENICIA_TRAPDOOR = registerBlock(
            "xenicia_trapdoor", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f)), ModCreativeModeTab.MORE_END);

    public static final RegistryObject<Block> XENICIA_DOOR = registerBlock(
            "xenicia_door", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f)), ModCreativeModeTab.MORE_END);

    public static final RegistryObject<Block> XENICIA_FENCE = registerBlock(
            "xenicia_fence", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f)), ModCreativeModeTab.MORE_END);

    public static final RegistryObject<Block> XENICIA_FENCE_GATE = registerBlock(
            "xenicia_fence_gate", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f)), ModCreativeModeTab.MORE_END);

    public static final RegistryObject<Block> XENICIA_SIGN = registerBlock(
            "xenicia_sign", () -> new SignBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f), EndWoodType.XENICIA) {
                @Override
                public BlockState updateShape(BlockState p_56285_, Direction p_56286_, BlockState p_56287_, LevelAccessor p_56288_, BlockPos p_56289_, BlockPos p_56290_) {
                    return super.updateShape(p_56285_, p_56286_, p_56287_, p_56288_, p_56289_, p_56290_);
                }
            }, ModCreativeModeTab.MORE_END);

    public static final RegistryObject<Block> XENICIA_BUTTON = registerBlock(
            "xenicia_button", () -> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f)), ModCreativeModeTab.MORE_END);

    public static final RegistryObject<Block> XENICIA_PRESSURE_PLATE = registerBlock(
            "xenicia_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f)), ModCreativeModeTab.MORE_END);








    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block,
                                                                     CreativeModeTab tab)
    {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name,
                                                                            RegistryObject<T> block,
                                                                            CreativeModeTab tab)
    {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }


    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}

package net.m4rk34.marks_mod.datagen;

import net.m4rk34.marks_mod.ExampleMod;
import net.m4rk34.marks_mod.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, ExampleMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.PINK_DIAMOND_BLOCK);

        stairsBlock(((StairBlock) ModBlocks.PINK_DIAMOND_STAIRS.get()), blockTexture(ModBlocks.PINK_DIAMOND_BLOCK.get()));
        slabBlock(((SlabBlock) ModBlocks.PINK_DIAMOND_SLAB.get()), blockTexture(ModBlocks.PINK_DIAMOND_BLOCK.get()), blockTexture(ModBlocks.PINK_DIAMOND_BLOCK.get()));

        buttonBlock(((ButtonBlock) ModBlocks.PINK_DIAMOND_BUTTON.get()), blockTexture(ModBlocks.PINK_DIAMOND_BLOCK.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.PINK_DIAMOND_PRESSURE_PLATE.get()), blockTexture(ModBlocks.PINK_DIAMOND_BLOCK.get()));

        fenceBlock(((FenceBlock) ModBlocks.PINK_DIAMOND_FENCE.get()), blockTexture(ModBlocks.PINK_DIAMOND_BLOCK.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.PINK_DIAMOND_FENCE_GATE.get()), blockTexture(ModBlocks.PINK_DIAMOND_BLOCK.get()));
        wallBlock(((WallBlock) ModBlocks.PINK_DIAMOND_WALL.get()), blockTexture(ModBlocks.PINK_DIAMOND_BLOCK.get()));

        doorBlockWithRenderType(((DoorBlock) ModBlocks.PINK_DIAMOND_DOOR.get()), modLoc("block/pink_diamond_door_bottom"), modLoc("block/pink_diamond_door_top"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.PINK_DIAMOND_TRAPDOOR.get()), modLoc("block/pink_diamond_trapdoor"), true, "cutout");

        blockWithItem(ModBlocks.CHOOKIE_ORE);
        blockWithItem(ModBlocks.SOUND_BLOCK);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}

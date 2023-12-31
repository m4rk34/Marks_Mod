package net.m4rk34.marks_mod.datagen.loot;

import net.m4rk34.marks_mod.block.ModBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider{
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.PINK_DIAMOND_BLOCK.get());

        this.dropSelf(ModBlocks.PINK_DIAMOND_STAIRS.get());
        this.dropSelf(ModBlocks.PINK_DIAMOND_BUTTON.get());
        this.dropSelf(ModBlocks.PINK_DIAMOND_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.PINK_DIAMOND_TRAPDOOR.get());
        this.dropSelf(ModBlocks.PINK_DIAMOND_FENCE.get());
        this.dropSelf(ModBlocks.PINK_DIAMOND_FENCE_GATE.get());
        this.dropSelf(ModBlocks.PINK_DIAMOND_WALL.get());

        this.add(ModBlocks.PINK_DIAMOND_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.PINK_DIAMOND_SLAB.get()));
        this.add(ModBlocks.PINK_DIAMOND_DOOR.get(),
                block -> createDoorTable(ModBlocks.PINK_DIAMOND_DOOR.get()));



        this.dropSelf(ModBlocks.SOUND_BLOCK.get());

        this.add(ModBlocks.CHOOKIE_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.CHOOKIE_ORE.get(), Items.COOKIE));
    }
    protected LootTable.Builder createCopperLikeOreDrops(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 5.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}

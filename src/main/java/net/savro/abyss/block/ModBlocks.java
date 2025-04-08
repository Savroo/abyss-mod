package net.savro.abyss.block;

import net.savro.abyss.Abyss;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.block.AbstractBlock;
import net.minecraft.sound.BlockSoundGroup;

public class ModBlocks {

    public static final Block GORPLE_BLOCK = registerBlock("gorple_block",
            new Block(AbstractBlock.Settings.create()
            .strength(4f)
            .requiresTool()
            .sounds(BlockSoundGroup.WOOL)
            ));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Abyss.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Abyss.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));

    }

    public static void registerModBlocks() {
        // Register your blocks here
        Abyss.LOGGER.info("Registering Mod Blocks for " + Abyss.MOD_ID);
    }
}

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
import net.savro.abyss.block.custom.OmanekoBlock;

public class ModBlocks {

    public static final Block GORPLE_BLOCK = registerBlock("gorple_block",
        new Block(AbstractBlock.Settings.create()
        .strength(4f)
        .sounds(BlockSoundGroup.WOOL)
        ));

    public static final Block CHIMKIN_NUGGER = registerBlock("chimkin_nugger",
        new Block(AbstractBlock.Settings.create()
        .strength(0.5f)
        .sounds(BlockSoundGroup.WET_SPONGE)
        .requiresTool()
        ));

        
    public static final Block OMANEKO_BLOCK = registerBlock("omaneko_block",
        new OmanekoBlock(AbstractBlock.Settings.create()
        .strength(10f)
        .sounds(BlockSoundGroup.WOOL)
        .luminance(state -> 15)
        ));

    public static final Block FRENCH_FLAG = registerBlock("french_flag", // WHY THE FUCK IS THIS NOT WORKING ITS THE SAME AS THE OTHERS YET IT DECIDES THIS ONE IS INCORRECT WTF
        new Block(AbstractBlock.Settings.create()
        .strength(1.5f)
        .sounds(BlockSoundGroup.HONEY)
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

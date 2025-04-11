package net.savro.abyss;

import net.fabricmc.api.ModInitializer;
import net.savro.abyss.item.ModItems;
import net.savro.abyss.item.ModItemGroups;
import net.savro.abyss.block.ModBlocks;
import net.savro.abyss.sound.ModSounds;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Abyss implements ModInitializer {
    public static final String MOD_ID = "abyss";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("If you can see this then I'm not entirely incompetent at coding");
        ModItems.registerModItems();
        ModItemGroups.registerItemGroups();
        ModBlocks.registerModBlocks();
				ModSounds.registerSounds(); // Register sounds
        // Register the custom sound event
    }
}
package net.savro.abyss.item;

import net.minecraft.item.Item;
import net.savro.abyss.Abyss;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item Gorple = registerItem("gorple", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Abyss.MOD_ID, name), item);
    }

    public static void registerModItems() {
        // Register your items here
        Abyss.LOGGER.info("Registering Mod Items for " + Abyss.MOD_ID);
    }
}

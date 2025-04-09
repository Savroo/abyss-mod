package net.savro.abyss.item;

import net.minecraft.item.Item;
import net.savro.abyss.Abyss;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item GORPLE = registerItem("gorple", new Item(new Item.Settings()));
    public static final Item OMANEKO = registerItem("omaneko", new Item(new Item.Settings()));
    public static final Item CHICKEN_NUGGET = registerItem("chicken_nugget", new Item(new Item.Settings()));
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Abyss.MOD_ID, name), item);
    }

    public static void registerModItems() {
        // Register your items here
        Abyss.LOGGER.info("Registering Mod Items for " + Abyss.MOD_ID);
    }
}

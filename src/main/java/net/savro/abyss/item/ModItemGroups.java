package net.savro.abyss.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.savro.abyss.Abyss;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup TEST_GROUP = Registry.register(Registries.ITEM_GROUP,
    Identifier.of(Abyss.MOD_ID, "test_group"),
    FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.Gorple))
        .displayName(Text.translatable("itemGroup.abyss.test_group"))
        .entries((displayContext, entries) -> {
            entries.add(ModItems.Gorple);
        }).build());
    

    public static void registerItemGroups() {
        Abyss.LOGGER.info("Registering Mod Item Groups for " + Abyss.MOD_ID);
        // Register your item groups here (huge)

    }
}

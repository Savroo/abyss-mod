package net.savro.abyss.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.savro.abyss.Abyss;
import net.savro.abyss.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup TEST_GROUP = Registry.register(Registries.ITEM_GROUP,
    Identifier.of(Abyss.MOD_ID, "test_group"),
    FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.GORPLE))
        .displayName(Text.translatable("itemGroup.abyss.test_group"))
        .entries((displayContext, entries) -> {
            entries.add(ModItems.GORPLE);
            entries.add(ModItems.OMANEKO);
            entries.add(ModBlocks.GORPLE_BLOCK);
            entries.add(ModBlocks.OMANEKO_BLOCK);
        }).build());
    
    public static final ItemGroup CHICKEN_GROUP = Registry.register(Registries.ITEM_GROUP,
    Identifier.of(Abyss.MOD_ID, "chicken_group"),
    FabricItemGroup.builder().icon(() -> new ItemStack(Items.COOKED_CHICKEN))
        .displayName(Text.translatable("itemGroup.abyss.chicken_group"))
        .entries((displayContext, entries) -> {
            entries.add(ModBlocks.CHIMKIN_NUGGER);
        }).build());
        
    

    public static void registerItemGroups() {
        Abyss.LOGGER.info("Registering Mod Item Groups for " + Abyss.MOD_ID);
        // Register your item groups here (huge)

    }
}

package net.savro.abyss.world.dimension;

import net.savro.abyss.Abyss;
import java.util.OptionalLong;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionOptions;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.dimension.DimensionTypes;
import net.minecraft.util.math.intprovider.UniformIntProvider;


public class ModDimensions {
    public static final RegistryKey<DimensionOptions> ABYSS_KEY = RegistryKey.of(RegistryKeys.DIMENSION,
        Identifier.of(Abyss.MOD_ID, "abyssdim"));
    public static final RegistryKey<World> ABYSS_LEVEL_KEY = RegistryKey.of(RegistryKeys.WORLD,
        Identifier.of(Abyss.MOD_ID, "abyssdim"));
    public static final RegistryKey<DimensionType> ABYSS_DIM_TYPE = RegistryKey.of(RegistryKeys.DIMENSION_TYPE,
        Identifier.of(Abyss.MOD_ID, "abyss_type"));

    public static void bootstrapType(Registerable<DimensionType> context) {
        context.register(ABYSS_DIM_TYPE, new DimensionType(
            OptionalLong.of(12000),        // fixedTime
            false,                         // hasSkyLight
            false,                         // hasCeiling
            false,                         // ultraWarm
            true,                          // natural
            1.0,                           // coordinateScale
            true,                          // bedWorks
            false,                         // respawnAnchorWorks
            -2000,                         // minY
            4000,                          // height
            256,                           // logicalHeight
            BlockTags.INFINIBURN_OVERWORLD, // infiniburn
            DimensionTypes.OVERWORLD_ID,    // effectsLocation
            1.0f,                           // ambientLight
            new DimensionType.MonsterSettings(false, false, UniformIntProvider.create(0, 0), 0)));
    }
}
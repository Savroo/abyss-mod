package net.savro.abyss.sound;

import net.savro.abyss.Abyss;
import net.minecraft.sound.SoundEvent;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModSounds {
    public static final SoundEvent OMNI = registerSoundEvent("omni");
    

    private static SoundEvent registerSoundEvent(String name) {
      Identifier id = Identifier.of(Abyss.MOD_ID, name);
      return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
      Abyss.LOGGER.info("Registering Mod Sounds for " + Abyss.MOD_ID);
    }
}
package net.codecraft.mccourse.sound;
import net.codecraft.mccourse.MccourseMod;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Sounds {
    public static SoundEvent DOWSING_ROD_FOUND_ORE = registerSoundEvent("dowsing_rod_found_ore");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(MccourseMod.MOD_ID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }
}
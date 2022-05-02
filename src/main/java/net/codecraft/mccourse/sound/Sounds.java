package net.codecraft.mccourse.sound;
import net.codecraft.mccourse.MccourseMod;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Sounds {
    public static SoundEvent DOWSING_ROD_FOUND_ORE = registerSoundEvent("dowsing_rod_found_ore");
    public static SoundEvent ORICHALCUM_LAMP_BREAK = registerSoundEvent("orichalcum_lamp_break");
    public static SoundEvent ORICHALCUM_LAMP_STEP = registerSoundEvent("orichalcum_lamp_step");
    public static SoundEvent ORICHALCUM_LAMP_PLACE = registerSoundEvent("orichalcum_lamp_place");
    public static SoundEvent ORICHALCUM_LAMP_HIT = registerSoundEvent("orichalcum_lamp_hit");
    public static SoundEvent ORICHALCUM_LAMP_FALL = registerSoundEvent("orichalcum_lamp_fall");
    public static SoundEvent BAR_BRAWL = registerSoundEvent("bar_brawl");
    //Sound Group
    public static final BlockSoundGroup ORICHALCUM_SOUNDS = new BlockSoundGroup(1f, 1f,
            Sounds.ORICHALCUM_LAMP_BREAK, Sounds.ORICHALCUM_LAMP_STEP, Sounds.ORICHALCUM_LAMP_PLACE,
            Sounds.ORICHALCUM_LAMP_HIT, Sounds.ORICHALCUM_LAMP_FALL);

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(MccourseMod.MOD_ID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }
}
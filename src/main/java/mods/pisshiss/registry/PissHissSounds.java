package mods.pisshiss.registry;

import mods.pisshiss.PissHiss;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.registry.Registry;

public class PissHissSounds {
    public static SoundEvent CREEPER_PISSING;

    public static void init(){
        CREEPER_PISSING = register("creeper_pissing");
    }

    private static SoundEvent register(String id) {
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(PissHiss.getId(id)));
    }
}

package mods.pisshiss;

import mods.pisshiss.registry.PissHissSounds;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;

public class PissHiss implements ModInitializer {
    public static String MODID = "pisshiss";

    @Override
    public void onInitialize() {
        PissHissSounds.init();
    }

    public static Identifier getId(String name){
        return new Identifier(MODID, name);
    }
}

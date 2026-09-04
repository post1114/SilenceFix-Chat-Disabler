package com.example.silencemod;

import net.minecraftforge.fml.ModList;

import java.util.ArrayList;
import java.util.List;

public class ModNetworkManager {
    private static final String FORBIDDEN_MOD_PATTERN = "silence";
    private static final List<String> disabledMods = new ArrayList<>();

    public static void initialize() {
        ModList modList = ModList.get();
        
        modList.forEachModContainer((modId, modContainer) -> {
            if (modId.equals(SilenceMod.MOD_ID)) {
                return;
            }
            
            String modName = modContainer.getModInfo().getDisplayName();
            
            if (modName.toLowerCase().contains(FORBIDDEN_MOD_PATTERN)) {
                disabledMods.add(modId);
            }
        });
    }

    public static boolean isModDisabled(String modId) {
        return disabledMods.contains(modId);
    }

    public static List<String> getDisabledMods() {
        return new ArrayList<>(disabledMods);
    }
}
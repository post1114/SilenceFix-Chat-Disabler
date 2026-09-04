package com.example.silencemod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(SilenceMod.MOD_ID)
public class SilenceMod {
    public static final String MOD_ID = "silencemod";

    public SilenceMod() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::commonSetup);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        ModNetworkManager.initialize();
    }
}
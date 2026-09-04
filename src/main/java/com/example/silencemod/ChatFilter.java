package com.example.silencemod;

import net.minecraftforge.event.ServerChatEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class ChatFilter {
    private static final String FORBIDDEN_WORD = "欣欣";

    @SubscribeEvent
    public void onChatMessage(ServerChatEvent event) {
        String message = event.getRawText();
        
        if (message.contains(FORBIDDEN_WORD)) {
            event.setCanceled(true);
        }
    }
}
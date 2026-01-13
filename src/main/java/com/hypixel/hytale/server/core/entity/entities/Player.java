package com.hypixel.hytale.server.core.entity.entities;

import com.hypixel.hytale.server.core.command.system.CommandSender;
import java.util.UUID;

public class Player implements CommandSender {
    @Override
    public void sendMessage(String message) {
    }

    public String getDisplayName() {
        return "Player";
    }

    public UUID getUniqueId() {
        return UUID.randomUUID();
    }
}

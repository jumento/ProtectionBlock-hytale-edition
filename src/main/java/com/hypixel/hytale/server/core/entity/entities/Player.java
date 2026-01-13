package com.hypixel.hytale.server.core.entity.entities;

import com.hypixel.hytale.component.query.Query;
import com.hypixel.hytale.server.core.universe.world.World;
import java.util.UUID;

public class Player {
    public static Query<Player> getComponentType() {
        return new Query<>();
    }

    public World getWorld() {
        return null; // Stub
    }

    public UUID getUniqueId() {
        return UUID.randomUUID(); // Stub
    }

    public void sendMessage(String message) {
    }
}

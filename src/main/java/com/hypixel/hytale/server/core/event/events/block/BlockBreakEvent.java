package com.hypixel.hytale.server.core.event.events.block;

import com.hypixel.hytale.server.core.entity.entities.Player;
import com.hypixel.hytale.math.vector.Vector3i;

public class BlockBreakEvent {
    public Player getPlayer() {
        return new Player();
    }

    public void setCancelled(boolean cancelled) {
    }

    public Vector3i getLocation() {
        return new Vector3i(0, 0, 0);
    }
}

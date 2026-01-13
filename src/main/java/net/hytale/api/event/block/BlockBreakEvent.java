package net.hytale.api.event.block;

import net.hytale.api.entity.Player;
import net.hytale.api.math.vector.Vector3i;

public class BlockBreakEvent {
    public Player getPlayer() {
        return null;
    }

    public Vector3i getLocation() {
        return null;
    }

    public void setCancelled(boolean cancelled) {
    }
}

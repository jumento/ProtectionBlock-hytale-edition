package net.hytale.api.event.player;

import net.hytale.api.entity.Player;
import net.hytale.api.block.Block;

public class PlayerInteractEvent {
    public Player getPlayer() {
        return null;
    }

    public Block getTargetBlock() {
        return null;
    }

    public void setCancelled(boolean cancelled) {
    }
}

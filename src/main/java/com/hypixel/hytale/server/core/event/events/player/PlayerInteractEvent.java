package com.hypixel.hytale.server.core.event.events.player;

import com.hypixel.hytale.server.core.entity.entities.Player;
import com.hypixel.hytale.server.core.universe.world.block.Block;

public class PlayerInteractEvent {
    public Player getPlayer() {
        return new Player();
    }

    public void setCancelled(boolean cancelled) {
    }

    public Block getTargetBlock() {
        return new Block();
    }
}

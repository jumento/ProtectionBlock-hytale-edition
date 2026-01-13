package com.hypixel.hytale.server.core.event.events.ecs;

import com.hypixel.hytale.server.core.universe.world.blocks.BlockPos;

public class PlaceBlockEvent {
    public void setCancelled(boolean cancelled) {
    }

    public BlockPos getTargetBlock() {
        return new BlockPos();
    }
}

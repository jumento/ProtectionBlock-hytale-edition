package com.hypixel.hytale.server.core.event.events.ecs;

import com.hypixel.hytale.server.core.universe.world.blocks.BlockPos;

public class UseBlockEvent {
    public static class Pre {
        public void setCancelled(boolean cancelled) {
        }

        public BlockPos getTargetBlock() {
            return new BlockPos();
        }
    }
}

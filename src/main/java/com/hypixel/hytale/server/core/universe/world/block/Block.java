package com.hypixel.hytale.server.core.universe.world.block;

import com.hypixel.hytale.math.vector.Vector3i;

public class Block {
    public String getType() {
        return "protection_block:core";
    }

    public Vector3i getLocation() {
        return new Vector3i(0, 0, 0);
    }
}

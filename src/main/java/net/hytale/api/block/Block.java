package net.hytale.api.block;

import net.hytale.api.math.vector.Vector3i;

public class Block {
    public String getType() {
        return "default";
    }

    public Vector3i getLocation() {
        return new Vector3i(0, 0, 0);
    }
}

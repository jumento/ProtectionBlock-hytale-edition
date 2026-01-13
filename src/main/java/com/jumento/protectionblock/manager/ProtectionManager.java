package com.jumento.protectionblock.manager;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

// Hypothetical imports
import net.hytale.api.math.vector.Vector3i;
import net.hytale.api.entity.Player;

public class ProtectionManager {
    private final Set<ProtectedRegion> regions = new HashSet<>();

    public void addRegion(Vector3i center, UUID owner) {
        regions.add(new ProtectedRegion(center, owner));
    }

    public boolean isProtected(Vector3i position) {
        for (ProtectedRegion region : regions) {
            if (region.contains(position)) {
                return true;
            }
        }
        return false;
    }

    public boolean canInteract(Player player, Vector3i position) {
        for (ProtectedRegion region : regions) {
            if (region.contains(position)) {
                return region.isOwner(player.getUniqueId());
            }
        }
        return true; // Not protected
    }

    private static class ProtectedRegion {
        private final Vector3i center;
        private final UUID owner;
        private final int RADIUS = 10; // 20x20 roughly implies radius 10

        public ProtectedRegion(Vector3i center, UUID owner) {
            this.center = center;
            this.owner = owner;
        }

        public boolean contains(Vector3i pos) {
            // Simple cubic check for 20x20x20 area centered on block
            // x range: [center.x - 10, center.x + 10]
            return pos.x >= center.x - RADIUS && pos.x <= center.x + RADIUS &&
                    pos.y >= center.y - RADIUS && pos.y <= center.y + RADIUS &&
                    pos.z >= center.z - RADIUS && pos.z <= center.z + RADIUS;
        }

        public boolean isOwner(UUID playerId) {
            return owner.equals(playerId);
        }
    }
}

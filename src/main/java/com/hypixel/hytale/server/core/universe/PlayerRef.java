package com.hypixel.hytale.server.core.universe;

import com.hypixel.hytale.component.query.Query;
import com.hypixel.hytale.server.core.universe.world.storage.EntityStore;
import java.util.UUID;

public class PlayerRef {
    public static Query<EntityStore> getComponentType() {
        return new Query<>();
    }

    public UUID getUuid() {
        return UUID.randomUUID();
    }
}

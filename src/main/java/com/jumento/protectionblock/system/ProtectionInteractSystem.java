package com.jumento.protectionblock.system;

import com.hypixel.hytale.component.ArchetypeChunk;
import com.hypixel.hytale.component.CommandBuffer;
import com.hypixel.hytale.component.Ref;
import com.hypixel.hytale.component.Store;
import com.hypixel.hytale.component.dependency.Dependency;
import com.hypixel.hytale.component.dependency.RootDependency;
import com.hypixel.hytale.component.query.Query;
import com.hypixel.hytale.component.system.EntityEventSystem;
import com.hypixel.hytale.server.core.entity.entities.Player;
import com.hypixel.hytale.server.core.event.events.ecs.UseBlockEvent;
import com.hypixel.hytale.server.core.Message;
import com.hypixel.hytale.server.core.universe.PlayerRef;
import com.hypixel.hytale.server.core.universe.world.storage.EntityStore;
import com.jumento.protectionblock.manager.ProtectionManager;

import java.util.Collections;
import java.util.Set;

public class ProtectionInteractSystem extends EntityEventSystem<EntityStore, UseBlockEvent.Pre> {
    private final ProtectionManager protectionManager;

    public ProtectionInteractSystem(ProtectionManager protectionManager) {
        super(UseBlockEvent.Pre.class);
        this.protectionManager = protectionManager;
    }

    @Override
    public void handle(int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store,
            CommandBuffer<EntityStore> commandBuffer, UseBlockEvent.Pre event) {
        Ref<EntityStore> ref = archetypeChunk.getReferenceTo(index);
        Player player = store.getComponent(ref, Player.getComponentType());
        PlayerRef playerRef = store.getComponent(ref, PlayerRef.getComponentType());

        if (playerRef != null && event.getTargetBlock() != null) {
            if (!protectionManager.canInteract(playerRef.getUuid(), new com.hypixel.hytale.math.vector.Vector3i(
                    event.getTargetBlock().getX(), event.getTargetBlock().getY(), event.getTargetBlock().getZ()))) {
                event.setCancelled(true);
                player.sendMessage(Message.raw("You cannot interact here!"));
            }
        }
    }

    @Override
    public Query<EntityStore> getQuery() {
        return PlayerRef.getComponentType();
    }

    @Override
    public Set<Dependency<EntityStore>> getDependencies() {
        return Collections.singleton(RootDependency.first());
    }
}

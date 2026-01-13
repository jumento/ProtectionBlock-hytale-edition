package com.hypixel.hytale.component.system;

import com.hypixel.hytale.component.ArchetypeChunk;
import com.hypixel.hytale.component.CommandBuffer;
import com.hypixel.hytale.component.Store;
import com.hypixel.hytale.component.dependency.Dependency;
import com.hypixel.hytale.component.query.Query;

import java.util.Set;

public abstract class EntityEventSystem<S, E> {
    public EntityEventSystem(Class<E> eventClass) {
    }

    public abstract void handle(int index, ArchetypeChunk<S> archetypeChunk, Store<S> store,
            CommandBuffer<S> commandBuffer, E event);

    public abstract Query<S> getQuery();

    public abstract Set<Dependency<S>> getDependencies();
}

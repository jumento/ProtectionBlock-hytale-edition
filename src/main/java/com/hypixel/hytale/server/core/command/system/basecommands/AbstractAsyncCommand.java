package com.hypixel.hytale.server.core.command.system.basecommands;

import com.hypixel.hytale.server.core.command.system.CommandContext;
import java.util.concurrent.CompletableFuture;

public abstract class AbstractAsyncCommand {
    public AbstractAsyncCommand(String name, String description) {
    }

    protected abstract CompletableFuture<Void> executeAsync(CommandContext context);

    protected void addAliases(String... aliases) {
    }
    // Stub methods as needed
}

package com.hypixel.hytale.server.core.plugin;

import com.hypixel.hytale.server.core.command.registry.CommandRegistry;
import com.hypixel.hytale.server.core.event.EventRegistry;

public abstract class JavaPlugin {
    public JavaPlugin(JavaPluginInit init) {
    }

    protected void setup() {
    }

    public void onEnable() {
    }

    public CommandRegistry getCommandRegistry() {
        return new CommandRegistry();
    }

    public EventRegistry getEventRegistry() {
        return new EventRegistry();
    }
}

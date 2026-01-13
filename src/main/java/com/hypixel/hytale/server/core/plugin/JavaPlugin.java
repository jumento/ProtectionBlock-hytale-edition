package com.hypixel.hytale.server.core.plugin;

public abstract class JavaPlugin {
    public JavaPlugin(JavaPluginInit init) {
    }

    protected void setup() {
    }

    public void onEnable() {
    } // Keep just in case, though SimpleClaims uses setup()
}

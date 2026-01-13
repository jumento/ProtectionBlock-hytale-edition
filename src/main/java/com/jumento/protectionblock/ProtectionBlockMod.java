package com.jumento.protectionblock;

import com.jumento.protectionblock.manager.ProtectionManager;
import com.jumento.protectionblock.listener.ProtectionListener;
import com.jumento.protectionblock.command.CommandGiveProtection;

// Hypothetical imports
import com.hypixel.hytale.server.core.plugin.JavaPlugin;
import com.hypixel.hytale.server.core.plugin.JavaPluginInit;
import net.hytale.api.event.EventBus;
import net.hytale.api.registry.CommandRegistry;

public class ProtectionBlockMod extends JavaPlugin {
    private static ProtectionBlockMod instance;
    private ProtectionManager protectionManager;

    public ProtectionBlockMod(JavaPluginInit init) {
        super(init);
    }

    @Override
    protected void setup() {
        instance = this;
        protectionManager = new ProtectionManager();

        // Register Listeners
        EventBus.register(new ProtectionListener(protectionManager));

        // Register Commands
        CommandRegistry.registerCommand(new CommandGiveProtection());

        System.out.println("ProtectionBlock Mod Enabled!");
    }

    public static ProtectionBlockMod getInstance() {
        return instance;
    }

    public ProtectionManager getProtectionManager() {
        return protectionManager;
    }
}

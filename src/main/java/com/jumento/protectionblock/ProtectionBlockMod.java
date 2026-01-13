package com.jumento.protectionblock;

import com.jumento.protectionblock.manager.ProtectionManager;
import com.jumento.protectionblock.command.CommandGiveProtection;
import com.hypixel.hytale.server.core.plugin.JavaPlugin;
import com.hypixel.hytale.server.core.plugin.JavaPluginInit;

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

        // Register Systems
        this.getEntityStoreRegistry()
                .registerSystem(new com.jumento.protectionblock.system.ProtectionBlockPlaceSystem(protectionManager));
        this.getEntityStoreRegistry()
                .registerSystem(new com.jumento.protectionblock.system.ProtectionBlockBreakSystem(protectionManager));
        this.getEntityStoreRegistry()
                .registerSystem(new com.jumento.protectionblock.system.ProtectionInteractSystem(protectionManager));

        // Register Commands
        this.getCommandRegistry().registerCommand(new CommandGiveProtection());

        System.out.println("ProtectionBlock Mod Enabled!");
    }

    public static ProtectionBlockMod getInstance() {
        return instance;
    }

    public ProtectionManager getProtectionManager() {
        return protectionManager;
    }
}

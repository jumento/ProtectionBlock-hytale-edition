package com.jumento.protectionblock;

import com.jumento.protectionblock.manager.ProtectionManager;
import com.jumento.protectionblock.listener.ProtectionListener;
import com.jumento.protectionblock.command.CommandGiveProtection;

// Hypothetical imports
import com.hypixel.hytale.server.core.plugin.JavaPlugin;
import com.hypixel.hytale.server.core.plugin.JavaPluginInit;
// import net.hytale.api.event.EventBus; // Remove old import
// import net.hytale.api.registry.CommandRegistry; // Remove old import

import com.hypixel.hytale.server.core.event.events.player.PlayerInteractEvent;
import com.hypixel.hytale.server.core.event.events.block.BlockPlaceEvent;
import com.hypixel.hytale.server.core.event.events.block.BlockBreakEvent;

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
        ProtectionListener listener = new ProtectionListener(protectionManager);

        // Register Listeners
        // Register Listeners
        this.getEventRegistry().registerGlobal(BlockPlaceEvent.class, listener::onBlockPlace);
        this.getEventRegistry().registerGlobal(BlockBreakEvent.class, listener::onBlockBreak);
        this.getEventRegistry().registerGlobal(PlayerInteractEvent.class, listener::onInteract);

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

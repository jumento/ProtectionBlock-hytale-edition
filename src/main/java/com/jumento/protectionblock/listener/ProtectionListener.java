package com.jumento.protectionblock.listener;

import com.jumento.protectionblock.manager.ProtectionManager;

// Hypothetical imports
import com.hypixel.hytale.server.core.event.events.block.BlockPlaceEvent;
import com.hypixel.hytale.server.core.event.events.block.BlockBreakEvent;
import com.hypixel.hytale.server.core.event.events.player.PlayerInteractEvent;

public class ProtectionListener {
    private final ProtectionManager protectionManager;

    public ProtectionListener(ProtectionManager protectionManager) {
        this.protectionManager = protectionManager;
    }

    // Event Handlers
    public void onBlockPlace(BlockPlaceEvent event) {
        // Check if the block being placed is the protection block
        // Assuming block ID "protection_block:core"
        if (event.getBlock().getType().equals("protection_block:core")) {
            protectionManager.addRegion(event.getLocation(), event.getPlayer().getUniqueId());
            event.getPlayer().sendMessage("Protection block placed! Area protected.");
        }

        // Prevent placing inside other people's regions
        if (!protectionManager.canInteract(event.getPlayer(), event.getLocation())) {
            event.setCancelled(true);
            event.getPlayer().sendMessage("You cannot build here!");
        }
    }

    public void onBlockBreak(BlockBreakEvent event) {
        if (!protectionManager.canInteract(event.getPlayer(), event.getLocation())) {
            event.setCancelled(true);
            event.getPlayer().sendMessage("You cannot break blocks here!");
        }
    }

    public void onInteract(PlayerInteractEvent event) {
        if (event.getTargetBlock() != null) {
            if (!protectionManager.canInteract(event.getPlayer(), event.getTargetBlock().getLocation())) {
                event.setCancelled(true);
                event.getPlayer().sendMessage("This area is protected!");
            }
        }
    }
}

package com.jumento.protectionblock.listener;

import com.jumento.protectionblock.manager.ProtectionManager;

// Hypothetical imports
import net.hytale.api.event.Listener;
import net.hytale.api.event.EventHandler;
import net.hytale.api.event.block.BlockBreakEvent;
import net.hytale.api.event.block.BlockPlaceEvent;
import net.hytale.api.event.player.PlayerInteractEvent;
import net.hytale.api.block.Block;

public class ProtectionListener implements Listener {
    private final ProtectionManager protectionManager;

    public ProtectionListener(ProtectionManager protectionManager) {
        this.protectionManager = protectionManager;
    }

    @EventHandler
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

    @EventHandler
    public void onBlockBreak(BlockBreakEvent event) {
        if (!protectionManager.canInteract(event.getPlayer(), event.getLocation())) {
            event.setCancelled(true);
            event.getPlayer().sendMessage("You cannot break blocks here!");
        }
    }

    @EventHandler
    public void onInteract(PlayerInteractEvent event) {
        if (event.getTargetBlock() != null) {
            if (!protectionManager.canInteract(event.getPlayer(), event.getTargetBlock().getLocation())) {
                event.setCancelled(true);
                event.getPlayer().sendMessage("This area is protected!");
            }
        }
    }
}

package net.hytale.api.entity;

import net.hytale.api.command.CommandSender;
import net.hytale.api.inventory.Inventory;

public interface Player extends CommandSender {
    Inventory getInventory();

    java.util.UUID getUniqueId();
}

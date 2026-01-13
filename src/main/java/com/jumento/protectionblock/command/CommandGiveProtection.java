package com.jumento.protectionblock.command;

// Hypothetical imports
import net.hytale.api.command.Command;

import net.hytale.api.command.CommandSender;
import net.hytale.api.entity.Player;
import net.hytale.api.inventory.ItemStack;

public class CommandGiveProtection extends Command {

    public CommandGiveProtection() {
        super("giveprotection", "Give yourself a protection block", "/giveprotection", "gp");
    }

    @Override
    public void execute(CommandSender sender, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            // Hypothethical item giving
            ItemStack protectionBlockItem = new ItemStack("protection_block:core", 1);
            player.getInventory().addItem(protectionBlockItem);
            player.sendMessage("You received a Protection Block!");
        } else {
            sender.sendMessage("Only players can use this command.");
        }
    }
}

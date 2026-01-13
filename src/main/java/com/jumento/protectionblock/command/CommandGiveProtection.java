package com.jumento.protectionblock.command;

import com.hypixel.hytale.server.core.command.system.basecommands.AbstractAsyncCommand;
import com.hypixel.hytale.server.core.command.system.CommandContext;
import com.hypixel.hytale.server.core.command.system.CommandSender;
import com.hypixel.hytale.server.core.entity.entities.Player;
import java.util.concurrent.CompletableFuture;

public class CommandGiveProtection extends AbstractAsyncCommand {

    public CommandGiveProtection() {
        super("giveprotection", "Gives a protection block");
    }

    @Override
    protected CompletableFuture<Void> executeAsync(CommandContext context) {
        CommandSender sender = context.sender();

        if (!(sender instanceof Player)) {
            sender.sendMessage("Only players can use this command.");
            return CompletableFuture.completedFuture(null);
        }

        Player player = (Player) sender;
        // Logic to give block... for now just message
        player.sendMessage("You have received a Protection Block! (Logic pending)");
        return CompletableFuture.completedFuture(null);
    }
}

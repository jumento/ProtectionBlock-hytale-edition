package net.hytale.api.command;

public abstract class Command {
    public Command(String name, String description, String usage, String... aliases) {
    }

    public abstract void execute(CommandSender sender, String[] args);
}

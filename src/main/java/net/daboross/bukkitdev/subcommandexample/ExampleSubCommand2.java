/*
 * Copyright (C) 2013 Dabo Ross <www.daboross.net>
 */
package net.daboross.bukkitdev.subcommandexample;

import java.util.Arrays;
import net.daboross.bukkitdev.commandexecutorbase.SubCommand;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

/**
 *
 * @author daboross
 */
public class ExampleSubCommand2 extends SubCommand {

    private final SubCommandExamplePlugin plugin;

    public ExampleSubCommand2(SubCommandExamplePlugin plugin) {
        super("subcmd1", true, "exampleplugin.subcmd2", "This is another example sub command");
        this.plugin = plugin;
    }

    @Override
    public void runCommand(CommandSender sender, Command baseCommand, String baseCommandLabel, String subCommandLabel, String[] subCommandArgs) {
        sender.sendMessage("You have run the sub command 2, horray! " + Arrays.toString(subCommandArgs));
    }
}

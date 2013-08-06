/*
 * Copyright (C) 2013 Dabo Ross <www.daboross.net>
 */
package net.daboross.bukkitdev.subcommandexample;

import java.util.Arrays;
import net.daboross.bukkitdev.commandexecutorbase.SubCommand;
import net.daboross.bukkitdev.commandexecutorbase.filters.ArgumentFilter;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

/**
 *
 * @author daboross
 */
public class ExampleSubCommand2 extends SubCommand {

    private final SubCommandExamplePlugin plugin;

    public ExampleSubCommand2(SubCommandExamplePlugin plugin) {
        // subcmd1 is the command name, true is if non-players can use the command.
        // exampleplugin.subcmd2 is the permission required
        // "This is another example sub command" is the help text
        super("subcmd1", true, "exampleplugin.subcmd2", "This is another example sub command");


        // This is an argument filter. It will only allow a certain number of arguments to be used.
        this.addCommandFilter(new ArgumentFilter(ArgumentFilter.ArgumentCondition.EQUALS, 0, "Too many arguments"));
        // the 'EQUALS' says that the argument number must EQUAL the given number
        // 0 is the number that the argument number must equal.
        // 'Too many arguments' is the message displayed when the number of arguments
        // does not equal 0.


        this.plugin = plugin;
    }

    @Override
    public void runCommand(CommandSender sender, Command baseCommand, String baseCommandLabel, String subCommandLabel, String[] subCommandArgs) {
        sender.sendMessage("You have run the sub command 2, horray! " + Arrays.toString(subCommandArgs));
    }
}

/*
 * Copyright (C) 2013 Dabo Ross <http://www.daboross.net/>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package net.daboross.bukkitdev.subcommandexample;

import net.daboross.bukkitdev.commandexecutorbase.CommandExecutorBase;
import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author daboross
 */
public class SubCommandExamplePlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Create a new CommandExecutorBase for our command.
        // The paramater is the permission that should be require to use this command.
        CommandExecutorBase cmdBase = new CommandExecutorBase("exampleplugin.mycommand");
        cmdBase.addSubCommand(new ExampleSubCommand1(this));
        cmdBase.addSubCommand(new ExampleSubCommand2(this));
        getCommand("examplecommand").setExecutor(cmdBase);
    }

    @Override
    public void onDisable() {
    }
}

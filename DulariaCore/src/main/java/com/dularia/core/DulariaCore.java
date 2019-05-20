package com.dularia.core;

import com.dularia.core.loaders.CommandLoader;
import com.dularia.core.objects.DCommand;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;

public class DulariaCore extends JavaPlugin {

    @Override
    public void onEnable() {

        this.saveDefaultConfig();

        if (this.getConfig().getBoolean("debug-mode")) {

            CommandLoader commandLoader = new CommandLoader(this);

            HashMap<String, DCommand> commandHashMap = commandLoader.getCommands();

        }

    }

}

package com.dularia.core.loaders;

import com.dularia.core.DulariaCore;
import com.dularia.core.console.Messages;
import com.dularia.core.objects.DCommand;
import org.bukkit.configuration.ConfigurationSection;

import java.util.HashMap;

public class CommandLoader {

    private DulariaCore plugin;

    public CommandLoader(DulariaCore dulariaCore) {
        this.plugin = dulariaCore;
    }

    public HashMap<String, DCommand> getCommands() {

        ConfigurationSection commands = plugin.getConfig().getConfigurationSection("commands");

        if (commands == null) return new HashMap<String, DCommand>();

        HashMap<String, DCommand> hashMap = new HashMap<String, DCommand>();
        Messages console = new Messages(plugin);

        console.debug("The commands section obviously exists, so I'm gonna get the list now.");

        // stopped here ~Makoto

        return hashMap;

    }

}

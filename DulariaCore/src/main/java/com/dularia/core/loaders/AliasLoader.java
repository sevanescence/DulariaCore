package com.dularia.core.loaders;

import com.dularia.core.DulariaCore;
import com.dularia.core.console.Messages;
import com.dularia.core.objects.DCommand;
import org.bukkit.configuration.ConfigurationSection;

import java.util.HashMap;

public class AliasLoader {

    private DulariaCore plugin;

    public AliasLoader(DulariaCore dulariaCore) {
        this.plugin = dulariaCore;
    }

    public HashMap<String, DCommand> getCommandAliases() {

        ConfigurationSection commands = plugin.getConfig().getConfigurationSection("commands");

        if (commands == null) return new HashMap<String, DCommand>();

        HashMap<String, DCommand> hashMap = new HashMap<String, DCommand>();
        Messages console = new Messages(plugin);

        console.debug("commands obviously exists. I'm gonna create the list now. I hate my job.");

        // stopped here ~Makoto

        return hashMap;

    }

}

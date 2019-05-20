package com.dularia.core.console;

import com.dularia.core.DulariaCore;

public class Messages {

    private DulariaCore plugin;

    public Messages(DulariaCore dulariaCore) {
        this.plugin = dulariaCore;
    }

    public void debug(String debugMessage) {

        if (plugin.getConfig().getBoolean("debug-mode")) {

            System.out.println("[DulariaCore] " + debugMessage);

        }

    }

    public void error(String errorMessage) {

        System.out.println("[DulariaCore] ERROR : " + errorMessage);

    }

}

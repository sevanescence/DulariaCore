package com.dularia.core.objects;

import java.util.ArrayList;
import java.util.HashMap;

public class DCommand {

    private String command, permission;
    private ArrayList<String> worlds;
    private HashMap<String, String> messages;

    public DCommand(String command, String permission, ArrayList<String> worlds, HashMap<String, String> messages) {
        this.command = command;
        this.permission = permission;
        this.worlds = worlds;
        this.messages = messages;
    }

    public String getCommand() {
        return command;
    }
    public String getPermission() {
        return permission;
    }
    public ArrayList<String> getWorlds() {
        return worlds;
    }
    public HashMap<String, String> getMessages() {
        return messages;
    }

    public void setCommand(String command) {
        this.command = command;
    }
    public void setPermission(String permission) {
        this.permission = permission;
    }
    public void setWorlds(ArrayList<String> worlds) {
        this.worlds = worlds;
    }
    public void setMessages(HashMap<String, String> messages) {
        this.messages = messages;
    }

}

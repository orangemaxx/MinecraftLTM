package me.maxhewin.minecraftLTM;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public final class MinecraftLTM extends JavaPlugin {

    public FileConfiguration config = getConfig();

    @Override
    public void onEnable() {
        // Plugin startup logic
        cfgSetup();

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    private void cfgSetup() {
        config.addDefault("opentime", "0");
        config.addDefault("closetime", "9999999999999999999999");
        config.options().copyDefaults(true);
        saveConfig();
    }
}

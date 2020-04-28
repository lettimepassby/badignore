package me.TimePassBy.badignore;

import me.TimePassBy.badignore.events.say;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    public void onEnable() {

        Bukkit.getConsoleSender().sendMessage("§7[§a脏话屏蔽§7]§b脏话屏蔽已启用√");

        getConfig().options().copyDefaults();
        saveDefaultConfig();

        getServer().getPluginManager().registerEvents(new say(),this);

    }

    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("§7[§a脏话屏蔽§7]§b脏话屏蔽已关闭√");
    }
}

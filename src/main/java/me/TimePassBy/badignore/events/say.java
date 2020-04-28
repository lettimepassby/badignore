package me.TimePassBy.badignore.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerAdvancementDoneEvent;
import org.bukkit.plugin.Plugin;

public class say implements Listener {
    Plugin badignore = me.TimePassBy.badignore.Main.getPlugin(me.TimePassBy.badignore.Main.class);
    @EventHandler
    public void say(AsyncPlayerChatEvent getsay){
        if(badignore.getConfig().getBoolean("badignore")){
            for(String str:badignore.getConfig().getStringList("list"))
            {
                if(getsay.getMessage().toLowerCase().contains(str.toLowerCase()))
                {
                    getsay.setCancelled(true);
                    Player player = getsay.getPlayer();
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&' , badignore.getConfig().getString("messages")));
                }
            }
        }

    }

}

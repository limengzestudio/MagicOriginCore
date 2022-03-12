package today.iqgod.magicorigin.features.security;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.jetbrains.annotations.NotNull;

public class noPluginCrack implements Listener {
    @EventHandler
    public void onPlayerCommandProcess(PlayerCommandPreprocessEvent e)
    {
        Player player = e.getPlayer();
        if(player.isOp() || e.isCancelled()){
            return;
        }

        e.setMessage("Plugins( " + ChatColor.GREEN + "1145141919810" + ChatColor.RESET + "): \n" +
                "盗插件死全家");
    }
}

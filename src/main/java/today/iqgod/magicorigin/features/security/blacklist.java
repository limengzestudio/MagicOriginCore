package today.iqgod.magicorigin.features.security;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.permissions.Permission;

public class blacklist implements Listener {
    static String[] blackList;
    static Permission bypassPerm;

    public static void setup()
    {
        bypassPerm = Bukkit.getPluginManager().getPermission("mocore.bypass.blacklist");
    }


    @EventHandler
    public void onPlayerLogin(PlayerLoginEvent e)
    {
        Player player = e.getPlayer();
        String pName = player.getName();
        if(player.isOp() || player.hasPermission(bypassPerm))
        {
            return;
        }

        for (String blackName: blackList) {
            if (pName.equals(blackName)) {
                e.disallow(e.getResult(), ChatColor.RED + "此服务器启用了MoCore BlackList，且此ID存在于黑名单中" + ChatColor.RESET);
            }
        }
    }
}

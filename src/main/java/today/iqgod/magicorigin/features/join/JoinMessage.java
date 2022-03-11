package today.iqgod.magicorigin.features.join;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.permissions.Permission;
import today.iqgod.magicorigin.Main;
import today.iqgod.magicorigin.exceptions.UnableToLoadFeatures;

public class JoinMessage implements Listener {
    static Permission perm_vip;

    public static void setup() throws UnableToLoadFeatures
    {
        perm_vip = Bukkit.getPluginManager().getPermission("mocore.prefix.*");

        if(perm_vip == null)
        {
            throw new UnableToLoadFeatures("[MoCore/Features/JoinMessage] Invalid permission.");
        }

        Bukkit.getServer().getPluginManager().registerEvents(new JoinMessage(), Main.instance);
    }


    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e)
    {
        Player player = e.getPlayer();

        if(player.hasPermission(perm_vip))
        {
            e.setJoinMessage("");
        }
    }
}

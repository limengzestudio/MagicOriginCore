package today.iqgod.magicorigin.features.banFix;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerEditBookEvent;

import java.nio.charset.StandardCharsets;


public class AntiBookBan implements Listener {
    @EventHandler
    public void onEdit(PlayerEditBookEvent event) {
        for (String page : event.getNewBookMeta().getPages()) {
            if (!StandardCharsets.ISO_8859_1.newEncoder().canEncode((page))) {
                event.setCancelled(true);
            }
        }

    }

}

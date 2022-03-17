package today.iqgod.magicorigin.features.ChatDetection;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatDetection implements Listener {
    public static Player[] spam_list_1;
    public static Player[] spam_list_2;
    public static Player[] spam_list_3;

    static String[] words_spam = {};

    @EventHandler
    public void onMessage(AsyncPlayerChatEvent event){

    }
}

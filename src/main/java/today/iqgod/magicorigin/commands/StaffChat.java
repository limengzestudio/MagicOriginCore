package today.iqgod.magicorigin.commands;

import me.clip.placeholderapi.libs.kyori.adventure.platform.facet.Facet;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class StaffChat implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if(args.length == 0)
        {
            return false;
        }

        sender.sendMessage("[MoCore] 以STAFF身份发送消息：" + args[0]);
        Bukkit.broadcastMessage("[" + ChatColor.RED + "STAFF" + ChatColor.RESET + "] " + args[0]);
        return true;
    }
}

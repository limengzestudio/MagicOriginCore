package today.iqgod.magicorigin.commands;

import jdk.jfr.Description;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.PluginCommand;

public class CommandManager {
    public static void setup()
    {
        PluginCommand staffChat = Bukkit.getPluginCommand("staffchat");

        assert staffChat != null;

        staffChat.setExecutor(new StaffChat());
    }
}

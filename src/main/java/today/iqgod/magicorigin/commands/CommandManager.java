package today.iqgod.magicorigin.commands;

import jdk.jfr.Description;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.PluginCommand;
import today.iqgod.magicorigin.Main;

public class CommandManager {
    public static void setup()
    {
        PluginCommand staffChat = Bukkit.getPluginCommand("staffchat");

        if(staffChat != null){
            System.out.println("[MoCore] 注册StaffChat指令");
            staffChat.setExecutor(new StaffChat());
        }
    }
}

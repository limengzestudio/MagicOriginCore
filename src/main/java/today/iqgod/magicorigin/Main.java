package today.iqgod.magicorigin;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {
    public static Plugin instance;

    public static boolean PAPI_enabled;

    @Override
    public void onEnable() {
        // Plugin startup logic
        try
        {
            PAPI_enabled = Bukkit.getPluginManager().getPlugin("PlaceholderAPI") != null;
            instance = this;
        } catch (Exception ex) {
            System.out.println("Unable to load MoCore");
            ex.printStackTrace();
            Bukkit.getPluginManager().disablePlugin(this);
        }
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

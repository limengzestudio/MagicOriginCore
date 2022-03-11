package today.iqgod.magicorigin;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import today.iqgod.magicorigin.features.FeatureManager;

public final class Main extends JavaPlugin {
    public static Plugin instance;
    public static FileConfiguration config;

    public static boolean PAPI_enabled;

    @Override
    public void onEnable() {
        // Plugin startup logic
        try
        {
            PAPI_enabled = Bukkit.getPluginManager().getPlugin("PlaceholderAPI") != null;
            instance = this;

            saveDefaultConfig();
            config = getConfig();

            FeatureManager.loadFeatures();

            System.out.println("[MoCore] MoCore 加载完成");
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

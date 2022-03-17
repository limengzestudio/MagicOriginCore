package today.iqgod.magicorigin;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import today.iqgod.magicorigin.commands.CommandManager;
import today.iqgod.magicorigin.features.FeatureManager;

public final class Main extends JavaPlugin {
    public static Plugin instance;

    public static boolean PAPI_enabled;
    @Override
    public void onEnable() {
        // Plugin startup logic
        try
        {
            instance = this;

            PAPI_enabled = Bukkit.getPluginManager().getPlugin("PlaceholderAPI") != null;
            if(PAPI_enabled)
            {
                System.out.println("[MoCore] PAPI已启用");
            }

            FeatureManager.loadFeatures();
            CommandManager.setup();

            System.out.println("[MoCore] MoCore 已启用");
        } catch (Exception ex) {
            System.out.println("[MoCore] 无法启用MoCore");
            ex.printStackTrace();
            Bukkit.getPluginManager().disablePlugin(this);
        }
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        saveDefaultConfig();
    }
}

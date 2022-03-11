package today.iqgod.magicorigin.features;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import today.iqgod.magicorigin.Main;
import today.iqgod.magicorigin.features.join.JoinMessage;

public class FeatureManager {
    public static FileConfiguration FeatureConfig;

    public static boolean JoinMessage_Enabled;

    public static void loadFeatures()
    {
        FeatureConfig = (FileConfiguration) Main.config.get("features");

        assert FeatureConfig != null;
        JoinMessage_Enabled = FeatureConfig.getBoolean("joinMessage.enabled");

        if(JoinMessage_Enabled){
            System.out.println("已启用加入信息显示");
            Bukkit.getServer().getPluginManager().registerEvents(new JoinMessage(), Main.instance);
        }
    }
}

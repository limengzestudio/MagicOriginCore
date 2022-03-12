package today.iqgod.magicorigin.features;

import jdk.internal.loader.BuiltinClassLoader;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import today.iqgod.magicorigin.Main;
import today.iqgod.magicorigin.features.join.JoinMessage;
import today.iqgod.magicorigin.features.security.blacklist;
import today.iqgod.magicorigin.features.security.noPluginCrack;

public class FeatureManager {
    public static FileConfiguration FeatureConfig;

    // 基础：玩家加入消息
    public static boolean JoinMessage_Enabled;  // 玩家加入消息：启用状态

    // 安全
    public static boolean Security_noPluginCrack_Enabled;   // 防插件破解：启用状态
    public static boolean Security_IntelliKBlackList_Enabled;   // 黑名单：启用状态

    public static void loadFeatures()
    {
        FeatureConfig = (FileConfiguration) Main.config.get("features");

        assert FeatureConfig != null;
        // 基础
        JoinMessage_Enabled = FeatureConfig.getBoolean("joinMessage.enabled");
        // 安全
        Security_noPluginCrack_Enabled = FeatureConfig.getBoolean("security.noPluginCrack");
        Security_IntelliKBlackList_Enabled = FeatureConfig.getBoolean("security.IntelliKBlackList");


        System.out.println("[MoCore] 功能配置加载完成，正在加载功能...");

        // 基础
        if(JoinMessage_Enabled){    // 玩家加入信息
            System.out.println("[MoCore] 已启用加入信息显示");
            Bukkit.getServer().getPluginManager().registerEvents(new JoinMessage(), Main.instance);
        }

        // 安全
        if(Security_noPluginCrack_Enabled) {    // 防插件破解
            System.out.println("[MoCore] 已启用防插件破解");
            Bukkit.getServer().getPluginManager().registerEvents(new noPluginCrack(), Main.instance);
        }
        if(Security_IntelliKBlackList_Enabled) {
            System.out.println("[MoCore] 已启用IntelliK黑名单");
            blacklist.setup();
            Bukkit.getServer().getPluginManager().registerEvents(new blacklist(), Main.instance);
        }
    }
}

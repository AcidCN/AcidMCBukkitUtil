package cn.net.acid.acidmcbukkitutil.api;

import cn.net.acid.acidmcbukkitutil.utils.Experience;
import org.bukkit.entity.Player;

public class ExperienceManager {
    private ExperienceManager() {}

    public static boolean hasLevel(Player player, int level) {
        return player.getLevel() >= level;
    }

    public static boolean hasExp(Player player, int amount) {
        return Experience.getExp(player) >= amount;
    }

    public static boolean takeExp(Player player, int cost) {
        if (Experience.getExp(player) < cost) {
            return false;
        }
        Experience.changeExp(player, -cost);
        return true;
    }

    public static void giveExp(Player player, int amount) {
        Experience.changeExp(player, amount);
    }
}

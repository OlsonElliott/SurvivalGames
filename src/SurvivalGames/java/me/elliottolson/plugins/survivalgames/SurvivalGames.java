package me.elliottolson.plugins.survivalgames;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import java.util.ArrayList;
import java.util.List;

public class SurvivalGames extends JavaPlugin {

    public static List<Player> players = new ArrayList<Player>();
    public static List<Player> spectators = new ArrayList<Player>();
    public static String prefix = ChatColor.GRAY + "[" + ChatColor.GREEN + "SurvivalGames" + ChatColor.GRAY + "] ";
    public static Integer gameMin = 30;
    public static Integer gameSec = 0;
    public static Integer lobbySec = 30;
    public static Integer settingUpSec = 60;
    public static Integer deathmatchMin = 3;
    public static Integer deathmatchSec = 0;
    public static SurvivalGames sg;
    public static List<Player> getPlayers() {
        return players;
    }

    public static List<Player> getSpectators() {
        return spectators;
    }

    public static String getPrefix() {
        return prefix;
    }

    public static String getGameTime(){
        return ChatColor.GREEN.toString() + gameMin + ChatColor.GRAY + ":" + ChatColor.GREEN + gameSec;
    }

    @Override
    public void onEnable() {
        getLogger().info("[SurvivalGames] Enabled!");
    }

    @Override
    public void onDisable(){
        getLogger().info("[SurvivalGames] Disabled!");
    }

    public static SurvivalGames getInstance(){
        return sg;
    }

}


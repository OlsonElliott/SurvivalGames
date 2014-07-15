package me.elliottolson.plugins.survivalgames.GameManager.Countdowns;

import me.elliottolson.plugins.survivalgames.SurvivalGames;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Copyright Elliott Olson (c) 2014. All Rights Reserved.
 * Any code contained within this document, and any associated APIs with similar brandings
 * are the sole property of Elliott Olson. Distribution, reproduction, taking snippits, or
 * claiming any contents as your own will break the terms of the license, and void any
 * agreements with you, the third party.
 */
public class Lobby extends JavaPlugin{

    public static void countdown(){
        Bukkit.getScheduler().scheduleSyncRepeatingTask(SurvivalGames.getInstance(), new Runnable() {
            @Override
            public void run() {
                if (Bukkit.getOnlinePlayers().length > 6){
                    SurvivalGames.lobbySec--;
                    //Add Scoreboard
                    if (SurvivalGames.lobbySec == 15){
                        //Alert players
                        //Choose Map
                    }
                    if (SurvivalGames.lobbySec == 5){
                        //Alert players
                    }
                    if (SurvivalGames.lobbySec == 3){
                        //Download map
                    }
                    if (SurvivalGames.lobbySec == 2){

                    }
                    if (SurvivalGames.lobbySec == 1){

                    }
                    if (SurvivalGames.lobbySec == 0){
                        //Set Game Status to Waiting
                        //Teleport players
                        for (Player all : Bukkit.getOnlinePlayers()){

                        }
                        //Add them to tributes
                        //Apply Scoreboard
                    }
                }
            }
        }, 0, 20);
    }

    private void teleportPlayers(){
        for (int i=0; i <= Bukkit.getOnlinePlayers().length; i++){

        }
    }

}

package com.xurame.mavenplugincommands;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.xurame.mavenplugin.MavenPlugin;


public class KillCommand implements CommandExecutor {

	public static MavenPlugin plugin;

	public KillCommand(MavenPlugin instance) {
		plugin = instance;
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) {
		// TODO Auto-generated method stub
		if(cmd.getName().equalsIgnoreCase("boom")) {
			Player player = (Player) sender;
			player.getGameMode();
			player.setGameMode(GameMode.SURVIVAL); // Nothing shall protect you...mauahha!
			player.getWorld().createExplosion(player.getLocation(), 5);
			return true;
		}
		return false;
	}

}

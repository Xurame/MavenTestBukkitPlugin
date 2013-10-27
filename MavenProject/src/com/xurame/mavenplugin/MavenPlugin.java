package com.xurame.mavenplugin;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import com.xurame.mavenplugincommands.KillCommand;

public class MavenPlugin extends JavaPlugin implements Listener {
	public final KillCommand kc = new KillCommand(this);
	
	/**
	 * @author Xurame
	 * 
	 * A test maven plugin
	 */
	public void onEnable() {
		getCommand("boom").setExecutor(kc);
	}
}

package io.github.goadinggoat.ChickenNoSpawn;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class ChickenNoSpawn extends JavaPlugin {

	private ChickenNoSpawn instance;
	
	@Override
	public void onEnable() {
		instance = this;
		Bukkit.getPluginManager().registerEvents(new EggListener(instance), instance);
		
	}
	
	@Override
	public void onDisable() {
		
	}
}
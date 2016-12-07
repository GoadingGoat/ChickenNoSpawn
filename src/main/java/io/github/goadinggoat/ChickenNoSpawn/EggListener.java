package io.github.goadinggoat.ChickenNoSpawn;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.CreatureSpawnEvent.SpawnReason;

public class EggListener implements Listener {
	private ChickenNoSpawn plugin;

	public EggListener(ChickenNoSpawn pl) {
		plugin = pl;
	}

	@EventHandler
	public void EggLay(CreatureSpawnEvent e) {
		if (e.getSpawnReason().equals(SpawnReason.DISPENSE_EGG)||e.getSpawnReason().equals(SpawnReason.EGG)){
			e.setCancelled(true);
		}
	}
}
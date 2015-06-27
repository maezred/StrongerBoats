package net.moltendorf.Bukkit.StrongerBoats;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.vehicle.VehicleDestroyEvent;

/**
 * Created by moltendorf on 15/05/16.
 *
 * @author moltendorf
 */
public class Listeners implements Listener {
	@EventHandler(ignoreCancelled = true)
	public void VehicleDestroyEventHandler(VehicleDestroyEvent event) {
		if (event.getVehicle().getType() == EntityType.BOAT && event.getAttacker() == null) {
			event.setCancelled(true);
		}
	}
}

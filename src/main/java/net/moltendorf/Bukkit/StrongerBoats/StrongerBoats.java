package net.moltendorf.Bukkit.StrongerBoats;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by moltendorf on 15/05/16.
 *
 * @author moltendorf
 */
public class StrongerBoats extends JavaPlugin{
	private static StrongerBoats instance = null;

	public static StrongerBoats getInstance() {
		return instance;
	}

	@Override
	public void onEnable() {
		instance = this;

		getServer().getPluginManager().registerEvents(new Listeners(), this);
	}

	@Override
	public void onDisable() {
		instance = null;
	}
}

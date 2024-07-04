package plugin;

import org.bukkit.plugin.java.JavaPlugin;

public class NoAdvancementsInCreative extends JavaPlugin {

	private static NoAdvancementsInCreative plugin;
	public void onEnable() {

		plugin = this;

		getServer().getPluginManager().registerEvents(new Listeners(), this);
	}

	public static NoAdvancementsInCreative getPlugin() {

		return plugin;

	}
}

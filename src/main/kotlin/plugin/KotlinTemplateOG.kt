// This is free and unencumbered software released into the public domain.
// Author: Sekalol15
package plugin
import org.bukkit.plugin.java.JavaPlugin

// Extending this class is standard bukkit boilerplate for any plugin, or else the server software won't load the classes.
class KotlinTemplateOG : JavaPlugin() {
	
    companion object {
		
        lateinit var plugin: JavaPlugin
        
    }

    override fun onEnable() {

        plugin = this
        server.pluginManager.registerEvents(Listeners(), this)
        Config.load()

    }

}
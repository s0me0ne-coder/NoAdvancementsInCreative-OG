// This is free and unencumbered software released into the public domain.
// Author: Sekalol15
package plugin

import org.bukkit.Material
import org.bukkit.entity.EntityType
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.entity.CreatureSpawnEvent
import org.bukkit.event.entity.EntityDeathEvent
import org.bukkit.inventory.ItemStack

import kotlin.random.Random

class Listeners : Listener {
    @EventHandler
    fun templaterEvent(event: CreatureSpawnEvent) {

        val TemplateInt = Config.getTemplateInt()
        val TemplateBool = Config.getTemplateBool()
        val TemplateDouble = Config.getTemplateDouble()

    }


}






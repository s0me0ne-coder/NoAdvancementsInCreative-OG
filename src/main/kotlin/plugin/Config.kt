// This is free and unencumbered software released into the public domain.
// Author: Sekalol15
package plugin

import org.bukkit.configuration.file.FileConfiguration
import org.bukkit.configuration.file.YamlConfiguration
import java.io.File
object Config {
    private lateinit var config: FileConfiguration
    private lateinit var file: File

    fun load() {
        file = File(KotlinTemplateOG.plugin.dataFolder, "config.yml")
        if (!file.exists()) {
            KotlinTemplateOG.plugin.saveDefaultConfig()
        }

        config = YamlConfiguration.loadConfiguration(file)

        this.save()
    }

    private fun save() {
        config.save(file)
    }

    fun getTemplateBool(): Boolean {
        return config.get("templateBool") as Boolean
    }

    fun getTemplateDouble(): Double {
        return config.get("templateDouble") as Double
    }

    fun getTemplateInt(): Int {
        return config.get("templateInt") as Int
    }
}

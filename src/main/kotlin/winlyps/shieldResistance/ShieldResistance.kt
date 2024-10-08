package winlyps.shieldResistance

import org.bukkit.plugin.java.JavaPlugin

class ShieldResistance : JavaPlugin() {

    override fun onEnable() {
        // Plugin startup logic
        server.pluginManager.registerEvents(ShieldEventListener(this), this)
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}
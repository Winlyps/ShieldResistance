package winlyps.shieldResistance

import org.bukkit.Material
import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.block.Action
import org.bukkit.event.player.PlayerInteractEvent
import org.bukkit.plugin.Plugin
import org.bukkit.potion.PotionEffect
import org.bukkit.potion.PotionEffectType

class ShieldEventListener(private val plugin: Plugin) : Listener {

    @EventHandler
    fun onPlayerInteract(event: PlayerInteractEvent) {
        if (event.action == Action.RIGHT_CLICK_AIR || event.action == Action.RIGHT_CLICK_BLOCK) {
            val player: Player = event.player
            if (player.inventory.itemInMainHand.type == Material.SHIELD || player.inventory.itemInOffHand.type == Material.SHIELD) {
                applyResistanceEffect(player)
            }
        }
    }

    private fun applyResistanceEffect(player: Player) {
        player.addPotionEffect(PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 7 * 20, 0, false, false, false))
    }
}
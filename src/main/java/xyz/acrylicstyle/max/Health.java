package xyz.acrylicstyle.max;

import org.bukkit.Bukkit;
import org.bukkit.attribute.Attribute;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public class Health extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
        Objects.requireNonNull(e.getPlayer().getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(1);
    }

    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent e) {
        Objects.requireNonNull(e.getEntity().getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(1);
    }
}

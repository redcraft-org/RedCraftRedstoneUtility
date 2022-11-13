package org.redcraft;

import java.util.logging.Logger;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

/*
 * redstoneutility java plugin
 */
public class Plugin extends JavaPlugin
{
  private static final Logger LOGGER=Logger.getLogger("redstoneutility");

  public void onEnable()
  {
    LOGGER.info("redstoneutility enabled");
    SlabPlaceListener slabListener = new SlabPlaceListener();
    PluginManager pluginManager = getServer().getPluginManager();
    pluginManager.registerEvents(slabListener, this);
  }

  public void onDisable()
  {
    LOGGER.info("redstoneutility disabled");
  }
}

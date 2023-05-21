package org.redcraft.redcraftredstoneutility;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.redcraft.redcraftredstoneutility.listeners.SlabPlaceListener;

public class RedCraftRedstoneUtility extends JavaPlugin {

  @Override
  public void onEnable() {
    SlabPlaceListener slabListener = new SlabPlaceListener();
    PluginManager pluginManager = getServer().getPluginManager();
    pluginManager.registerEvents(slabListener, this);
  }
}

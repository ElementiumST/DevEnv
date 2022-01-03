package io.indie.de.features.util;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Util singleton
 * @author Igor.Stark
 */
public class Utils {
    /**
     *      Singleton instance
      */
    private static Utils instance;

    /**
     * instance of current JavaPlugin
     */
    private JavaPlugin javaPluginInstance;

    /**
     * private constructor
     */
    private Utils() {
        instance = this;
    }

    /**
     *  Singleton base getInstance function
     * @return instance of this singleton
     */
    public static Utils getInstance() {
        if (instance == null) {
            return new Utils();
        } else {
            return instance;
        }
    }

    /**
     * attach current javaPlugin instance on enabled
     * @param pluginInstance instance of current JavaPlugin
     */
    public void attachJavaPluginInstance(JavaPlugin pluginInstance) {
        javaPluginInstance = pluginInstance;
    }

    public JavaPlugin getJavaPluginInstance() {
        return javaPluginInstance;
    }

    /**
     *  Register new Event Handler without JavaPlugin instance calling.
     *  call only in Java plugin life circle.
     * @param eventHandler instance of class that impl base Bukkit Listener interface
     *
     */
    public void registerEventHandler(Listener eventHandler) {
        Bukkit.getServer().getPluginManager().registerEvents(eventHandler, javaPluginInstance);
    }
}

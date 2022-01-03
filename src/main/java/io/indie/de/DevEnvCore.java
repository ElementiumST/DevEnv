package io.indie.de;

import io.indie.de.features.polls.IPollsService;
import io.indie.de.features.polls.PollsService;
import io.indie.de.features.util.Utils;
import org.bukkit.plugin.java.JavaPlugin;


public final class DevEnvCore extends JavaPlugin {
    private IPollsService pollsService;

    @Override
    public void onEnable() {
        initUtilModules();
        initServices();

    }

    @Override
    public void onDisable() {
        pollsService.disable();
    }

    private void initUtilModules() {
        Utils.getInstance().attachJavaPluginInstance(this);
    }

    private void initServices() {
        pollsService = new PollsService();
        pollsService.initialize();
    }
}

package com.github.limpwurtlogin;

import com.github.limpwurtlogin.sound.Sound;
import com.github.limpwurtlogin.sound.SoundEngine;
import com.google.inject.Provides;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.events.GameStateChanged;
import net.runelite.client.callback.ClientThread;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import okhttp3.OkHttpClient;

import javax.inject.Inject;
import java.util.concurrent.ScheduledExecutorService;

@Slf4j
@PluginDescriptor(
        name = "Limpwurt Login",
        description = "Limpwurt announces when you login",
        tags = {"limpwurt", "login", "sound", "sounds", "announce"}
)

public class LimpwurtLoginPlugin extends Plugin {
    @Inject
    private Client client;

    @Getter(AccessLevel.PACKAGE)
    @Inject
    private ClientThread clientThread;

    @Inject
    private LimpwurtLoginConfig config;

    @Inject
    private ScheduledExecutorService executor;

    @Inject
    private OkHttpClient okHttpClient;

    @Inject
    private EventBus eventBus;

    @Inject
    private SoundEngine soundEngine;

    @Override
    protected void startUp() throws Exception {
        log.info("LimpwurtLogin has started");
    }

    @Override
    protected void shutDown() throws Exception {
        soundEngine.close();
        log.info("LimpwurtLogin has shut down");
    }

    @Subscribe
    public void onGameStateChanged(GameStateChanged gameStateChanged) {
        if (gameStateChanged.getGameState() == GameState.LOGGED_IN) {
            soundEngine.playClip(Sound.LOGGED_IN, executor);
        }
    }

    @Provides
    LimpwurtLoginConfig provideConfig(ConfigManager configManager) {
        return configManager.getConfig(LimpwurtLoginConfig.class);
    }
}

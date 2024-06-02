package com.github.limpwurtlogin;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.Range;

@ConfigGroup(LimpwurtLoginConfig.GROUP)
public interface LimpwurtLoginConfig extends Config {
    String GROUP = "limpwurtlogin";

    @Range(
            min = 0,
            max = 200
    )
    @ConfigItem(
            keyName = "loginVolume",
            name = "Login volume",
            description = "Adjust how loud the audio announcement is played!"
    )
    default int announcementVolume() {
        return 100;
    }
}

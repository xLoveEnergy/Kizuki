package com.example.modclient.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Environment(EnvType.CLIENT)
public class ModClientClient implements ClientModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("modclient/client");

    @Override
    public void onInitializeClient() {
        LOGGER.info("Mod Client initialized on client side!");
    }
}

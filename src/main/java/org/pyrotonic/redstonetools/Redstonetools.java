package org.pyrotonic.redstonetools;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Redstonetools implements ModInitializer {

    public static final String MOD_ID = "redstonetools";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    @Override
    public void onInitialize() {
        ItemInit.registerModItems();
    }
}

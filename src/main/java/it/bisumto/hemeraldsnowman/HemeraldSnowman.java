package it.bisumto.hemeraldsnowman;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HemeraldSnowman implements ModInitializer {
    public static final String MOD_ID = "hemerald-snowman";
    public static final String MOD_NAME = "Hemerald Snowman";
    public static final String MOD_VERSION = "1.0.0";
    public static final Logger LOG = LogManager.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOG.info("Loaded");
    }

}

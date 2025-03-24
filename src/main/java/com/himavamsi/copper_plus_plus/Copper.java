package com.himavamsi.copper_plus_plus;

import net.fabricmc.api.ModInitializer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Copper implements ModInitializer {
	public static final String MOD_ID = "copper_plus_plus";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		LOGGER.info("Hello from Copper++");
	}
}
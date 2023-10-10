package net.fabricmc.techmagic;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TechMagic implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("tech-magic");

	@Override
	public void onInitialize() {
		LOGGER.info("Initialized Tech Magic");
	}
}

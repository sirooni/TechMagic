package net.fabricmc.techmagic;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.techmagic.items.TechMagicItemGroup;
import net.fabricmc.techmagic.items.ThunderWandItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TechMagic implements ModInitializer {
	public static final String MOD_ID = "tech-magic";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static final Item THUNDER_WAND = new ThunderWandItem(new FabricItemSettings().group(TechMagicItemGroup.ITEM_GROUP));
	@Override
	public void onInitialize() {
		Registry.register(Registry.REGISTRIES.ITEM, new Identifier(MOD_ID, "thunder_wand"), THUNDER_WAND);

		LOGGER.info("Initialized Tech Magic");
	}
}

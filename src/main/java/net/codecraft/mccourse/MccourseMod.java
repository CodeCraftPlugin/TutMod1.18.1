package net.codecraft.mccourse;

import net.codecraft.mccourse.blocks.ModBlock;
import net.codecraft.mccourse.blocks.entity.BlockEntity;
import net.codecraft.mccourse.enchantment.ModEnchantments;
import net.codecraft.mccourse.item.ModItem;
import net.codecraft.mccourse.painting.Paintings;
import net.codecraft.mccourse.utils.LoottablesModifier;
import net.codecraft.mccourse.utils.ModRegistries;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MccourseMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MOD_ID = "mccourse";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution
		ModBlock.registerModBlock();
		ModItem.registerModItem();
		ModRegistries.registerModStuffs();
		ModEnchantments.registerMccourseEnchantment();
		LoottablesModifier.modifyLootTables();
		Paintings.registerPaintings();
		BlockEntity.registeredAllBlockEntity();

		LOGGER.info("Hello Fabric world!");
	}
}

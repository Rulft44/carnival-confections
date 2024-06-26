package net.rulft.carnivalconfections;

import net.fabricmc.api.ModInitializer;

import net.rulft.carnivalconfections.effect.ModEffects;

import net.rulft.carnivalconfections.init.ModFoods;
import net.rulft.carnivalconfections.init.ModItemGroups;
import net.rulft.carnivalconfections.init.ModItems;
import net.rulft.carnivalconfections.init.ModTags;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CarnivalConfections implements ModInitializer {
	public static final String MOD_ID = "carnivalconfections";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Sigmas! We rizzing Baby Gronk with this one! :fire::fire::fire:");
		ModItems.registerModItems();
		ModFoods.registerModFoods();

		ModItemGroups.registerItemGroups();

		//ModEffects.registerEffects();
	}
}
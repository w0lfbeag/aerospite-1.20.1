package net.wolfbeag.aerospite;

import net.fabricmc.api.ModInitializer;

import net.wolfbeag.aerospite.item.ModItems;
import net.wolfbeag.aerospite.item.ModItemsGroups;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Aerospite implements ModInitializer {
public static final String MOD_ID = "aerospite";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItemsGroups.registerItemGroups();
		ModItems.registerModItems();
	}
}
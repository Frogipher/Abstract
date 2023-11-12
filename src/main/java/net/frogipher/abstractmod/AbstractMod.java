package net.frogipher.abstractmod;

import net.fabricmc.api.ModInitializer;

import net.frogipher.abstractmod.block.ModBlocks;
import net.frogipher.abstractmod.item.ModItemGroup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AbstractMod implements ModInitializer {
	public static final String MOD_ID = "abstractmod";
    public static final Logger LOGGER = LoggerFactory.getLogger("abstractmod");

	@Override
	public void onInitialize() {

		ModBlocks.registerModBlocks();
		ModItemGroup.registerItemGroups();
	}
}
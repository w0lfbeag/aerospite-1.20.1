package net.wolfbeag.aerospite.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.color.block.BlockColors;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.wolfbeag.aerospite.Aerospite;

public class ModBlocks {
    public static final Block AEROSHARD_ORE = registerBlock("aeroshard_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE)));
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Aerospite.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(Aerospite.MOD_ID, name),
        new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks(){
        Aerospite.LOGGER.info("Registering ModBlocks for " + Aerospite.MOD_ID);
    }
}

package net.wolfbeag.aerospite.item;

import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.wolfbeag.aerospite.Aerospite;

public class ModItems {
    public static final Item AEROSHARD = registerItem("aeroshard", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientsTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(AEROSHARD);
    }
    private static Item registerItem(String name, Item item) {
            return Registry.register(Registries.ITEM, new Identifier(Aerospite.MOD_ID, name), item);
    }

    public static void registerModItems(){
    Aerospite.LOGGER.info("Registering Mod Items " + Aerospite.MOD_ID);
    ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientsTabItemGroup);
    }


}

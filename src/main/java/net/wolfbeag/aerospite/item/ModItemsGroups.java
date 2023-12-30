package net.wolfbeag.aerospite.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.wolfbeag.aerospite.Aerospite;

public class ModItemsGroups {
    public static final ItemGroup AEROSPITE = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Aerospite.MOD_ID, "aerospite"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.aerospite"))
                    .icon(() -> new ItemStack(ModItems.AEROSHARD)).entries((displayContext, entries) -> {
                    entries.add(ModItems.AEROSHARD);

                    }).build());
    public static void registerItemGroups(){
        Aerospite.LOGGER.info("registering item groups for" +Aerospite.MOD_ID);
    }
}

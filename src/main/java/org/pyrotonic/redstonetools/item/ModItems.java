package org.pyrotonic.redstonetools.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.pyrotonic.redstonetools.Redstonetools;

public class ModItems {

    public static final Item REDSTONE_SWORD = registerItem("redstone_sword", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
       return Registry.register(Registries.ITEM, Identifier.of(Redstonetools.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Redstonetools.LOGGER.info("Registering items!");
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
            entries.add(REDSTONE_SWORD);
        });
    }
}

package org.pyrotonic.redstonetools;


import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.pyrotonic.redstonetools.enums.RedstoneMaterial;

import static net.minecraft.item.Items.register;

public class ItemInit {
    public static final SwordItem REDSTONE_SWORD = (SwordItem) registerItem("redstone_sword",
            new SwordItem(RedstoneMaterial.REDSTONE, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(RedstoneMaterial.REDSTONE, 7, -2.6f))));

    public static final AxeItem REDSTONE_AXE = (AxeItem) registerItem("redstone_axe",
            new AxeItem(RedstoneMaterial.REDSTONE, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(RedstoneMaterial.REDSTONE, 5, -3.3f))));

    public static final PickaxeItem REDSTONE_PICKAXE = (PickaxeItem) registerItem("redstone_pickaxe",
            new PickaxeItem(RedstoneMaterial.REDSTONE, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(RedstoneMaterial.REDSTONE, 3, -2.8f))));

    public static final ShovelItem REDSTONE_SHOVEL = (ShovelItem) registerItem("redstone_shovel",
            new ShovelItem(RedstoneMaterial.REDSTONE, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(RedstoneMaterial.REDSTONE, 2, -3.0f))));

    public static final HoeItem REDSTONE_HOE = (HoeItem) registerItem("redstone_hoe",
            new HoeItem(RedstoneMaterial.REDSTONE, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(RedstoneMaterial.REDSTONE, 3, -2.0f))));

    public static final Item REDSTONE_CORE = registerItem("redstone_core",
            new Item(new Item.Settings()));


    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Redstonetools.MOD_ID, name), item);
    }
    public static void registerModItems() {
        Redstonetools.LOGGER.info("Registering mod items!");
    }

}

package org.pyrotonic.redstonetools.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ItemGroupInit {
    public static final ItemGroup REDSTONE_TOOLS = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ItemInit.REDSTONE_SWORD))
            .displayName(Text.translatable("itemGroup.redstonetools.redstone_tools_group"))
            .entries((context, entries) -> {
                entries.add(ItemInit.REDSTONE_SWORD);
                entries.add(ItemInit.REDSTONE_AXE);
                entries.add(ItemInit.REDSTONE_PICKAXE);
                entries.add(ItemInit.REDSTONE_SHOVEL);
                entries.add(ItemInit.REDSTONE_HOE);
                entries.add(ItemInit.REDSTONE_CORE);
            })
            .build();
    public static void registerGroups() {
        Registry.register(Registries.ITEM_GROUP, Identifier.of("redstonetools", "redstonetools_group"), REDSTONE_TOOLS);
    }
}

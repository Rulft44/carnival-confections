package net.rulft.carnivalconfections.init;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.rulft.carnivalconfections.CarnivalConfections;

public class ModItems {

    public static final Item CARAMEL = registerItem("caramel", new Item(new Item.Settings()));


    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        // Example:
        // entries.add(CANDY);
        entries.add(CARAMEL);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(CarnivalConfections.MOD_ID, name), item);
    }

    public static void registerModItems() {
        // CarnivalConfections.LOGGER.info("Registering Mod Items for " + CarnivalConfections.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}

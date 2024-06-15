package net.rulft.carnivalconfections.init;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.rulft.carnivalconfections.CarnivalConfections;

public class ModFoods {

    public static final Item CANDIED_APPLE = registerItem("candied_apple", new Item(new Item.Settings().food(ModFoodComponents.CANDIED_APPLE)));
    public static final Item CANDY = registerItem("candy", new Item(new Item.Settings().food(ModFoodComponents.CANDY)));


    private static void addItemsToFoodItemGroup(FabricItemGroupEntries entries) {
        entries.add(CANDIED_APPLE);
        entries.add(CANDY);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(CarnivalConfections.MOD_ID, name), item);
    }

    public static void registerModFoods() {
        // CarnivalConfections.LOGGER.info("Registering Mod Foods for " + CarnivalConfections.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModFoods::addItemsToFoodItemGroup);
    }
}

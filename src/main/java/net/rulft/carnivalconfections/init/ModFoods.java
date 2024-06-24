package net.rulft.carnivalconfections.init;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.rulft.carnivalconfections.CarnivalConfections;
import net.rulft.carnivalconfections.custom.Popcorn;

public class ModFoods {

    public static final Item CANDIED_APPLE = registerItem("candied_apple", new Item(new Item.Settings().maxCount(1).maxDamage(5).food(ModFoodComponents.CANDIED_APPLE)));
    public static final Item POPCORN = registerItem("popcorn", new Popcorn(new Item.Settings().maxDamage(6).food(ModFoodComponents.POPCORN),6));
    public static final Item STRONG_CANDY = registerItem("strong_candy", new Item(new Item.Settings().food(ModFoodComponents.STRONG_CANDY)));
    public static final Item ENERGETIC_CANDY = registerItem("energetic_candy", new Item(new Item.Settings().food(ModFoodComponents.ENERGETIC_CANDY)));
    public static final Item SPECIAL_CANDY = registerItem("special_candy", new Item(new Item.Settings().food(ModFoodComponents.SPECIAL_CANDY)));
    //public static final Item WISP_CANDY = registerItem("wisp_candy", new Item(new Item.Settings().food(ModFoodComponents.WISP_CANDY)));


    private static void addItemsToFoodItemGroup(FabricItemGroupEntries entries) {
        entries.add(STRONG_CANDY);
        entries.add(ENERGETIC_CANDY);
        entries.add(SPECIAL_CANDY);
        //entries.add(WISP_CANDY);
        entries.add(CANDIED_APPLE);
        entries.add(POPCORN);

    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(CarnivalConfections.MOD_ID, name), item);
    }

    public static void registerModFoods() {
        // CarnivalConfections.LOGGER.info("Registering Mod Foods for " + CarnivalConfections.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModFoods::addItemsToFoodItemGroup);
    }
}

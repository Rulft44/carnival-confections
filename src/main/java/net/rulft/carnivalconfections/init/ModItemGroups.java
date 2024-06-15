package net.rulft.carnivalconfections.init;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.rulft.carnivalconfections.CarnivalConfections;

public class ModItemGroups {
    public static final ItemGroup CARNIVAL_CONFECTIONS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(CarnivalConfections.MOD_ID, "carnivalconfections"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.carnivalconfections"))
                    .icon(() -> new ItemStack(ModFoods.CANDY)).entries((displayContext, entries) -> {
                        entries.add(ModFoods.CANDY);
                        entries.add(ModFoods.CANDIED_APPLE);
                    }).build());


    public static void registerItemGroups() {
        // CarnivalConfections.LOGGER.info("Registering Item Groups for " + CarnivalConfections.MOD_ID);
    }
}

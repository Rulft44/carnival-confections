package net.rulft.carnivalconfections.init;


import com.mojang.datafixers.types.templates.Tag;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.rulft.carnivalconfections.CarnivalConfections;

public class ModTags {

    public static class Blocks {
        public static final TagKey<Block> NOT_PASSTROUGH_BLOCKS = createTag("not_passtrough_blocks");


        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(CarnivalConfections.MOD_ID, name));
        }

    }
}

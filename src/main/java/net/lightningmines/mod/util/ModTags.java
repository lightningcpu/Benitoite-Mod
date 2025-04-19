package net.lightningmines.mod.util;

import net.lightningmines.mod.BenitoiteMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_BENITOITE_TOOL =
                createTag("needs_benitoite_tool");

        public static final TagKey<Block> INCORRECT_FOR_BENITOITE_TOOL =
                createTag("incorrect_for_benitoite_tool");

        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(BenitoiteMod.MOD_ID, name));
        }
    }

    public static class Items {
        // In ModTags.Items class add:
        public static final TagKey<Item> BENITOITE_TOOLS = createTag("benitoite_tools");

        public static final TagKey<Item> BENITOITE_ARMOR = createTag("benitoite_armor");

        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(BenitoiteMod.MOD_ID, name));
        }
    }
}

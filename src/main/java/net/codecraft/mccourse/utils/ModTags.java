package net.codecraft.mccourse.utils;
import net.codecraft.mccourse.MccourseMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.Tag;
import net.minecraft.tag.TagGroup;
import net.minecraft.tag.TagManager;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {
        public static final Tag.Identified<Block> VALUABLEBLOCKS =
                createTag("valuableblocks");
        public static final Tag.Identified<Block> PAXEL =
                createTag("mineable/paxel");
        public static final Tag.Identified<Block> STEEL_BLOCKS =
                createCommonTag("steel_blocks");
        public static final Tag.Identified<Block> STEEL_ORES =
                createCommonTag("steel_ores");


        private static Tag.Identified<Block> createTag(String name) {
            return TagManager.BLOCK.create(new Identifier(MccourseMod.MOD_ID, name));
        }

        private static Tag.Identified<Block> createCommonTag(String name) {
            return Tag.BLOCK.create(new Identifier("c", name));
        }
    }

    public static class Items {
        public static final Tag.Identified<Item> STEEL_INGOTS = createCommonTag("steel_ingots");
        public static final Tag.Identified<Item> STEEL_NUGGETS = createCommonTag("steel_nuggets");

        private static Tag.Identified<Item> createTag(String name) {
            return TagFactory.ITEM.create(new Identifier(MccourseMod.MOD_ID, name));
        }

        private static Tag.Identified<Item> createCommonTag(String name) {
            return TagFactory.ITEM.create(new Identifier("c", name));
        }
    }
}
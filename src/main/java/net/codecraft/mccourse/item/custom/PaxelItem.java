package net.codecraft.mccourse.item.custom;

import net.codecraft.mccourse.utils.ModTags;
import net.minecraft.block.Block;
import net.minecraft.item.MiningToolItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.tag.Tag;

public class PaxelItem extends MiningToolItem {
    public PaxelItem(ToolMaterial material,float attackDamage, float attackSpeed,Settings settings) {
        super(attackDamage, attackSpeed, material, ModTags.Blocks.PAXEL,settings);
    }
}

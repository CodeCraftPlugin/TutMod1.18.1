package net.codecraft.mccourse.item.custom;

import net.codecraft.mccourse.item.*;
import net.codecraft.mccourse.sound.Sounds;
import net.codecraft.mccourse.utils.InventoryUtil;
import net.codecraft.mccourse.utils.ModTags;
import net.minecraft.block.Block;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.nbt.*;
import net.minecraft.sound.SoundCategory;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class DowsingRodItem extends Item {
    public DowsingRodItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        if(context.getWorld().isClient()) {
            BlockPos positionClicked = context.getBlockPos();
            PlayerEntity player = context.getPlayer();
            boolean foundBlock = false;

            for(int i = 0; i <= positionClicked.getY()+ 64; i++) {
                Block blockBelow = context.getWorld().getBlockState(positionClicked.down(i)).getBlock();

                if(isValuableBlock(blockBelow)) {
                    outputValuableCoordinates(positionClicked, player, blockBelow, positionClicked.getY()- i);
                    foundBlock = true;

                    if (InventoryUtil.hasPlayerStackInInventory(player,ModItem.DATA_TABLET)){
                        addNbtToDataTablet(player,positionClicked.add(0,-i,0),blockBelow);
                    }
                    context.getWorld().playSound(player, positionClicked, Sounds.DOWSING_ROD_FOUND_ORE,
                            SoundCategory.BLOCKS, 1f, 1f);
                    break;
                }
            }

            if(!foundBlock) {
                player.sendMessage(new TranslatableText("item.mccourse.dowsing_rod.no_valuables"), false);
            }
        }

        context.getStack().damage(1, context.getPlayer(),
                (player) -> player.sendToolBreakStatus(player.getActiveHand()));

        return super.useOnBlock(context);
    }

    private void outputValuableCoordinates(BlockPos blockPos, PlayerEntity player, Block blockBelow,int yFound) {
        player.sendMessage(new LiteralText("Found " + blockBelow.asItem().getName().getString() + " at " +
                "(" + blockPos.getX() + ", " + yFound + "," + blockPos.getZ() + ")"), false);
    }
    private void addNbtToDataTablet(PlayerEntity player, BlockPos pos, Block blockBelow) {
        ItemStack dataTablet =
                player.getInventory().getStack(InventoryUtil.getFirstInventoryIndex(player, ModItem.DATA_TABLET));

        NbtCompound nbtData = new NbtCompound();
        nbtData.putString("mccourse.last_ore", "Found " + blockBelow.asItem().getName().getString() + " at (" +
                pos.getX() + ", "+ pos.getY() + ", "+ pos.getZ() + ")");

        dataTablet.setNbt(nbtData);
    }

    private boolean isValuableBlock(Block block) {
        return ModTags.Blocks.VALUABLEBLOCKS.contains(block);
    }
    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if(Screen.hasShiftDown()) {
            tooltip.add(new TranslatableText("item.mccourse.dowsing_rode.tooltip.shift"));
        } else {
            tooltip.add(new TranslatableText("item.mccourse.dowsing_rode.tooltip"));
        }
    }

}


package net.codecraft.mccourse.blocks.entity;


import net.codecraft.mccourse.item.ModItem;
import net.codecraft.mccourse.screen.SteelMakerScreenHandler;
import net.codecraft.mccourse.utils.ImplementedInventory;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class SteelMaker extends BlockEntity implements NamedScreenHandlerFactory, ImplementedInventory {
    private final DefaultedList<ItemStack> inventory = DefaultedList.ofSize(4,ItemStack.EMPTY);

    public SteelMaker(BlockPos pos, BlockState state) {
        super(net.codecraft.mccourse.blocks.entity.BlockEntity.STEEL_MAKER, pos, state);
    }

    /**
     * Gets the item list of this inventory.
     * Must return the same instance every time it's called.
     *
     * @return the item list
     */
    @Override
    public DefaultedList<ItemStack> getItems() {

        return inventory;
    }

    /**
     * Returns the title of this screen handler; will be a part of the open
     * screen packet sent to the client.
     */
    @Override
    public Text getDisplayName() {
        return new LiteralText("Steel Maker");
    }

    @Nullable
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory inv, PlayerEntity player) {
        return new SteelMakerScreenHandler(syncId,inv,this);
    }


    public static void tick(World world, BlockPos pos, BlockState state, SteelMaker entity) {
        if(hasRecipe(entity) && hasNotReachedStackLimit(entity)) {
            craftItem(entity);
        }
    }

    private static void craftItem(SteelMaker entity) {
        entity.removeStack(0, 1);
        entity.removeStack(1, 1);
        entity.removeStack(2, 1);

        entity.setStack(3, new ItemStack(ModItem.STEEL_PICKAXE,
                entity.getStack(3).getCount() + 1));
    }

    private static boolean hasRecipe(SteelMaker entity) {
        boolean hasItemInFirstSlot = entity.getStack(0).getItem() == ModItem.COAL_SLIVER;
        boolean hasItemInSecondSlot = entity.getStack(1).getItem() == Items.GOLDEN_PICKAXE;
        boolean hasItemInThirdSlot = entity.getStack(2).getItem() == ModItem.STEEL_INGOT;

        return hasItemInFirstSlot && hasItemInSecondSlot && hasItemInThirdSlot;
    }

    private static boolean hasNotReachedStackLimit(SteelMaker entity) {
        return entity.getStack(3).getCount() < entity.getStack(3).getMaxCount();
    }
}

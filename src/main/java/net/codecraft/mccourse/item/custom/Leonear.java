package net.codecraft.mccourse.item.custom;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Leonear extends Item {
    public Leonear(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        world(user, hand);
        return super.use(world, user, hand);
    }

    @Override
    public ActionResult useOnEntity(ItemStack stack, PlayerEntity user, LivingEntity entity, Hand hand) {
        world(user, hand);
        return super.useOnEntity(stack, user, entity, hand);
    }

    private void world(PlayerEntity user, Hand hand) {
        if(!(user.world.isClient())){
            ServerWorld serverWorld = ((ServerWorld) user.world);
            if(hand==Hand.MAIN_HAND){
                BlockPos pos = new BlockPos(user.getX(),user.getY(),user.getZ()+2);
                EntityType.LIGHTNING_BOLT.spawn(serverWorld,null,null,user,pos, SpawnReason.TRIGGERED,true,true);
            }
        }
    }
}

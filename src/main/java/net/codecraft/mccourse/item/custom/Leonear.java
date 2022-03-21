package net.codecraft.mccourse.item.custom;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
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
        if(!(user.world.isClient())){
            ServerWorld serverWorld = ((ServerWorld) user.world);
            if(hand==Hand.MAIN_HAND){
                BlockPos pos = new BlockPos(user.getX()+1,user.getY(),user.getZ());
                EntityType.LIGHTNING_BOLT.spawn(serverWorld,null,null,user,pos,SpawnReason.TRIGGERED,true,true);
            }
        }

        return super.use(world, user, hand);
    }
}

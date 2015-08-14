package com.annelieseschools.minecraft;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSponge;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class Trampoline extends BaseEvent {

	@SubscribeEvent
	public void onPlayerTick(TickEvent.PlayerTickEvent event) {
		EntityPlayer player = event.player;
		World world = event.player.worldObj;

		// 
		// First thing we need to do is check
		// what block is under the entity feet
		//
		// Block underBlock = getBelowBlock(world, player);
		//
		// And then if the block is NOT a sponge, we return
		//
		// if(!(underBlock instanceof BlockSponge)) {
		// 		return;
		// }
		//
		// if it is then our player can jump and that jump will be ... high
		//
		//		player.jump();
		//		player.motionY *= 5;

	}
}

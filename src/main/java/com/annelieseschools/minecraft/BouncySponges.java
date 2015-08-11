package com.annelieseschools.minecraft;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraftforge.event.entity.living.LivingEvent.LivingJumpEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class BouncySponges {

	@SubscribeEvent
	public void bounce(LivingJumpEvent event) {
		if(!(event.entity instanceof Entity)) {
			return;
		}
		
		Block underBlock = event.entity.worldObj.getBlockState(
				new BlockPos(((int)Math.floor(event.entity.posX)),
						((int)Math.floor(event.entity.posY)) - 1,
						((int)Math.floor(event.entity.posZ)))).getBlock();
		
		if(underBlock != Blocks.sponge) {
			return;
		}

		event.entity.motionY *= 5;
			
	}
}

package com.annelieseschools.minecraft;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSponge;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class SpeedTicker extends BaseEvent {

	@SubscribeEvent
	public void onPlayerTick(TickEvent.PlayerTickEvent event) {
		EntityPlayer player = event.player;
		World world = event.player.worldObj;

		Block underBlock = world.getBlockState(
				new BlockPos(((int)Math.floor(player.posX)),
						((int)Math.floor(player.posY)) - 1,
						((int)Math.floor(player.posZ)))).getBlock();
		
		
//		System.out.println("blocks:"+underBlock);
		
		if(!(underBlock instanceof BlockSponge)) {
			return;
		}

		player.jump();
		player.motionY *= 5;
		
		/*
		ItemStack itemOnFoot = event.player.inventory.armorItemInSlot(0);
		if (itemOnFoot!=null && Item.getIdFromItem(itemOnFoot.getItem()) == Item.getIdFromItem(Items.leather_boots)) {
			event.player.capabilities.setPlayerWalkSpeed(5.0f);
		} else {
			event.player.capabilities.setPlayerWalkSpeed(0.1f);
		}
		*/
	}
}
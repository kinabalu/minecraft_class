package com.annelieseschools.minecraft;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingEvent.LivingJumpEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class SuperJump extends BaseEvent {

	private int diamondBootsId;
	public SuperJump() {
		diamondBootsId = Item.getIdFromItem(Items.diamond_boots);
	}
	
	@SubscribeEvent
	public void makeJumpHigher(LivingJumpEvent event) {
		Entity entity = getEntityFromEvent(event);

		if(!(event.entity instanceof EntityPlayer)) {
			return;
		}
		
		entity.motionY *= SuperJumpCommand.multiplyFactor;
		
		// 
		// First thing we do is make sure this is a player
		// (NOTE: other things in minecraft jump, or bounce, so we can make pigs jump very high)
		//
		// then all we have to do is change the players Y motion (up and down) and multiply it 
		// by another value
		//
		// Here we'll multiply it by 5
		//
		// entity.motionY *= 5.0f;
		//
		// We can also check to see if the player is equipped with specific armor by check the armorItemInSlot
		//
		// Like so: 
		//
		// ItemStack itemOnFoot = ((EntityPlayer)event.entity).inventory.armorItemInSlot(0);
		// if(itemOnFoot != null && Item.getIdFromItem(itemOnFoot.getItem()) == diamondBootsId) {
		//    do something like super jump
		// }		
	}
}

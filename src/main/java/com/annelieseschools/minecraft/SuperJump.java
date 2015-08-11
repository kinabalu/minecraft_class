package com.annelieseschools.minecraft;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingEvent.LivingJumpEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class SuperJump {

	private int diamondBootsId;
	public SuperJump() {
		diamondBootsId = Item.getIdFromItem(Items.diamond_boots);
	}
	
	@SubscribeEvent
	public void makeJumpHigher(LivingJumpEvent event) {
		if(!(event.entity instanceof EntityPlayer)) {
			return;
		}
		
		if(event.entity instanceof EntityPlayer) {
			ItemStack itemOnFoot = ((EntityPlayer)event.entity).inventory.armorItemInSlot(0);
			if (itemOnFoot != null && Item.getIdFromItem(itemOnFoot.getItem()) == diamondBootsId) {
				event.entity.motionY *= 5.0f;							
			}
		}
	}
}

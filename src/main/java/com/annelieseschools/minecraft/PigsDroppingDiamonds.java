package com.annelieseschools.minecraft;

import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBow;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class PigsDroppingDiamonds extends BaseEvent {

	@SubscribeEvent
	public void event(LivingDeathEvent event) {
		Entity entity = getEntityFromEvent(event);
		
		if(entityIsNotA(entity, EntityPig.class)) {
			return;
		}
		
		if(isRunningLocal(event)) {
			dropItem(entity, Items.diamond, 5);
		}
		//
		// Check if Entity is a pig or not
		// - Class is an EntityPig.class
		// - If it's not a pig, return
		//
		// Method:
		// entityIsNotA(entity, EntityPig.class)
		// 
		// in the if statement "return"
		//
		// Ensure we are running a local game
		// - if(isRunningLocal(event)) {
		//    // code goes here
		// }
		// If running a local game drop item
		//
		// Method:
		// dropItem(entity, itemType, numberOfItems);
		//
		// Example item: Items.diamond
		//
		// Other items to drop available in Items.java
		// Ctrl-click the Items
		//
	}
}

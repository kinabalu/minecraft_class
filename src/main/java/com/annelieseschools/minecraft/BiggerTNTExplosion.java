package com.annelieseschools.minecraft;


import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.item.ItemExpireEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class BiggerTNTExplosion extends BaseEvent {

	float power = 32.0F;
	
	@SubscribeEvent
	public void event(EntityJoinWorldEvent event) {
		Entity entity = getEntityFromEvent(event);
		if(!(entity instanceof EntityTNTPrimed)) {
			return;
		}
		
		createExplosion(entity, power);
	}	
}
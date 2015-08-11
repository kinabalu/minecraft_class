package com.annelieseschools.minecraft;

import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.init.Items;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class PigsDroppingDiamonds extends BaseEvent {

	@SubscribeEvent
	public void event(LivingDeathEvent event) {
		Entity entity = event.entity;
		
		System.out.println("entity:" + entity);
		if(entityIsA(entity, EntityPig.class)) {
			System.out.println("entity is a pig!");
		}
		if(!(entity instanceof EntityPig)) {
			return;
		}

		if(isRunningLocal(entity)) {
			dropItem(entity, Items.diamond, 3);
		}
	}
}

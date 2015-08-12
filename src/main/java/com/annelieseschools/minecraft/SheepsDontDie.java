package com.annelieseschools.minecraft;

import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class SheepsDontDie extends BaseEvent {

	@SubscribeEvent
	public void sheepAreResilient(LivingDeathEvent event) {
		Entity entity = event.entity;
		if(entityIsNotA(entity, EntitySheep.class)) {
			return;
		}
		
		for(int i=0; i<5; i++) {
			EntitySheep sheep = new EntitySheep(event.entity.worldObj);
			spawnEntity(event, sheep);
		}
	}
	
}

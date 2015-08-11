package com.annelieseschools.minecraft;

import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class SheepsDontDie {

	@SubscribeEvent
	public void sheepAreResilient(LivingDeathEvent event) {
		if(!(event.entity instanceof EntitySheep)) {
			return;
		}
		
		Entity entity = event.entity;
		
		for(int i=0; i<5; i++) {
			EntitySheep sheep = new EntitySheep(event.entity.worldObj);
			sheep.setLocationAndAngles(event.entity.posX, event.entity.posY, event.entity.posZ, 0, 0);
			if(!event.entity.worldObj.isRemote) {
				event.entity.worldObj.spawnEntityInWorld(sheep);
			}
		}
	}
	
}

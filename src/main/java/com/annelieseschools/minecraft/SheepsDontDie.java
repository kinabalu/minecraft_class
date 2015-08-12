package com.annelieseschools.minecraft;

import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class SheepsDontDie extends BaseEvent {

	@SubscribeEvent
	public void sheepAreResilient(LivingDeathEvent event) {
		Entity entity = getEntityFromEvent(event);
		World world = getWorldFromEvent(event);
		
		if(!(entity instanceof EntitySheep)) {
			return;
		}
		
		//
		// We want to spawn an entity called a sheep
		// and we want to make more than one
		// so we'll use a loop which is a bit more
		// to write in java
		//
		// int i=0 - declares a variable and assigns it a value 0
		// i < 5   - says to stop only when value is less than 5
		// i++     - for every loop makes i increase it's value by 1
		//
		// for (int i=0; i<5; i++) {
		//    put code here
		// }
		//
		// then we'll create a sheep
		//
		// EntitySheep sheep = new EntitySheep(world);
		//
		// and then spawn it into the world
		// 
		// spawnEntity(event, sheep);
		//
		// you can do this with ANY animal

		// write code here based on the comments above
	}
	
}

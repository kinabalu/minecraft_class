package com.annelieseschools.minecraft;

import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class SpawnTamedHorse extends BaseEvent {

	@SubscribeEvent
	public void spawnTamedHorse(LivingDeathEvent event) {
		Entity entity = getEntityFromEvent(event);
		World world = getWorldFromEvent(event);
		
		if(!(entity instanceof EntityCow)) {
			return;
		}
				
		// 
		// We use the LivingDeathEvent as we did with PigsDroppingDiamonds
		//
		// The if statement on line 20 says that we kill a cow to get a tamed horse
		// and what we do next is we want to create a new Entity called a horse
		//
		// We do that with the following code:
		//
		// EntityHorse horse = new EntityHorse(world);
		// 
		// and if we just want to create that horse in our world
		//
		// spawnEntity(event, horse);
		//
		// we can also set properties on the horse
		//
		// horse.setHorseTamed(true);
		// horse.setHorseSaddled(true);
		// horse.setHorseArmorStack(new ItemStack(Items.diamond_horse_armor, 1));
		//
		// if you want to change these things, please do.  And I'll show you
		// where to get these properties and how you can change it to suit your needs
	}
	
}
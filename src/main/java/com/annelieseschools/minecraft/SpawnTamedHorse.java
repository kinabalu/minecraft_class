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
		
		EntityHorse horse = new EntityHorse(entity.worldObj);
		horse.setHorseTamed(true);
		horse.setHorseSaddled(true);
		horse.setHorseArmorStack(new ItemStack(Items.diamond_horse_armor, 1));
		//0 = Normal, 1 = Donkey, 2 = Mule, 3 = Undead Horse, 4 = Skeleton Horse
		//horse.setHorseType(1);
		
		spawnEntity(event, horse);
	}
	
}
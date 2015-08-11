package com.annelieseschools.minecraft;

import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class SpawnTamedHorse {

	@SubscribeEvent
	public void spawnTamedHorse(LivingDeathEvent event) {
		if(!(event.entity instanceof EntityCow)) {
			return;
		}
		
		Entity entity = event.entity;
		EntityHorse horse = new EntityHorse(event.entity.worldObj);
		horse.setHorseTamed(true);
		horse.setHorseSaddled(true);
		
		horse.setHorseArmorStack(new ItemStack(Items.diamond_horse_armor, 1));
		//0 = Normal, 1 = Donkey, 2 = Mule, 3 = Undead Horse, 4 = Skeleton Horse
		//horse.setHorseType(1);
		horse.setLocationAndAngles(event.entity.posX, event.entity.posY, event.entity.posZ, 0, 0);
		if(!event.entity.worldObj.isRemote) {
			event.entity.worldObj.spawnEntityInWorld(horse);
		}
	}
	
}
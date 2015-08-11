package com.annelieseschools.minecraft;

import net.minecraft.entity.passive.EntityPig;
import net.minecraft.init.Items;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class PigsDroppingDiamonds extends BaseEvent {

	@SubscribeEvent
	public void dropDiamonds(LivingDeathEvent event) {
		if(!(event.entity instanceof EntityPig)) {
			return;
		}

		if(isLocal(event.entity)) {
			createExplosion(event.entity);
			dropItem(event.entity, Items.diamond, 1);
		}
	}
}

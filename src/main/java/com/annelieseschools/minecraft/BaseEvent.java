package com.annelieseschools.minecraft;

import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.event.entity.EntityEvent;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;

public class BaseEvent {

	public void postMessage(BreakEvent event, EnumChatFormatting color, String message) {
		event.getPlayer().addChatComponentMessage(new ChatComponentText(color + message));				
	}
	
	public void createExplosion(Entity entity) {
		entity.worldObj.createExplosion(
				entity,
				entity.posX,
				entity.posY,
				entity.posZ,
				2,
				false);
	}
	
	public boolean isLocal(Entity entity) {
		return !entity.worldObj.isRemote;
	}
	
	public void dropItem(Entity entity, Item item, int dropCount) {
		entity.dropItem(item, dropCount);		
	}
	
	public boolean entityIsA(EntityEvent event, Entity entity) {
		if(!(event.entity.getClass().equals(entity))) {
			return false;
		}
		
		return true;
	}
}
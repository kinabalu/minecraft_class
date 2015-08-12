package com.annelieseschools.minecraft;

import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.EntityEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
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
	
	public boolean isRunningLocal(LivingEvent event) {
		return !event.entity.worldObj.isRemote;
	}
	
	public void dropItem(Entity entity, Item item, int dropCount) {
		entity.dropItem(item, dropCount);		
	}
	
	public boolean entityIsA(Entity entity, Class entityClass) {
		return entity.getClass().isInstance(entityClass);
	}
	
	public boolean entityIsNotA(Entity entity, Class entityClass) {
		return !entityIsA(entity, entityClass);
	}
	
	public Entity getEntityFromEvent(EntityEvent event) {
		return event.entity;
	}
	
	public World getWorldFromEvent(EntityEvent event) {
		return event.entity.worldObj;
	}
	
	public void spawnEntity(EntityEvent event, Entity newEntity) {
		newEntity.setLocationAndAngles(event.entity.posX, event.entity.posY, event.entity.posZ, 0, 0);
		if(!event.entity.worldObj.isRemote) {
			event.entity.worldObj.spawnEntityInWorld(newEntity);
		}		
	}
}
package com.annelieseschools.minecraft;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.event.entity.minecart.MinecartCollisionEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ExplodingMinecarts {

	@SubscribeEvent
	public void explode(MinecartCollisionEvent event) {
		EntityMinecart minecart = event.minecart;
//		minecart.worldObj.createExplosion(
//				minecart,
//				minecart.posX,
//				minecart.posY,
//				minecart.posZ,
//				2,
//				false);
		

//		System.out.println("You got into a minecart");
//		event.entity.addChatMessage(new ChatComponentText(EnumChatFormatting.RED + "You blew up a minecart!"));
	}
	
}

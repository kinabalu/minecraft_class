package com.annelieseschools.minecraft;

import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class BlockBreakMessage extends BaseEvent {

	String myMessage = "You broke a block!";
	
	@SubscribeEvent
	public void event(BreakEvent event) {
		postMessage(event, EnumChatFormatting.GOLD, myMessage);
	}
	
}

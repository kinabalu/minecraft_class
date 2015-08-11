package com.annelieseschools.minecraft;

import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class BlockBreakMessage extends BaseEvent {

	@SubscribeEvent
	public void event(BreakEvent event) {
		postMessage(event, TextColor.GOLD, "You broke a block!");
	}
	
}

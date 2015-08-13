package com.annelieseschools.minecraft;

import java.util.List;

import net.minecraft.init.Items;
import net.minecraft.inventory.Container;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class SpeedTicker extends BaseEvent {

	@SubscribeEvent
	public void onPlayerTick(TickEvent.PlayerTickEvent event) {
		ItemStack itemOnFoot = event.player.inventory.armorItemInSlot(0);
		if (itemOnFoot!=null && Item.getIdFromItem(itemOnFoot.getItem()) == Item.getIdFromItem(Items.leather_boots)) {
			event.player.capabilities.setPlayerWalkSpeed(5.0f);
		} else {
			event.player.capabilities.setPlayerWalkSpeed(0.1f);
		}
	}
}
package com.annelieseschools.minecraft;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class SpeedTicker extends BaseEvent {

	@SubscribeEvent
	public void onPlayerTick(TickEvent.PlayerTickEvent event) {
		EntityPlayer player = event.player;
		World world = event.player.worldObj;

		ItemStack itemOnFoot = event.player.inventory.armorItemInSlot(0);
		if (itemOnFoot!=null && Item.getIdFromItem(itemOnFoot.getItem()) == Item.getIdFromItem(Items.leather_boots)) {
			event.player.capabilities.setPlayerWalkSpeed(5.0f);
		} else {
			event.player.capabilities.setPlayerWalkSpeed(0.1f);
		}

	}
}
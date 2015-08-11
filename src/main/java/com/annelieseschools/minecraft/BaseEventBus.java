package com.annelieseschools.minecraft;

import net.minecraftforge.common.MinecraftForge;

public class BaseEventBus {

	public static void addMod(Object target) {
		MinecraftForge.EVENT_BUS.register(target);		
	}
}
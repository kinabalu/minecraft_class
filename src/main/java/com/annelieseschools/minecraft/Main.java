package com.annelieseschools.minecraft;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

@Mod(modid="AndrewMods", version="1.8")
public class Main extends BaseEventBus {

	/**
	 * In order to add a new mod to our list we'll use
	 * the method addMod
	 * 
	 * addMod(new BlockBreakMessage());
	 * 
	 */
	@EventHandler
	public void init(FMLInitializationEvent event) {
		addMod(new BlockBreakMessage());
		addMod(new PigsDroppingDiamonds());
		addMod(new BiggerTNTExplosion());
		addMod(new SheepsDontDie());
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
        FMLCommonHandler.instance().bus().register(new SpeedTicker());
        MinecraftForge.EVENT_BUS.register(new SpeedTicker());		
	}
	
	
	@EventHandler
	public void registerCommands(FMLServerStartingEvent event) {
		event.registerServerCommand(new FlamingPigs());
	}
	
}

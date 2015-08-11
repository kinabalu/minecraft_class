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

	@EventHandler
	public void init(FMLInitializationEvent event) {
		addMad(new BlockBreakMessage());
		addMad(new PigsDroppingDiamonds());
//		MinecraftForge.EVENT_BUS.register(new ExplodingMinecarts());
//		MinecraftForge.EVENT_BUS.register(new DiamondOreTrap());
//		MinecraftForge.EVENT_BUS.register(new BiggerTNTExplosion());
//		MinecraftForge.EVENT_BUS.register(new SuperJump());
//		MinecraftForge.EVENT_BUS.register(new SheepsDontDie());
//		MinecraftForge.EVENT_BUS.register(new SpawnTamedHorse());
//		MinecraftForge.EVENT_BUS.register(new BouncySponges());
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

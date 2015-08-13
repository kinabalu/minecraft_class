package com.annelieseschools.minecraft;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;

public class FlamingPigs extends BaseCommand {

	private int numberOfPigs = 0;
	
	public FlamingPigs() {
		super("Flaming Pigs", "/flamingpigs <number of pigs>");
		addAlias("flamingpigs");
		addAlias("fp");
	}
	
	@Override
	public void execute(ICommandSender sender, String[] args) {
		if(args.length != 1) {
			sendErrorMessage(sender, "Invalid number of arguments!");
			return;
		}
		
		try {
			numberOfPigs = Integer.parseInt(args[0]);			
		} catch(NumberFormatException e) {
			sendErrorMessage(sender, "The argument \"" + args[0] + "\" is not a valid number!");
			return;
		}
		
		EntityPlayer player = (EntityPlayer) sender;
		
		for(int i=0; i<numberOfPigs; i++) {
			EntityPig pig = new EntityPig(player.worldObj);
			pig.setLocationAndAngles(player.posX,  player.posY, player.posZ, 0, 0);
			pig.setFire(10000);;
			player.worldObj.spawnEntityInWorld(pig);
		}
		
	}
	
}

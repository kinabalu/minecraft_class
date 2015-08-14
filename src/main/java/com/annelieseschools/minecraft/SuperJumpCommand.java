package com.annelieseschools.minecraft;

import net.minecraft.command.ICommandSender;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;

public class SuperJumpCommand extends BaseCommand {

	public static float multiplyFactor = 5.0f;
	
	public SuperJumpCommand() {
		super("Super Jump Multiply", "/superjump <multiply factor>");
		addAlias("superjump");
		addAlias("sj");
	}
	
	@Override
	public void execute(ICommandSender sender, String[] args) {
		if(args.length != 1) {
			sendErrorMessage(sender, "Invalid number of arguments!");
			return;
		}
		
		try {
			int factor = Integer.parseInt(args[0]);
			multiplyFactor = (float)factor;
		} catch(NumberFormatException e) {
			sendErrorMessage(sender, "The argument \"" + args[0] + "\" is not a valid number!");
			return;
		}		
	}
	
}

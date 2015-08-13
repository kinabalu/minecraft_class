package com.annelieseschools.minecraft;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.command.CommandException;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;

public class BaseCommand implements ICommand {

	private List<String> aliases;
	private String name;
	private String commandUsage;
	
	public BaseCommand(String name, String commandUsage) {
		this.name = name;
		this.commandUsage = commandUsage;
		aliases = new ArrayList();
	}
	
	protected void addAlias(String alias) {
		aliases.add(alias);
	}
	
	@Override
	public int compareTo(Object o) {
		return 0;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getCommandUsage(ICommandSender sender) {
		// TODO Auto-generated method stub
		return commandUsage;
	}

	@Override
	public List getAliases() {
		return aliases;
	}

	@Override
	public void execute(ICommandSender sender, String[] args) throws CommandException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean canCommandSenderUse(ICommandSender sender) {
		return sender instanceof EntityPlayer;
	}
	
	@Override
	public List addTabCompletionOptions(ICommandSender sender, String[] args, BlockPos pos) {
		return null;
	}

	@Override
	public boolean isUsernameIndex(String[] args, int index) {
		return false;
	}

	protected void sendErrorMessage(ICommandSender sender, String message) {
		sender.addChatMessage(new ChatComponentText(EnumChatFormatting.DARK_RED + message));
	}
		
}

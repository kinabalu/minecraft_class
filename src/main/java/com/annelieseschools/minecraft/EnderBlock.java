package com.annelieseschools.minecraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.item.EntityEnderEye;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class EnderBlock extends Block {
	public EnderBlock() {
		super(Material.iron);
		this.setUnlocalizedName("enderBlock");
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setResistance(5.0F);
		this.setHardness(10.0F);
		this.setLightLevel(1.0F);
	}
	
	public void onBlockAdded(World world, BlockPos pos, IBlockState state) {
		IBlockState block = world.getBlockState(pos.add(0, -1, 0));
		world.setBlockState(pos,  block);
		EntityLightningBolt lightning = new EntityLightningBolt(world, pos.getX(), pos.getY(), pos.getZ());
		world.addWeatherEffect(lightning);
	}
	
	public boolean onBlockActivated(World world,
			int x,
			int y,
			int z,
			EntityPlayer player,
			int i1,
			float f1,
			float f2,
			float f3) {
		if(!world.isRemote) {
			return false;
		}
		
		player.addChatMessage(new ChatComponentText(EnumChatFormatting.DARK_PURPLE + "You have clicked on the majestic ENDERIUM BLOCK!!!!"));
		EntityEnderEye eye = new EntityEnderEye(world, x+0.5, y+1.5, z + 0.5);
		eye.motionY = 0.1;
		world.spawnEntityInWorld(eye);
		return true;
	}
}

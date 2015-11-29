package com.mofood.items;

import com.mofood.blocks.blockBasilikum;
import com.mofood.util.MoFoodTab;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSeeds;

public class basilikumSeed extends ItemSeeds{
	public static basilikumSeed basilikumSeed = new basilikumSeed(blockBasilikum.blockBasilikum, Blocks.farmland); 


	public basilikumSeed(Block crops, Block soil) {
		super(crops, soil);
	


	this.setUnlocalizedName("basilikumSeed");
	this.setCreativeTab(MoFoodTab.MoCereals);
	} 
}
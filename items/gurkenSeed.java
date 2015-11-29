package com.mofood.items;

import com.mofood.blocks.blockGurke;
import com.mofood.blocks.blockRape;
import com.mofood.util.MoFoodTab;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSeeds;

public class gurkenSeed extends ItemSeeds{

	public static gurkenSeed gurkenSeed = new gurkenSeed(blockGurke.blockGurke, Blocks.farmland);
	
	public gurkenSeed(Block crops, Block soil) {
		super(crops, soil);
		this.setUnlocalizedName("gurkenSeed");
		this.setCreativeTab(MoFoodTab.MoCereals);
	}

	
}

package com.mofood.items;

import com.mofood.blocks.blockSalat;
import com.mofood.util.MoFoodTab;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSeeds;

public class SalatSeed 	extends ItemSeeds{
	
	public static SalatSeed SalatSeed = new SalatSeed(blockSalat.blockSalat, Blocks.farmland);

	public SalatSeed(Block crops, Block soil) {
		super(crops, soil);
		this.setUnlocalizedName("SalatSeed");
		this.setCreativeTab(MoFoodTab.MoCereals);
	
	}

	
}

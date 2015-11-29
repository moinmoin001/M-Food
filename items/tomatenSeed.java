package com.mofood.items;

import com.mofood.blocks.blockTomate;
import com.mofood.util.MoFoodTab;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSeeds;

public class tomatenSeed extends ItemSeeds{
	
public static tomatenSeed tomatenSeed = new tomatenSeed(blockTomate.blockTomate, Blocks.farmland);

	public tomatenSeed(Block crops, Block soil) {
		super(crops, soil);
		this.setUnlocalizedName("tomatenSeed");
		this.setCreativeTab(MoFoodTab.MoCereals);

	}
}
	

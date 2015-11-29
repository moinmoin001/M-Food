package com.mofood.items;

import com.mofood.blocks.blockSpelt;
import com.mofood.util.MoFoodTab;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;

public class speltSeed extends ItemSeeds {

public static speltSeed speltSeed = new speltSeed(blockSpelt.blockSpelt, Blocks.farmland);

	public speltSeed(Block crops, Block soil) {
		super(crops, soil);
		this.setUnlocalizedName("speltSeed");
		this.setCreativeTab(MoFoodTab.MoCereals);

	}		
	}


	
	
	


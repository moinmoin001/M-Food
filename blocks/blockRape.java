package com.mofood.blocks;


import com.mofood.items.Rape;
import com.mofood.items.rapeSeed;

import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;

public class blockRape extends BlockCrops {

public static BlockCrops blockRape = new blockRape();
	
	protected blockRape () {
	this.setUnlocalizedName("blockRape");
	}
	protected Item getSeed()
	{
	return rapeSeed.rapeSeed;
	}

	protected Item getCrop()
	{
	return Rape.Rape;
	}
	}

	


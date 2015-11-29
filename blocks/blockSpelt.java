package com.mofood.blocks;

import com.mofood.items.spelt;
import com.mofood.items.speltSeed;

import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;

public class blockSpelt extends BlockCrops {

	public static BlockCrops blockSpelt = new blockSpelt();
	
	protected blockSpelt() {
	this.setUnlocalizedName("blockSpelt");
	}
	protected Item getSeed()
	{
	return speltSeed.speltSeed;
	}		
	
	protected Item getCrop()
	{
	return spelt.spelt;
	}
	}
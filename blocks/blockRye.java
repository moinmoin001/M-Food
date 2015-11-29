package com.mofood.blocks;
import com.mofood.items.rye;
import com.mofood.items.ryeSeed;

import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.item.Item;

public class blockRye extends BlockCrops{
	
	public static BlockCrops blockRye = new blockRye();
	
	protected blockRye () {
	this.setUnlocalizedName("blockRye");
	}
	protected Item getSeed()
	{
	return ryeSeed.ryeSeed;
	}

	protected Item getCrop()
	{
	return rye.rye;
	}
	}

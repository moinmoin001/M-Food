package com.mofood.blocks;

import com.mofood.items.Salat;
import com.mofood.items.SalatSeed;

import net.minecraft.block.BlockCrops;
import net.minecraft.block.BlockPotato;
import net.minecraft.item.Item;

public class blockSalat extends BlockPotato{

	public static BlockCrops blockSalat = new blockSalat();
	
	protected blockSalat() 
	{
		this.setUnlocalizedName("blockSalat"); 
			
		}
	
	
	protected Item getSeed() {
	{
		return SalatSeed.SalatSeed; }
	}
	protected Item getCrop()	
	{	
	return Salat.Salat;

	}
}

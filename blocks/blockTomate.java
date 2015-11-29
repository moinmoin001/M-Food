package com.mofood.blocks;

import com.mofood.items.Tomate;
import com.mofood.items.tomatenSeed;

import net.minecraft.block.BlockPotato;
import net.minecraft.item.Item;

public class blockTomate extends BlockPotato{
	
public static blockTomate blockTomate = new blockTomate();	

public blockTomate() {
	this.setUnlocalizedName("blockTomate");
	}
		protected Item getSeed()
	{
		return tomatenSeed.tomatenSeed;
	}
		protected Item getCrop()
	{	
		return Tomate.Tomate;
	}
		



}

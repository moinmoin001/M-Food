package com.mofood.blocks;

import com.mofood.items.Chilli;
import com.mofood.items.chilliSeed;

import net.minecraft.block.BlockCrops;
import net.minecraft.block.BlockPotato;
import net.minecraft.item.Item;

public class blockChilli extends BlockPotato {

	public static blockChilli blockChilli = new blockChilli();

	protected blockChilli() {
		this.setUnlocalizedName("blockChilli");
	}

	protected Item getSeed() {
		return chilliSeed.chilliSeed;
	}

	protected Item getCrop() {
		return Chilli.Chilli;
	}
}

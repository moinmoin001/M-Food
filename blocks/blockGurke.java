package com.mofood.blocks;


import com.mofood.items.Gurke;
import com.mofood.items.gurkenSeed;

import net.minecraft.block.BlockCrops;
import net.minecraft.block.BlockPotato;
import net.minecraft.item.Item;

public class blockGurke extends BlockPotato{

	public static blockGurke blockGurke = new blockGurke();
	
	protected blockGurke () {
	this.setUnlocalizedName("blockGurke");
	}
	protected Item getSeed()
    {
        return gurkenSeed.gurkenSeed;
    }

    protected Item getCrop()
    {
        return Gurke.Gurke;
    }
}


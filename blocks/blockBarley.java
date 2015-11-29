package com.mofood.blocks;
import com.mofood.items.barley;
import com.mofood.items.barleySeed;

import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class blockBarley extends BlockCrops {

	public static BlockCrops blockBarley = new blockBarley();
	
	protected blockBarley () {
	this.setUnlocalizedName("blockBarley");
	}
	protected Item getSeed()
    {
        return barleySeed.barleySeed;
    }

    protected Item getCrop()
    {
        return barley.barley;
    
    }
}
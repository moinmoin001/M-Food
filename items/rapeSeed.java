package com.mofood.items;

import com.mofood.blocks.blockRape;
import com.mofood.util.MoFoodTab;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSeeds;

public class rapeSeed extends ItemSeeds{

public static rapeSeed rapeSeed = new rapeSeed(blockRape.blockRape, Blocks.farmland);

public rapeSeed(Block crops, Block soil) {
	super(crops, soil);
	this.setUnlocalizedName("rapeSeed");
	this.setCreativeTab(MoFoodTab.MoCereals);
}
	

}

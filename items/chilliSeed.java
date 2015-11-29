package com.mofood.items;

import com.mofood.blocks.blockBarley;
import com.mofood.blocks.blockChilli;
import com.mofood.util.MoFoodTab;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSeeds;

public class chilliSeed extends ItemSeeds {

	public static chilliSeed chilliSeed = new chilliSeed(blockChilli.blockChilli, Blocks.farmland);

	public chilliSeed(Block crops, Block soil) {
		super(crops, soil);

		this.setUnlocalizedName("chilliSeed");
		this.setCreativeTab(MoFoodTab.MoCereals);

	}
}
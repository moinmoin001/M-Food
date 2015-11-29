package com.mofood.items;

import com.mofood.blocks.blockBarley;
import com.mofood.blocks.blockReis;
import com.mofood.util.MoFoodTab;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSeeds;

public class ReisSeed extends ItemSeeds {

	public static ReisSeed ReisSeed = new ReisSeed(blockReis.blockReis, Blocks.farmland);

	public ReisSeed(Block crops, Block soil) {
		super(crops, soil);
		this.setUnlocalizedName("ReisSeed");
		this.setCreativeTab(MoFoodTab.MoCereals);

	}
}
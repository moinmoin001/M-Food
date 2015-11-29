package com.mofood.items;

import com.mofood.blocks.blockBasilikum;
import com.mofood.blocks.blockErbse;
import com.mofood.util.MoFoodTab;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSeeds;

public class ErbsenSeed extends ItemSeeds {

	public static ErbsenSeed ErbsenSeed = new ErbsenSeed(blockErbse.blockErbse, Blocks.farmland);

	public ErbsenSeed(Block crops, Block soil) {
		super(crops, soil);

		this.setCreativeTab(MoFoodTab.MoCereals);
		this.setUnlocalizedName("ErbsenSeed");
	}
}

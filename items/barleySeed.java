package com.mofood.items;

import com.mofood.blocks.blockBarley;
import com.mofood.util.MoFoodTab;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;

public class barleySeed extends ItemSeeds {

public static barleySeed barleySeed = new barleySeed(blockBarley.blockBarley, Blocks.farmland); 
	
	public barleySeed(Block crops, Block soil) {
		super(crops, soil);
		this.setUnlocalizedName("barleySeed");
		this.setCreativeTab(MoFoodTab.MoCereals);

		
		 }

	
	
}

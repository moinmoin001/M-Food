package com.mofood.items;

import com.mofood.blocks.blockRye;
import com.mofood.util.MoFoodTab;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSeeds;

public class ryeSeed extends ItemSeeds {	
	
public static ryeSeed ryeSeed = new ryeSeed(blockRye.blockRye, Blocks.farmland); 
	
	public ryeSeed(Block crops, Block soil) {
		super(crops, soil);
		this.setUnlocalizedName("ryeSeed");
		this.setCreativeTab(MoFoodTab.MoCereals);

		}
	}		

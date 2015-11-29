package com.mofood.items;

import com.mofood.util.MoFoodTab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class RyeMehl extends Item{

	public static RyeMehl RyeMehl = new RyeMehl();
	
	public RyeMehl() {
	this.setUnlocalizedName("RyeMehl");
	this.setCreativeTab(MoFoodTab.MoCereals);
	
	} 
}

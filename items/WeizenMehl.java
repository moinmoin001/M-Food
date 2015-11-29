package com.mofood.items;

import com.mofood.util.MoFoodTab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class WeizenMehl extends Item{

	public static WeizenMehl WeizenMehl = new WeizenMehl();
	
	public WeizenMehl() {
	
	this.setUnlocalizedName("WeizenMehl");	
	this.setCreativeTab(MoFoodTab.MoCereals);
	
	
	}
}

package com.mofood.items;

import com.mofood.util.MoFoodTab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class rye extends Item{

	public static rye rye = new rye(); 

	protected rye() {
	this.setUnlocalizedName("rye");
	this.setCreativeTab(MoFoodTab.MoCereals);
	}
	
}

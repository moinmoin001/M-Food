package com.mofood.items;

import com.mofood.util.MoFoodTab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class SpeltMehl extends Item {

	public static SpeltMehl SpeltMehl = new SpeltMehl();
	
	public SpeltMehl() {
	this.setUnlocalizedName("SpeltMehl");
	this.setCreativeTab(MoFoodTab.MoCereals);
	
	}
}

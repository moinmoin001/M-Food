package com.mofood.items;

import com.mofood.util.MoFoodTab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class SpeltBread extends ItemFood{

	public static SpeltBread SpeltBread = new SpeltBread(6, 0.4F, false);
	
	public SpeltBread(int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
		this.setUnlocalizedName("SpeltBread");
		this.setCreativeTab(MoFoodTab.MoFood);
	
	}

}

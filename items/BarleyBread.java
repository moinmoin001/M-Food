package com.mofood.items;

import com.mofood.util.MoFoodTab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class BarleyBread extends ItemFood {

	public static BarleyBread BarleyBread = new BarleyBread(6, 0.4F, false);
	
	public BarleyBread(int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
	this.setUnlocalizedName("BarleyBread");
	this.setCreativeTab(MoFoodTab.MoFood);
	
	}

}

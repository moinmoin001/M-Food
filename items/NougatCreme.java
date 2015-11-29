package com.mofood.items;

import com.mofood.util.MoFoodTab;

import net.minecraft.item.ItemFood;

public class NougatCreme extends ItemFood{

public static NougatCreme NougatCreme = new NougatCreme(6, 0.4F, false);
	
	public NougatCreme(int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
	this.setUnlocalizedName("NougatCreme");
	this.setCreativeTab(MoFoodTab.MoFood);
	
	}

}

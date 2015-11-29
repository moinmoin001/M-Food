package com.mofood.items;

import com.mofood.util.MoFoodTab;

import net.minecraft.item.ItemFood;

public class HotDogSenf extends  ItemFood{

	public static HotDogSenf HotDogSenf = new HotDogSenf(12, 0.4F, false);
	
	public HotDogSenf(int amount, float f, boolean isWolfFood) {
		super(amount, isWolfFood);
	
		this.setUnlocalizedName("HotDogSenf");
		this.setCreativeTab(MoFoodTab.MoFood);
	
	
	
	
	
	}

	
}

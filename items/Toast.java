package com.mofood.items;

import com.mofood.util.MoFoodTab;

import net.minecraft.item.ItemFood;

public class Toast extends ItemFood{

public static Toast Toast = new Toast(6, 0.4F, false);
	
	public Toast(int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
	this.setUnlocalizedName("Toast");
	this.setCreativeTab(MoFoodTab.MoFood);
	
	}

}

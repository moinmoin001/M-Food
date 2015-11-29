package com.mofood.items;

import com.mofood.util.MoFoodTab;

import net.minecraft.item.ItemFood;

public class PizzaHawaii extends ItemFood {

public static PizzaHawaii PizzaHawaii = new PizzaHawaii(6, 0.4F, false);
	
	public PizzaHawaii(int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
	this.setUnlocalizedName("PizzaHawaii");
	this.setCreativeTab(MoFoodTab.MoFood);
	
	}

}

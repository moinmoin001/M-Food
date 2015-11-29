package com.mofood.items;

import com.mofood.util.MoFoodTab;

import net.minecraft.item.ItemFood;

public class PizzaThunfisch extends ItemFood {

public static PizzaThunfisch PizzaThunfisch = new PizzaThunfisch(6, 0.4F, false);
	
	public PizzaThunfisch(int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
	this.setUnlocalizedName("PizzaThunfisch");
	this.setCreativeTab(MoFoodTab.MoFood);
	
	}
}

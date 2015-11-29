package com.mofood.items;

import com.mofood.util.MoFoodTab;

import net.minecraft.item.ItemFood;

public class PizzaMargarita extends ItemFood {

	public static PizzaMargarita PizzaMargarita = new PizzaMargarita(8, 0.4F, false);

	public PizzaMargarita(int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
		this.setUnlocalizedName("PizzaMargarita");
		this.setCreativeTab(MoFoodTab.MoFood);

	}
	
}
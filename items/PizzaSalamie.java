package com.mofood.items;

import com.mofood.util.MoFoodTab;

import net.minecraft.item.ItemFood;

public class PizzaSalamie extends ItemFood{

	public static PizzaSalamie PizzaSalamie = new PizzaSalamie(8, 0.4F, false);

	public PizzaSalamie(int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
		this.setUnlocalizedName("PizzaSalamie");
		this.setCreativeTab(MoFoodTab.MoFood);

	}
}

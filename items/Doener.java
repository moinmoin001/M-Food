package com.mofood.items;

import com.mofood.util.MoFoodTab;

import net.minecraft.item.ItemFood;

public class Doener extends ItemFood {

	public Doener(int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
	}

	public static Doener Doener = new Doener(8, 0.4F, false);

	{
		this.setUnlocalizedName("Doener");
		this.setCreativeTab(MoFoodTab.MoFood);
	}

}

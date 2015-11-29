package com.mofood.items;

import com.mofood.util.MoFoodTab;

import net.minecraft.item.ItemFood;

public class Wurst extends ItemFood{

	public static Wurst Wurst = new Wurst(12, 0.4F, false);
	
	public Wurst(int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
		this.setUnlocalizedName("Wurst");
		this.setCreativeTab(MoFoodTab.MoFood);
	}

}

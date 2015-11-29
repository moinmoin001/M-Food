package com.mofood.items;

import com.mofood.util.MoFoodTab;

import net.minecraft.item.ItemFood;

public class Karamell extends ItemFood{

public static Karamell Karamell = new Karamell(6, 0.4F, false);
	
	public Karamell(int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
	this.setUnlocalizedName("Karamell");
	this.setCreativeTab(MoFoodTab.MoFood);
	
	}

}


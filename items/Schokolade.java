package com.mofood.items;

import com.mofood.util.MoFoodTab;

import net.minecraft.item.ItemFood;

public class Schokolade extends ItemFood {

public static Schokolade Schokolade = new Schokolade(6, 0.4F, false);
	
	public Schokolade(int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
	this.setUnlocalizedName("Schokolade");
	this.setCreativeTab(MoFoodTab.MoFood);
	
	}

}

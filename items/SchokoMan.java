package com.mofood.items;

import com.mofood.util.MoFoodTab;

import net.minecraft.item.ItemFood;

public class SchokoMan extends ItemFood {

public static SchokoMan SchokoMan = new SchokoMan(6, 0.4F, false);
	
	public SchokoMan(int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
	this.setUnlocalizedName("SchokoMan");
	this.setCreativeTab(MoFoodTab.MoFood);
	
	}

}

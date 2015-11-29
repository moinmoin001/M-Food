package com.mofood.items;

import com.mofood.util.MoFoodTab;

import net.minecraft.item.ItemFood;

public class KirschMarmelade extends ItemFood {

	public static KirschMarmelade KirschMarmelade = new KirschMarmelade(8, 0.4F, true);
	
	public KirschMarmelade(int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);	
		this.setCreativeTab(MoFoodTab.MoFood);
		this.setUnlocalizedName("KirschMarmelade");
	}
	
}


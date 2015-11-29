package com.mofood.items;

import com.mofood.util.MoFoodTab;

import net.minecraft.item.ItemFood;

public class ErdbeerMarmelade extends ItemFood {

	public static ErdbeerMarmelade ErdbeerMarmelade = new ErdbeerMarmelade(8, 0.4F, true);
	
	public ErdbeerMarmelade(int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);	
		this.setCreativeTab(MoFoodTab.MoFood);
		this.setUnlocalizedName("ErdbeerMarmelade");
	}
	
}


package com.mofood.items;

import com.mofood.util.MoFoodTab;

import net.minecraft.item.ItemFood;

public class HotDog extends ItemFood{
	
	public static HotDog HotDog = new HotDog(12, 0.4F, false);
	
	public HotDog(int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
	
		this.setUnlocalizedName("HotDog");
		this.setCreativeTab(MoFoodTab.MoFood);
	
	}

	
	
}

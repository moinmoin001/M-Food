package com.mofood.items;

import com.mofood.util.MoFoodTab;

import net.minecraft.item.ItemFood;

public class Punsch extends ItemFood {

	public static Punsch Punsch = new Punsch(8, 0.4F, false);
	
	public Punsch(int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);	
		this.setCreativeTab(MoFoodTab.MoFood);
		this.setUnlocalizedName("Punsch");
	}
	
}

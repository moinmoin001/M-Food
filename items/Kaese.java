package com.mofood.items;

import com.mofood.util.MoFoodTab;

import net.minecraft.item.ItemFood;

public class Kaese extends ItemFood {
	
public static Kaese Kaese = new Kaese(3, 0.4F, false);

	public Kaese(int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
	
		
	this.setUnlocalizedName("Kaese");
	this.setCreativeTab(MoFoodTab.MoFood);
	}
}
	

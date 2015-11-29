package com.mofood.items;

import com.mofood.util.MoFoodTab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class Salat extends ItemFood{

	public static Salat Salat = new Salat(2, 0.4F, false);

	
	public Salat(int amount, float f, boolean isWolfFood) {
		super(amount, isWolfFood);
	this.setUnlocalizedName("Salat");
	this.setCreativeTab(MoFoodTab.MoCereals);
	
	}

	
}

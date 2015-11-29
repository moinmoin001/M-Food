package com.mofood.items;

import com.mofood.util.MoFoodTab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class Tomate extends ItemFood {

	public static Tomate Tomate = new Tomate(3, 0.4F, false);
	
	public Tomate(int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
	this.setUnlocalizedName("Tomate");
	this.setCreativeTab(MoFoodTab.MoCereals);
	
	}
	
}

package com.mofood.items;

import com.mofood.util.MoFoodTab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class Gurke extends ItemFood {

public static Gurke Gurke = new Gurke(3, 0.4F, false); 
	
	
	
	public Gurke(int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
		this.setUnlocalizedName("Gurke");
		this.setCreativeTab(MoFoodTab.MoCereals);
	}
}

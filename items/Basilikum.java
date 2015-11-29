package com.mofood.items;

import com.mofood.util.MoFoodTab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class Basilikum extends ItemFood{
public static Basilikum Basilikum = new Basilikum(1, 0.4F, false); 
	
	
	
	public Basilikum(int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
		this.setUnlocalizedName("Basilikum");
		this.setCreativeTab(MoFoodTab.MoCereals);
	}
}

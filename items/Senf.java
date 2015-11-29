package com.mofood.items;

import com.mofood.util.MoFoodTab;

import net.minecraft.item.Item;

public class Senf extends Item{
	
	public static Senf Senf = new Senf();
	protected Senf() {
	this.setUnlocalizedName("Senf");
	this.setCreativeTab(MoFoodTab.MoFood);
	
	}
}
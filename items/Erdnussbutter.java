package com.mofood.items;

import com.mofood.util.MoFoodTab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class Erdnussbutter extends ItemFood {

	public static Erdnussbutter Erdnussbutter = new Erdnussbutter(8, 0.4F, false);

	public Erdnussbutter(int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
		this.setUnlocalizedName("Erdnussbutter");
		this.setCreativeTab(MoFoodTab.MoFood);

	}
}
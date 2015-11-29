package com.mofood.items;

import com.mofood.util.MoFoodTab;

import net.minecraft.init.Items;
import net.minecraft.item.ItemFood;

public class Birne extends ItemFood {

	public static Birne Birne = new Birne(6, 0.4F, false);

	public Birne(int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);

		this.setCreativeTab(MoFoodTab.MoFood);
		this.setUnlocalizedName("Birne");
	}

}
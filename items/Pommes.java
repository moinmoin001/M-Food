package com.mofood.items;

import com.mofood.util.MoFoodTab;

import net.minecraft.item.ItemFood;

public class Pommes extends ItemFood {

	public Pommes(int amount, float f, boolean isWolfFood) {
		super(amount, isWolfFood);
	}

	public static Pommes Pommes = new Pommes(12, 0.4F, false);

	{
		this.setUnlocalizedName("Pommes");
		this.setCreativeTab(MoFoodTab.MoFood);
	}

}

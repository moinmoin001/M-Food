package com.mofood.items;

import com.mofood.util.MoFoodTab;

import net.minecraft.item.ItemFood;

public class HotDogKetchup extends ItemFood {

	public static HotDogKetchup HotDogKetchup = new HotDogKetchup(12, 0.4F, true);

	{
		this.setUnlocalizedName("HotDogKetchup");
		this.setCreativeTab(MoFoodTab.MoFood);
	}

	public HotDogKetchup(int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
	}

}

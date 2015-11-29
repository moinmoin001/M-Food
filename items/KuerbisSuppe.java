package com.mofood.items;

import com.mofood.util.MoFoodTab;

import net.minecraft.item.ItemFood;

public class KuerbisSuppe extends ItemFood {

	public static KuerbisSuppe KuerbisSuppe = new KuerbisSuppe(6, 0.4F, false);

	public KuerbisSuppe(int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
	
		this.setCreativeTab(MoFoodTab.MoFood);
		this.setUnlocalizedName("KuerbisSuppe");
	}

}

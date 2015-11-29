package com.mofood.items;

import com.mofood.util.MoFoodTab;

import net.minecraft.item.ItemFood;

public class LollyPop extends ItemFood{

public static LollyPop LollyPop = new LollyPop(6, 0.4F, false);
	
	public LollyPop(int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
	this.setUnlocalizedName("LollyPop");
	this.setCreativeTab(MoFoodTab.MoFood);
	
	}

}

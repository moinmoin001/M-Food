package com.mofood.items;

import com.mofood.util.MoFoodTab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class ZombieFleischEintopf extends ItemFood{

	public static ZombieFleischEintopf ZombieFleischEintopf = new ZombieFleischEintopf(6, 0.4F, true);
	
	public ZombieFleischEintopf(int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
		this.setUnlocalizedName("ZombieFleischEintopf");
		this.setCreativeTab(MoFoodTab.MoFood);
	
	}

}

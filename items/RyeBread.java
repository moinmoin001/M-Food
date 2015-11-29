package com.mofood.items;

import com.mofood.util.MoFoodTab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class RyeBread extends ItemFood{

	public static RyeBread RyeBread = new RyeBread(6, 0.4F, false); 
	
	
	
	public RyeBread(int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
		this.setUnlocalizedName("RyeBread");
		this.setCreativeTab(MoFoodTab.MoFood);
	
	
		
		
	}

}
	

	


package com.mofood.items;

import com.mofood.util.MoFoodTab;

import net.minecraft.item.Item;

public class Reis extends Item {
	
	public static Reis Reis = new Reis();
	
	protected Reis() {
		this.setUnlocalizedName("Reis");
		this.setCreativeTab(MoFoodTab.MoCereals);
	}
			
}

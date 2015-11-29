package com.mofood.items;

import com.mofood.util.MoFoodTab;

import net.minecraft.item.Item;

public class Tasse extends Item{
	
	public static Tasse Tasse = new Tasse();
	
	protected Tasse() {
		this.setUnlocalizedName("Tasse");
		this.setCreativeTab(MoFoodTab.MoFood);
	}

}

package com.mofood.items;

import com.mofood.util.MoFoodTab;

import net.minecraft.item.Item;

public class ToastNugat extends Item {

	public static Item ToastNugat = new ToastNugat();
	
	protected ToastNugat() {
		this.setCreativeTab(MoFoodTab.MoFood);
		this.setUnlocalizedName("ToastNugat");
	}
	
}

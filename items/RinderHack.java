package com.mofood.items;

import com.mofood.util.MoFoodTab;

import net.minecraft.item.Item;

public class RinderHack extends Item {

	public static Item RinderHack = new RinderHack();
	
	protected RinderHack() {
		this.setCreativeTab(MoFoodTab.MoFood);
		this.setUnlocalizedName("RinderHack");
	}
	
}

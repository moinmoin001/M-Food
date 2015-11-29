package com.mofood.items;

import com.mofood.util.MoFoodTab;

import net.minecraft.item.Item;

public class SchweineHack extends Item {

	public static Item SchweineHack = new SchweineHack();
	
	protected SchweineHack() {
		this.setCreativeTab(MoFoodTab.MoFood);
		this.setUnlocalizedName("SchweineHack");
	}
}

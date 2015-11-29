package com.mofood.items;

import com.mofood.util.MoFoodTab;

import net.minecraft.item.Item;

public class WeckGlass extends Item {
	public static Item WeckGlass = new WeckGlass();

	protected WeckGlass() {
		this.setCreativeTab(MoFoodTab.MoCrafting);
		this.setUnlocalizedName("WeckGlass");
	}

}

package com.mofood.items;

import com.mofood.util.MoFoodTab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class Karrottensuppen extends ItemFood {

	public static Karrottensuppen Karrottensuppen = new Karrottensuppen(8, 0.4F, false);

	public Karrottensuppen(int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
		this.setUnlocalizedName("Karrottensuppen");
		this.setCreativeTab(MoFoodTab.MoFood);

	}
}
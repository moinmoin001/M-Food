package com.mofood.items;

import com.mofood.util.MoFoodTab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class Kartoffelsuppe extends ItemFood {

	public static Kartoffelsuppe Kartoffelsuppe = new Kartoffelsuppe(8, 0.4F, false);

	public Kartoffelsuppe(int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
		this.setUnlocalizedName("Kartoffelsuppe");
		this.setCreativeTab(MoFoodTab.MoFood);

	}
}
package com.mofood.items;

import com.mofood.util.MoFoodTab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class Butterkecks extends ItemFood {

	public static Butterkecks Butterkecks = new Butterkecks(8, 0.4F, false);

	public Butterkecks(int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
		this.setUnlocalizedName("Butterkecks");
		this.setCreativeTab(MoFoodTab.MoFood);

	}
}
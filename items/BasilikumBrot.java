package com.mofood.items;

import com.mofood.util.MoFoodTab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class BasilikumBrot extends ItemFood {

	public static BasilikumBrot BasilikumBrot = new BasilikumBrot(8, 0.4F, false);

	public BasilikumBrot(int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
		this.setUnlocalizedName("BasilikumBrot");
		this.setCreativeTab(MoFoodTab.MoFood);

	}
}
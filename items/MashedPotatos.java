package com.mofood.items;

import com.mofood.util.MoFoodTab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class MashedPotatos extends ItemFood {

	public static MashedPotatos MashedPotatos = new MashedPotatos(8, 0.4F, false);

	public MashedPotatos(int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
		this.setUnlocalizedName("MashedPotatos");
		this.setCreativeTab(MoFoodTab.MoFood);

	}
}
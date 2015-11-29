package com.mofood.items;

import java.awt.List;

import com.mofood.util.MoFoodTab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Burger extends ItemFood {

	public static Burger Burger = new Burger(12, 0.4F, true);

	public Burger(int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
		this.setUnlocalizedName("Burger");
		this.setCreativeTab(MoFoodTab.MoFood);
	
	}
}

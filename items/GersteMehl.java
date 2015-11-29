package com.mofood.items;

import java.util.List;

import com.mofood.util.MoFoodTab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class GersteMehl extends Item {

	public static GersteMehl GersteMehl = new GersteMehl();

	public GersteMehl() {
		this.setUnlocalizedName("GersteMehl");
		this.setCreativeTab(MoFoodTab.MoCereals);
	}
}
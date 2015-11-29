package com.mofood.items;


import java.util.List;

import com.mofood.util.MoFoodTab;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BigBurger extends ItemFood{


public static BigBurger BigBurger = new BigBurger(12, 0.4F, true);
	
	public BigBurger(int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
	this.setUnlocalizedName("BigBurger");
	this.setCreativeTab(MoFoodTab.MoFood);
	}
	@Override
	@SideOnly(Side.CLIENT) 
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4)
	{
	list.add(EnumChatFormatting.DARK_AQUA + "Ingredients");
	list.add(EnumChatFormatting.DARK_AQUA + "Meat");
	list.add(EnumChatFormatting.DARK_AQUA + "Bread");
	
	
	}
}
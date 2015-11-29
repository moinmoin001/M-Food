package com.mofood.items;

import java.util.List;

import com.mofood.util.MoFoodTab;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BigBurger1 extends ItemFood {

	public static BigBurger1 BigBurger1 = new BigBurger1(12, 0.4F, true);

	public BigBurger1(int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
		this.setUnlocalizedName("BigBurger1");
		this.setCreativeTab(MoFoodTab.MoFood);

	}
	@Override
	@SideOnly(Side.CLIENT) 
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4)
	{
	list.add(EnumChatFormatting.DARK_AQUA + "Ingredients");
	list.add(EnumChatFormatting.DARK_AQUA + "Meat");
	list.add(EnumChatFormatting.DARK_AQUA + "Bread");
	list.add(EnumChatFormatting.DARK_AQUA + "Cheese");
	}
}
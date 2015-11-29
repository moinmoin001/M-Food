package com.mofood.items;

import com.mofood.util.MoFoodTab;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class moerser extends Item {

	public static moerser moerser = new moerser();

	public moerser() {

		this.setUnlocalizedName("moerser");
		this.setNoRepair();
		this.setMaxDamage(19);
		this.setCreativeTab(MoFoodTab.MoCrafting);
		this.setMaxStackSize(4);
	}

	@Override
	public boolean getShareTag() {
		return true;
	}

	@Override
	public boolean hasContainerItem(ItemStack itemstack) {
		return true;
	}

	@Override
	public ItemStack getContainerItem(ItemStack itemstack)
	{
		ItemStack stack = itemstack.copy();
		
		 stack.setItemDamage(stack.getItemDamage() + 1);
	        stack.stackSize = 1;

		return stack;
	}
}

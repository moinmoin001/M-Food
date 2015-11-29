package com.mofood.items;

import com.mofood.util.MoFoodTab;

import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Knife extends Item {

				public static Knife Knife = new Knife();
				
			    
				public Knife() {

			        this.setMaxStackSize(1);
			        this.setNoRepair();
			        this.setMaxDamage(19); 
			        this.setUnlocalizedName("Knife");
			        this.setCreativeTab(MoFoodTab.MoCrafting);
			    }
				
			    @Override
			    public boolean getShareTag()
			    {
			        return true;
			    }

			    public boolean hasContainerItem(ItemStack itemStack)
			    {
			       return true;
			    }
			    @Override
			    public ItemStack getContainerItem(ItemStack itemStack)
			    {
			        ItemStack stack = itemStack.copy();

			        stack.setItemDamage(stack.getItemDamage() + 1);
			        stack.stackSize = 1;

			        return stack;
			    }
			
			}
	
	
	
	




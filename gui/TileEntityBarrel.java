package com.mofood.gui;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryBasic;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;

public class TileEntityBarrel extends TileEntity {

	public InventoryBasic inventory;
	
	public TileEntityBarrel() {	
		inventory = new InventoryBasic("BarrelInventory", false, 15);
	}

	@Override
	public void writeToNBT(NBTTagCompound compound) {
		super.writeToNBT(compound);
	
	NBTTagList list = new NBTTagList();
		
	
	for(int i = 0; i < inventory.getSizeInventory(); i++) {
		if(inventory.getStackInSlot(i) != null) {
			NBTTagCompound tag = new NBTTagCompound();
			tag.setByte("slot", (byte)i);
			inventory.getStackInSlot(i).writeToNBT(tag);
			list.appendTag(tag);
			
			}
		}
	
	compound.setTag("ItemStacks", list);
	
	}
	
	@Override
	public void readFromNBT(NBTTagCompound compound) {
		super.readFromNBT(compound);

		NBTTagList list = compound.getTagList("ItemStacks", 10 );
		this.inventory = new InventoryBasic("BarrelInventory", false, 15);
		
		for(int i = 0; i < list.tagCount(); i++) {
		NBTTagCompound tag = list.getCompoundTagAt(i);
		byte b = tag.getByte("slot");
		
		if(b >= 0 && b < inventory.getSizeInventory()); {
			inventory.setInventorySlotContents(b, ItemStack.loadItemStackFromNBT(tag));
			}
	
		}
	}
}	
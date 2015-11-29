package com.mofood.util;

import com.mofood.mofood;
import com.mofood.gui.ContainerBarrel;
import com.mofood.gui.GuiBarrel;
import com.mofood.gui.TileEntityBarrel;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {

	public static final int GuiBarrel = 1;

	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {

		switch (ID) {
		case mofood.GUI_BARREL:
			return new ContainerBarrel(player.inventory, (TileEntityBarrel) world.getTileEntity(new BlockPos(x, y, z)));
		default:
			return null;
		}
	}

	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		switch (ID) {
		case mofood.GUI_BARREL:
			return new GuiBarrel(new ContainerBarrel(player.inventory,
					(TileEntityBarrel) world.getTileEntity(new BlockPos(x, y, z))));
		default:
			return null;
		}

	}
}

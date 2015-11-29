package com.mofood.blocks;

import com.mofood.mofood;
import com.mofood.gui.TileEntityBarrel;
import com.mofood.util.GuiHandler;
import com.mofood.util.MoFoodTab;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.internal.FMLNetworkHandler;

public class blockBarrel extends BlockContainer {

	public static Block blockBarrel = new blockBarrel();

	public blockBarrel() {
		super(Material.wood);

		this.setUnlocalizedName("blockBarrel");
		this.setCreativeTab(MoFoodTab.MoCrafting);
		ModelResourceLocation("moblocks:blockBarrel");
	}

	private void ModelResourceLocation(String string) {

	}

	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new TileEntityBarrel();
	}

	@Override
	public int getRenderType() {
		return 3;
	}

	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn,
			EnumFacing side, float hitX, float hitY, float hitZ) {
		if (!worldIn.isRemote) {
			playerIn.openGui(mofood.instance, mofood.GUI_BARREL, worldIn, pos.getX(), pos.getY(), pos.getZ());
		}
		return true;
	};

	public boolean isFullCube() {
		return false;
	}

	public boolean isSolidFullCube() {
		return false;
	}

	public boolean isOpaqueCube() {
		return false;
	}

};

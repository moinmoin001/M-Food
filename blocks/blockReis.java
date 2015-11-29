package com.mofood.blocks;

import com.mofood.items.Reis;
import com.mofood.items.ReisSeed;
import com.mofood.util.MoFoodTab;

import net.minecraft.block.BlockCrops;
import net.minecraft.block.BlockPotato;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class blockReis extends BlockPotato {

public static blockReis blockReis = new blockReis();
	
	protected blockReis () {
	this.setUnlocalizedName("blockReis");
	}
	protected Item getSeed()
    {
        return ReisSeed.ReisSeed;
    }

    protected Item getCrop()
    {
        return Reis.Reis;
    }
}

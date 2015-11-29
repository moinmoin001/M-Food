package com.mofood.blocks;

import com.mofood.items.Basilikum;
import com.mofood.items.basilikumSeed;

import net.minecraft.block.BlockPotato;
import net.minecraft.item.Item;

public class blockBasilikum extends BlockPotato{

	
public static blockBasilikum blockBasilikum = new blockBasilikum();
	
	protected blockBasilikum () {
	this.setUnlocalizedName("blockBasilikum");
	}
	protected Item getSeed()
    {
        return basilikumSeed.basilikumSeed;
    }

    protected Item getCrop()
    {
        return Basilikum.Basilikum;
    }
}




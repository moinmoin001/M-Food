package com.mofood.blocks;

import com.mofood.items.Erbse;
import com.mofood.items.ErbsenSeed;
import com.mofood.items.Rape;
import com.mofood.items.rapeSeed;

import net.minecraft.block.BlockPotato;
import net.minecraft.item.Item;

public class blockErbse extends BlockPotato {

	public static blockErbse blockErbse = new blockErbse();

	protected blockErbse() {
		this.setUnlocalizedName("blockErbse");
	}

	protected Item getSeed() {
		return ErbsenSeed.ErbsenSeed;
	}

	protected Item getCrop() {
		return Erbse.Erbse;
	}
}

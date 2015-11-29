package com.mofood.util;

import com.mofood.mofood;
import com.mofood.items.Tasse;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class MoFoodTab {

	public static CreativeTabs MoCereals=new CreativeTabs("MoCereals"){@SideOnly(Side.CLIENT)public Item getTabIconItem(){return Item.getItemFromBlock(Blocks.hay_block);

	}

	};
	public static CreativeTabs MoFood=new CreativeTabs("MoFood"){@SideOnly(Side.CLIENT)public Item getTabIconItem(){return Items.bread;

	}

	};
	public static CreativeTabs MoCrafting=new CreativeTabs("MoCrafting"){@SideOnly(Side.CLIENT)public Item getTabIconItem(){return Item.getItemFromBlock(Blocks.crafting_table);

	}

	};
	//public static CreativeTabs MoDrinks=new CreativeTabs("MoDrinks"){@SideOnly(Side.CLIENT)public Item getTabIconItem(){return Tasse.Tasse;

	//}

	//};

	//Next Tab
}
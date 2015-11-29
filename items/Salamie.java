package com.mofood.items;

import net.minecraft.item.ItemFood;

public class Salamie extends ItemFood{

	public static Salamie Salamie = new Salamie(2, 0.4F, true);
		
	
	public Salamie(int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
	}

	
	
}

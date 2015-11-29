package com.mofood.gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;

public class GuiBarrel extends GuiContainer {
	
	public static final ResourceLocation BACKGROUND = new ResourceLocation("mofood:textures/gui/GuiBarrel.png");
	public int ySize = 166 ; //166 Gibt die Höhe an (Y) 
	public int xSize = 176 ; //176 Gibt die Breite an (X)
	public GuiBarrel(Container Container) {
		super(Container);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
		mc.renderEngine.bindTexture(BACKGROUND);
		int k = (this.width - this.xSize) / 2;
		int l = (this.height - this.ySize) / 2;
		drawTexturedModalRect(k, l, 0, 0, xSize, ySize);

	}

}

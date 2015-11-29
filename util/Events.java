package com.mofood.util;

import com.mofood.mofood;

import net.minecraft.client.Minecraft;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.ClientTickEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;

public class Events {

	public boolean hasShowUp = false;
	
																				@SubscribeEvent
																				public void onPlayerTick(PlayerTickEvent event) {
																					if (Update_Checker.isNewVersionAvailable() && !hasShowUp) {
																						Minecraft.getMinecraft().thePlayer.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.RED  + "*******************************************************************"
																																																 + ""
																													+ "Es ist eine Neue Version von MoFood Verfügbar! Version " + mofood.VERSION + "Downloade sie dir Hier http://moinmoin.mofood.bplaced.net/index.html"));
			hasShowUp = true;
		}
	}
	
	
	
//Durst-Bar
	/*@SubscribeEvent
	public void onRenderGameOverlay(RenderGameOverlayEvent event) {
		if (!event.isCancelable() && event.type == ElementType.EXPERIENCE) {
			Minecraft mc = Minecraft.getMinecraft();

			if (!mc.thePlayer.capabilities.isCreativeMode) {
				int posX = event.resolution.getScaledWidth() / 2 + 10;
				int posY = event.resolution.getScaledHeight() - 48;

				mc.renderEngine.bindTexture(new ResourceLocation("moblocks:textures/gui/Durst.png"));

				mc.ingameGUI.drawTexturedModalRect(posX, posY, 0, 0, 81, 8);
				mc.ingameGUI.drawTexturedModalRect(posX + 1, posY + 1, 0, 9, 80, 6); //Width = die Breite also in dem fall on Links nach Rechts! (Füllstand) Voll = 80!
			}
		}

	}*/
}

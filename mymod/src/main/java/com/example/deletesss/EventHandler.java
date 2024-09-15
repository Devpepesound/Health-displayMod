package com.example.deletesss;

import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.util.text.TextFormatting;

@SideOnly(Side.CLIENT)
public class EventHandler {

    @SubscribeEvent
    public void onRenderGameOverlay(RenderGameOverlayEvent.Post event) {
        if (event.getType() == RenderGameOverlayEvent.ElementType.TEXT) {
            Minecraft mc = Minecraft.getMinecraft();
            FontRenderer fontRenderer = mc.fontRenderer;
            float hp = mc.player.getHealth();
            String healthText = TextFormatting.GREEN + "Health: " + hp;


            fontRenderer.drawStringWithShadow(healthText, 10, 10, 0xFFFFFF);
        }
    }
}

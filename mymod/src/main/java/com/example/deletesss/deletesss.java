package com.example.deletesss;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = deletesss.MODID, name = deletesss.NAME, version = deletesss.VERSION)
public class deletesss {
    public static final String MODID = "deletesss";
    public static final String NAME = "Health Display Mod";
    public static final String VERSION = "1.0";

    @Mod.Instance
    public static deletesss instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        MinecraftForge.EVENT_BUS.register(new EventHandler());
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }
}

package com.github.reef_bit.laboratory.common;

import com.github.reef_bit.laboratory.common.proxy.Proxy;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@SuppressWarnings("unused")
@Mod(modid = Laboratory.MODID, name = Laboratory.NAME, version = Laboratory.VERSION)
public class Laboratory {
    public static final String MODID = "laboratory";
    public static final String NAME = "Laboratory";
    public static final String VERSION = "1.0";

    @Mod.Instance(Laboratory.MODID)
    public static Laboratory INSTANCE;

    @SidedProxy(clientSide = "com.github.reef_bit.laboratory.common.proxy.ClientProxy", serverSide = "com.github.reef_bit.laboratory.common.proxy.ServerProxy")
    public static Proxy PROXY;

    @Mod.EventHandler
    public void preInitialise(FMLPreInitializationEvent event) {
    }

    @Mod.EventHandler
    public void initialise(FMLInitializationEvent event) {
    }

    public static ResourceLocation createLocation(String path) {
        return new ResourceLocation(MODID, path);
    }
}

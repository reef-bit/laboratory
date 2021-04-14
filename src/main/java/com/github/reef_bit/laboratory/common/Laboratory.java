package com.github.reef_bit.laboratory.common;

import com.github.reef_bit.laboratory.common.proxy.Proxy;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

@SuppressWarnings("unused")

@Mod(modid = Laboratory.MODID, name = Laboratory.NAME, version = Laboratory.VERSION)
public class Laboratory {
    public static final String MODID = "laboratory";
    public static final String NAME = "Laboratory";
    public static final String VERSION = "1.0";

    @SidedProxy(clientSide = "com.github.reef_bit.laboratory.common.proxy.ClientProxy", serverSide = "com.github.reef_bit.laboratory.common.proxy.ServerProxy")
    public static Proxy PROXY;

    @Mod.EventHandler
    public void preInitialise(FMLPreInitializationEvent event) {
    }

    @Mod.EventHandler
    public void initialise(FMLInitializationEvent event) {
    }

    @Mod.EventBusSubscriber(modid = Laboratory.MODID)
    public static class RegistryHandler {

        @SubscribeEvent
        public static void registerBlocks(RegistryEvent.Register<Block> event) {
            IForgeRegistry<Block> registry = event.getRegistry();
        }

        @SubscribeEvent
        public static void registerItems(RegistryEvent.Register<Item> event) {
            IForgeRegistry<Item> registry = event.getRegistry();
        }
    }
}

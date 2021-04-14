package com.github.reef_bit.laboratory.common.proxy;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.SideOnly;

import static net.minecraftforge.fml.relauncher.Side.SERVER;

@SideOnly(SERVER)
public class ServerProxy implements Proxy {

    @Override
    public void preInitialise(FMLPreInitializationEvent event) {
    }

    @Override
    public <T extends Item> void registerItemModel(T item, int meta) {
        throw new UnsupportedOperationException();
    }
}

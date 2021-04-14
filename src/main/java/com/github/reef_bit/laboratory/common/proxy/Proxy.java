package com.github.reef_bit.laboratory.common.proxy;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public interface Proxy {

    void preInitialise(FMLPreInitializationEvent event);

    <T extends Item> void registerItemModel(T item, int meta);
}

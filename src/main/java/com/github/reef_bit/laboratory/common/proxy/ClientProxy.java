package com.github.reef_bit.laboratory.common.proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.SideOnly;

import static java.util.Objects.requireNonNull;
import static net.minecraftforge.fml.relauncher.Side.CLIENT;

@SideOnly(CLIENT)
public class ClientProxy implements Proxy {

    @Override
    public void preInitialise(FMLPreInitializationEvent event) {
    }

    @Override
    public <T extends Item> void registerItemModel(T item, int meta) {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(requireNonNull(item.getRegistryName()), "inventory"));
    }
}

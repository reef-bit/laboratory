package com.github.reef_bit.laboratory.common;

import com.github.reef_bit.laboratory.common.block.BlockImpenetrableGlass;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import static com.github.reef_bit.laboratory.common.block.LaboratoryBlocks.IMPENETRABLE_GLASS;

@SuppressWarnings("unused")
@Mod.EventBusSubscriber(modid = Laboratory.MODID)
public class RegistryHandler {

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                registerBlock("impenetrable_glass", new BlockImpenetrableGlass(Material.GLASS, MapColor.BLACK))
        );
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
                registerItem("impenetrable_glass", new ItemBlock(IMPENETRABLE_GLASS))
        );
    }

    private static Block registerBlock(String name, Block block) {
        return block.setRegistryName(Laboratory.createLocation(name)).setUnlocalizedName(name);
    }

    private static Item registerItem(String name, Item item) {
        return item.setRegistryName(Laboratory.createLocation(name)).setUnlocalizedName(name);
    }
}

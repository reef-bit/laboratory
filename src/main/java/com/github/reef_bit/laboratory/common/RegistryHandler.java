package com.github.reef_bit.laboratory.common;

import com.github.reef_bit.laboratory.common.block.LaboratoryBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@SuppressWarnings("unused")
@Mod.EventBusSubscriber(modid = Laboratory.MODID)
public class RegistryHandler {

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                registerBlock("caution_block", new Block(Material.CLOTH, MapColor.YELLOW))
        );
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
                registerItem("caution_block", new ItemBlock(LaboratoryBlocks.CAUTION_BLOCK))
        );
    }

    private static Block registerBlock(String name, Block block) {
        return block.setRegistryName(Laboratory.createLocation(name)).setUnlocalizedName(name);
    }

    private static Item registerItem(String name, Item item) {
        return item.setRegistryName(Laboratory.createLocation(name)).setUnlocalizedName(name);
    }
}

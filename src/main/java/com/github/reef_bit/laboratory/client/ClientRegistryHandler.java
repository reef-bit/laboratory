package com.github.reef_bit.laboratory.client;

import com.github.reef_bit.laboratory.common.Laboratory;
import com.github.reef_bit.laboratory.common.proxy.Proxy;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import static com.github.reef_bit.laboratory.common.item.LaboratoryItems.IMPENETRABLE_GLASS;
import static java.util.Objects.requireNonNull;
import static net.minecraftforge.fml.relauncher.Side.CLIENT;

@Mod.EventBusSubscriber(modid = Laboratory.MODID, value = CLIENT)
public class ClientRegistryHandler {

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        Proxy proxy = requireNonNull(Laboratory.PROXY);
        proxy.registerItemModel(IMPENETRABLE_GLASS, 0);
    }
}

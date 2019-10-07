package com.teamavion.teredux;

import com.teamavion.teredux.ref.GlobalRef;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(GlobalRef.MOD_ID)
public class TERedux {

    private final Logger LOGGER = LogManager.getLogger();

    public TERedux() {
        //Common preInit
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::init);

        //Register the mod
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void init(final FMLCommonSetupEvent event) {

    }

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
    }
}
package com.teamavion.teredux;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("teredux")
public class TERedux
{

    public TERedux() {
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        // Register the clientPreInit method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientPreInit);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        //preinit code
    }

    private void clientPreInit(final FMLClientSetupEvent event) {
        // client only PreInit
    }

    
}

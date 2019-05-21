package stygian.quicksilver;

import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import stygian.quicksilver.init.ModTab;

@Mod("quicksilver")
public class Quicksilver {
	
	public static ItemGroup tab = new ModTab("quicksilver");
	
    public Quicksilver() {
    	FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
    	FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
    	FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
    	FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);
    	
    	MinecraftForge.EVENT_BUS.register(this);
    }
    
    public void setup(final FMLCommonSetupEvent e) {
    	
    }
    
    public void clientSetup(final FMLClientSetupEvent e) {
    	
    }
    
    public void enqueueIMC(final InterModEnqueueEvent e) {
    	
    }
    
    public void processIMC(final InterModProcessEvent e) {
    	
    }
    
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent e) {
    	
    }
}
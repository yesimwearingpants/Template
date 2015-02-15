package com.yiwp;

import com.yiwp.config.ConfigurationHandler;
import com.yiwp.init.BlockInit;
import com.yiwp.init.ItemInit;
import com.yiwp.proxy.IProxy;
import com.yiwp.reference.Reference;
import com.yiwp.utils.LogHelper;

import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION, guiFactory = Reference.GUIFACTORY)
public class Template
{
	
	@Mod.Instance(Reference.INSTANCE)
    public static Template instance;

    @SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.SERVER)
	public static IProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event)	{
		
		ConfigurationHandler.init(event.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
		BlockInit.init();
		//ItemInit.init();
		
		LogHelper.info("Pre Initialization Complete");
		
	}
	
    @EventHandler
    public void init(FMLInitializationEvent event)    {
    	
    	LogHelper.info("Initialization Complete");
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)	{
    	
    	LogHelper.info("Post Initialization Complete");
    }
}

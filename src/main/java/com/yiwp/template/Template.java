package com.yiwp.template;

import com.yiwp.template.config.ConfigurationHandler;
import com.yiwp.template.init.BlockInit;
import com.yiwp.template.init.ItemInit;
import com.yiwp.template.proxy.IProxy;
import com.yiwp.template.reference.Reference;
import com.yiwp.template.utils.LogHelper;

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

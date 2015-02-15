package com.yiwp.init;

import com.yiwp.item.GenericItem;
import com.yiwp.item.ItemTemp;
import com.yiwp.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MODID)
public class ItemInit {
	
	public static final ItemTemp item = new ItemTemp();
	
	public static void init()	{
		
		GameRegistry.registerItem(item, "name");
	}

}

package com.yiwp.template.init;

import com.yiwp.template.item.ExtItem;
import com.yiwp.template.item.GenericMetaItem;
import com.yiwp.template.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MODID)
public class ItemInit {

	public static final ExtItem itemGeneric = new ExtItem();
	public static final ExtItem itemMeta = new GenericMetaItem();
	
	public static void init()	{

		GameRegistry.registerItem(itemGeneric, "name");
		GameRegistry.registerItem(itemMeta, "nameMeta");
	}

}

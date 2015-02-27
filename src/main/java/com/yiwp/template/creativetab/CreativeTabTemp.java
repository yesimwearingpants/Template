package com.yiwp.template.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.yiwp.template.init.ItemInit;
import com.yiwp.template.reference.Reference;

public class CreativeTabTemp extends CreativeTabs {

	public CreativeTabTemp(String label) {
		super(label);
		
	}
	
	public static final CreativeTabs INSTANCE = new CreativeTabs(Reference.MODID)	{
		
		@Override
		public Item getTabIconItem() {
			return ItemInit.itemGeneric;
		}
		
		@Override
		public String getTranslatedTabLabel() {
			return "Tab Name";
		}
	};

	@Override
	public Item getTabIconItem() {
		
		return null;
	}
}

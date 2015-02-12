package com.yiwp.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.yiwp.init.ItemInit;
import com.yiwp.reference.Reference;

public class CreativeTabTemp extends CreativeTabs {

	public CreativeTabTemp(String label) {
		super(label);
		
	}

	public static final CreativeTabs Temp_TAB = new CreativeTabs(Reference.MODID)	{
		
		@Override
		public Item getTabIconItem() {
			return ItemInit.item;
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

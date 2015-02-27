package com.yiwp.template.block.itemblock;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;

import com.yiwp.template.reference.Reference;

public class ExtItemBlock extends ItemBlock {

	private static String pre = "tile";

	public ExtItemBlock(Block b, String prefix, String[] tex) {
		super(b);
		this.setHasSubtypes(true);
		pre = prefix;
	}
	
	public ExtItemBlock(Block b) {
		super(b);
		this.setHasSubtypes(true);
	}
	
	@Override
	public String getUnlocalizedName() {
		return String.format(pre + ".%s", Reference.MODID + ":");
	}
	
	@Override
	public int getMetadata(int meta) {
		return meta;
	}

}

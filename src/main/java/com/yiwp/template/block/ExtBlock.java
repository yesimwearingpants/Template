package com.yiwp.template.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.yiwp.template.creativetab.CreativeTabTemp;
import com.yiwp.template.reference.Reference;

public abstract class ExtBlock extends Block {
	
	//Metadata
	public ExtBlock(Material material) {
		super(material);
		this.setBlockName(Reference.MODID + ":");
		this.setCreativeTab(CreativeTabTemp.INSTANCE);
	}

	//Non-Metadata
	public ExtBlock(Material material, String tex) {
		super(material);
		this.setCreativeTab(CreativeTabTemp.INSTANCE);
		this.setBlockName(Reference.MODID + ":" + tex);
		this.setBlockTextureName("block" + tex);
	}

}

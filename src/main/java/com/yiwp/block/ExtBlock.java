package com.yiwp.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ExtBlock extends Block {

	protected ExtBlock(Material material, float hardness, float resistance, String name) {
		super(material);
		this.setBlockName(name);
		this.setHardness(hardness);
		this.setResistance(resistance);
	}
	
	

}

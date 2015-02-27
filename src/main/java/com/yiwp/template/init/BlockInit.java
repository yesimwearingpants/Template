package com.yiwp.template.init;

import net.minecraft.block.material.Material;

import com.yiwp.template.block.*;
import com.yiwp.template.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MODID)
public class BlockInit {
	
	public static ExtBlock block = new BlockTemplate(Material.anvil, 3.4f, 3.4f, "name");
	public static ExtBlock blockmeta = new MetaBlock();
	
	
	public static void init() {
		
		//Initialize Blocks Here
		GameRegistry.registerBlock(block, "blockname");
		GameRegistry.registerBlock(blockmeta, "blockmetaname");
		
	}

}

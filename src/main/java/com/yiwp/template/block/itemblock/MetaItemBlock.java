package com.yiwp.template.block.itemblock;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;

import com.yiwp.template.reference.Reference;

public class MetaItemBlock extends ExtItemBlock {

	private static final String[] metaTypes = new String[] { "temp1", "temp2"};
	private static String pre = "tile";

	public MetaItemBlock(Block b) {
		super(b);
	}	
	
	@Override
	public String getUnlocalizedName() {
		return String.format(pre + ".%s", Reference.MODID + ":");
	}
	
	@Override
	public String getUnlocalizedName(ItemStack itemstack) {
		int i = itemstack.getItemDamage();
		if (i < 0 || i >= metaTypes.length) {
			i = 0;
		}
		return super.getUnlocalizedName() + metaTypes[i];
	}
	
	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4) {
		list.add(StatCollector.translateToLocal("metablock.tooltip"));
	}

}

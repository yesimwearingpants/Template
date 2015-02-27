package com.yiwp.template.block;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import com.yiwp.template.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class MetaBlock extends ExtBlock {

	static final String[] metaTypes = new String[] {"temp1", "temp2"};
    private IIcon[] icons = new IIcon[metaTypes.length];	
	private static final float[] hardness = new float[] { 16.0f, 11.0f};
	private static int[] light = new int[] { 0, 0};
	private static final float[] resistance = new float[] { 50.0f, 35.0f};
	
	public MetaBlock() {
		super(Material.rock);
		this.setStepSound(Block.soundTypeStone);
		this.setHardness(16.0f);
		this.setResistance(35.0f);
		
		setHarvestLevel("pickaxe", 3, 0);
		setHarvestLevel("pickaxe", 3, 1);
	}
	
	@Override
	public int getLightValue(IBlockAccess world, int x, int y, int z) {

		return light[world.getBlockMetadata(x, y, z)];
	}
	
	@Override
	public float getBlockHardness(World world, int x, int y, int z) {

		return hardness[world.getBlockMetadata(x, y, z)];
	}

	@Override
	public float getExplosionResistance(Entity entity, World world, int x, int y, int z, double explosionX, double explosionY, double explosionZ) {

		return resistance[world.getBlockMetadata(x, y, z)];
	}
		
	@Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons (IIconRegister iconRegister) {
        for (int i = 0; i < metaTypes.length; ++i) {
            icons[i] = iconRegister.registerIcon(Reference.MODID.toLowerCase() + ":" + "block" + metaTypes[i]);
        }
    }
    
	@Override
	    public void getSubBlocks (Item block, CreativeTabs tab, List list) {
	    for (int i = 0; i < metaTypes.length; i++) {
	    	list.add(new ItemStack(block, 1, i));
	    }
	}
	    
    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon (int side, int meta) {
        return icons[meta];
    }
		
	public boolean isBeaconBase (IBlockAccess worldObj, int x, int y, int z, int beaconX, int beaconY, int beaconZ)	{
        return true;
        
    }
	
	@Override
    public int damageDropped (int meta) {
        return meta;
    }
	
}

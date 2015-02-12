package com.yiwp.item;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.yiwp.creativetab.CreativeTabTemp;
import com.yiwp.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
public class ItemTemp extends Item
{
public ItemTemp()
{
super();
this.setCreativeTab(CreativeTabTemp.Temp_TAB);
}
@Override
public String getUnlocalizedName()
{
return String.format("item.%s%s", Reference.MODID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
}
@Override
public String getUnlocalizedName(ItemStack itemStack)
{
return String.format("item.%s%s", Reference.MODID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
}
@Override
@SideOnly(Side.CLIENT)
public void registerIcons(IIconRegister iconRegister)
{
itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
}
protected String getUnwrappedUnlocalizedName(String unlocalizedName)
{
return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
}
}
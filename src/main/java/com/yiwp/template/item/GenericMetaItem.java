package com.yiwp.template.item;

import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;

import com.yiwp.template.creativetab.CreativeTabTemp;
import com.yiwp.template.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class GenericMetaItem  extends ExtItem
{
    public static final String[] textureNames = new String[] {"temp1", "temp2"};
    @SideOnly(Side.CLIENT)
    private IIcon[] icons;

    public GenericMetaItem() {
        this.setHasSubtypes(true);
        this.setMaxDamage(0);
    }
    
    @SideOnly(Side.CLIENT)
    public IIcon getIconFromDamage(int meta) {
        int j = MathHelper.clamp_int(meta, 0, textureNames.length);
        return this.icons[j];
    }

    @SideOnly(Side.CLIENT)
    public void getSubItems(Item item, CreativeTabs tab, List list) {
        for (int i = 0; i < textureNames.length; ++i)
        {
            list.add(new ItemStack(item, 1, i));
        }
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister icon) {
        this.icons = new IIcon[textureNames.length];

        for (int i = 0; i < textureNames.length; ++i)
        {
            this.icons[i] = icon.registerIcon(Reference.MODID.toLowerCase() + ":" + "item" + textureNames[i]);
        }
    }
}
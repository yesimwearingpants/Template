package com.yiwp.template.reference;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

import com.yiwp.template.config.ConfigurationHandler;
import com.yiwp.template.reference.Reference;

import cpw.mods.fml.client.config.GuiConfig;

public class GuiConfiguration extends GuiConfig {

	public GuiConfiguration(GuiScreen parentScreen) {
		super(parentScreen, new ConfigElement(ConfigurationHandler.config.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
				Reference.MODID, false, false, GuiConfiguration.getAbridgedConfigPath(ConfigurationHandler.config.toString()));
	}

}

package com.mrgreaper.twisted.config;

import java.io.File;

import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.Property;

import com.mrgreaper.twisted.blocks.BlockInfo;
import com.mrgreaper.twisted.items.ItemInfo;

public class ConfigHandler {

	public static void init(File file){
		Configuration config = new Configuration(file);
		
		config.load();

        //blocks		
		
		BlockInfo.POISON_ID = config.getBlock(BlockInfo.POISON_KEY, BlockInfo.POISON_DEFAULT).getInt();
		BlockInfo.REBUNNYATOR_ID = config.getBlock(BlockInfo.REBUNNYATOR_KEY, BlockInfo.REBUNNYATOR_DEFAULT).getInt();
		BlockInfo.STATICGEN_ID = config.getBlock(BlockInfo.STATICGEN_KEY, BlockInfo.STATICGEN_DEFAULT).getInt();
		
		
		//items

		ItemInfo.BUNNYD_ID= config.getItem(ItemInfo.BUNNYD_KEY,ItemInfo.BUNNYD_DEFAULT).getInt() - 256;
		ItemInfo.BUNNYA_ID= config.getItem(ItemInfo.BUNNYA_KEY,ItemInfo.BUNNYA_DEFAULT).getInt() - 256;
		ItemInfo.ORPHANTEAR_ID= config.getItem(ItemInfo.ORPHANTEAR_KEY,ItemInfo.ORPHANTEAR_DEFAULT).getInt() - 256;
		ItemInfo.DEATHORB_ID= config.getItem(ItemInfo.DEATHORB_KEY,ItemInfo.DEATHORB_DEFAULT).getInt() - 256;
		ItemInfo.BUNNYE_ID= config.getItem(ItemInfo.BUNNYE_KEY,ItemInfo.BUNNYE_DEFAULT).getInt() - 256;
		ItemInfo.BALLOONR_ID= config.getItem(ItemInfo.BALLOONR_KEY,ItemInfo.BALLOONR_DEFAULT).getInt() - 256;
		ItemInfo.ORPHANLEG_ID= config.getItem(ItemInfo.ORPHANLEG_KEY, ItemInfo.ORPHANTEAR_DEFAULT).getInt() - 256;

		
		//settings
		//Configuration.getCategory(CATEGORY_GENERAL);
	    //Property BUNNYSTATICCHANCE = config.get(Configuration.CATEGORY_GENERAL, "bunny static chance (in%)", 30);
	    configInfo.BUNNYSTATICCHANCE= config.get(Configuration.CATEGORY_GENERAL, configInfo.BUNNYSTATICCHANCE_KEY, configInfo.BUNNYSTATICCHANCE_DEFAULT).getInt();
	    configInfo.DEBUG = config.get(Configuration.CATEGORY_GENERAL, configInfo.DEBUG_KEY, false).getBoolean(false);
	    configInfo.LSMELT = config.get(Configuration.CATEGORY_GENERAL, configInfo.LSMELT_KEY, true).getBoolean(true);
	    
		config.save();
	}

}

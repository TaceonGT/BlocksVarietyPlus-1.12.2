package com.ridebuilder5.blocksvarietyplus.tabs;

import com.ridebuilder5.blocksvarietyplus.init.ModBlocks;
import com.ridebuilder5.blocksvarietyplus.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class BlocksVarietyPlusBlocksTab extends CreativeTabs {

	public BlocksVarietyPlusBlocksTab(String label) {
		super("blocksvarietyplusblockstab");
		this.setBackgroundImageName("blocksvarietyplusblocks.png");
	}
	
	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModBlocks.ELM_LOG);
	}
}

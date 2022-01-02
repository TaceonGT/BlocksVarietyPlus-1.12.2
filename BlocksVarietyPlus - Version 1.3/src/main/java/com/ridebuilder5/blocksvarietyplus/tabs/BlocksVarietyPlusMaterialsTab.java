package com.ridebuilder5.blocksvarietyplus.tabs;

import com.ridebuilder5.blocksvarietyplus.init.ModBlocks;
import com.ridebuilder5.blocksvarietyplus.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class BlocksVarietyPlusMaterialsTab extends CreativeTabs {

	public BlocksVarietyPlusMaterialsTab(String label) {
		super("blocksvarietyplusmaterialstab");
		this.setBackgroundImageName("blocksvarietyplusmaterials.png");
	}
	
	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.ELM_STICK);
	}
}

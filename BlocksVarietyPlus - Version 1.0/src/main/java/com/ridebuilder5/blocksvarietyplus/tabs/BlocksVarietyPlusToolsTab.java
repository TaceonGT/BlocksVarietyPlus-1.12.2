package com.ridebuilder5.blocksvarietyplus.tabs;

import com.ridebuilder5.blocksvarietyplus.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class BlocksVarietyPlusToolsTab extends CreativeTabs {

	public BlocksVarietyPlusToolsTab(String label) {
		super("blocksvarietyplustoolstab");
		this.setBackgroundImageName("blocksvarietyplustools.png");
	}
	
	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.FLINT_HATCHET);
	}
}

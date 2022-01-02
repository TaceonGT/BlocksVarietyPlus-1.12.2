package com.ridebuilder5.blocksvarietyplus.tabs;

import com.ridebuilder5.blocksvarietyplus.init.ModBlocks;
import com.ridebuilder5.blocksvarietyplus.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class BlocksVarietyPlusCombatTab extends CreativeTabs {

	public BlocksVarietyPlusCombatTab(String label) {
		super("blocksvarietypluscombattab");
		this.setBackgroundImageName("blocksvarietypluscombat.png");
	}
	
	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.ELM_SWORD);
	}
}

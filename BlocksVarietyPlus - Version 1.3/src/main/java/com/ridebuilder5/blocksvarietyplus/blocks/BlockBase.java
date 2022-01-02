package com.ridebuilder5.blocksvarietyplus.blocks;

import com.ridebuilder5.blocksvarietyplus.Main;
import com.ridebuilder5.blocksvarietyplus.init.ModBlocks;
import com.ridebuilder5.blocksvarietyplus.init.ModItems;
import com.ridebuilder5.blocksvarietyplus.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel {

	public BlockBase(String name, Material material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.BLOCKSVARIETYPLUSBLOCKSTAB);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels() {
		
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
		
	}
}

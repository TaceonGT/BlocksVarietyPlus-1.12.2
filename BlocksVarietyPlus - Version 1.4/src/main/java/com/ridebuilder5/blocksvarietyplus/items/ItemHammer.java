package com.ridebuilder5.blocksvarietyplus.items;

import java.util.Set;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.ridebuilder5.blocksvarietyplus.init.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

public class ItemHammer extends ItemTool {

	private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(ModBlocks.ALUMINUM_BLOCK, ModBlocks.COPPER_BLOCK, ModBlocks.ELECTRUM_BLOCK, ModBlocks.LEAD_BLOCK, ModBlocks.OSMIUM_BLOCK, ModBlocks.TIN_BLOCK, ModBlocks.URANIUM_BLOCK, ModBlocks.ZINC_BLOCK, Blocks.IRON_BLOCK, Blocks.GOLD_BLOCK);
	
	protected ItemHammer(Item.ToolMaterial material) {
		super(1.0F, -2.8F, material, EFFECTIVE_ON);
	}
	
	public boolean canHarvestBlock(IBlockState blockIn) {
		Block block = blockIn.getBlock();
		if (block == ModBlocks.ALUMINUM_BLOCK || block == ModBlocks.COPPER_BLOCK || block == ModBlocks.ELECTRUM_BLOCK || block == ModBlocks.LEAD_BLOCK || block == ModBlocks.OSMIUM_BLOCK || block == ModBlocks.TIN_BLOCK || block == ModBlocks.URANIUM_BLOCK || block == ModBlocks.ZINC_BLOCK || block == Blocks.IRON_BLOCK || block == Blocks.GOLD_BLOCK) {
			return this.toolMaterial.getHarvestLevel() == 1;
		} else {
			return false;
		}
	}
	
	public float getDestroySpeed(ItemStack stack, IBlockState state) {
		Material material = state.getMaterial();
		return material != Material.IRON ? super.getDestroySpeed(stack, state) : this.efficiency;
	}
	
}

package com.ridebuilder5.blocksvarietyplus.items;

import java.util.Set;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.ridebuilder5.blocksvarietyplus.init.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

public class ItemHatchet extends ItemTool {

	private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(Blocks.LOG, Blocks.LOG2, Blocks.PLANKS, ModBlocks.CHERRY_LOG, ModBlocks.CHERRY_PLANKS, ModBlocks.ELM_LOG, ModBlocks.ELM_PLANKS);

    protected ItemHatchet(Item.ToolMaterial material) {
        super(1.0F, -2.8F, material, EFFECTIVE_ON);
    }
    
    /**
     * Check whether this Item can harvest the given Block
     */
    public boolean canHarvestBlock(IBlockState blockIn)
    {
        Block block = blockIn.getBlock();
        
        if (block == Blocks.LOG || block == Blocks.LOG2 || block == Blocks.PLANKS || block == ModBlocks.CHERRY_LOG || block == ModBlocks.CHERRY_PLANKS || block == ModBlocks.ELM_LOG || block == ModBlocks.ELM_PLANKS) {
        	return this.toolMaterial.getHarvestLevel() == 0;
        } else {
        	return false;
        }
    }
    public float getDestroySpeed(ItemStack stack, IBlockState state)
    {
        Material material = state.getMaterial();
        return material != Material.WOOD ? super.getDestroySpeed(stack, state) : this.efficiency;
    }
}

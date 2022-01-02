package com.ridebuilder5.blocksvarietyplus.blocks.cherry;

import com.ridebuilder5.blocksvarietyplus.blocks.BlockBase;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class CherryPlanks extends BlockBase {

	public CherryPlanks(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.WOOD);
		setHardness(2.2F);
		setResistance(10.5F);
		setHarvestLevel("hatchet", 0);
	}
	
	/*@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return ModItems.FUTURE_INGOT;
	}
	
	@Override
	public int quantityDropped(Random rand) {
		int max = 1;
		int min = 1;
		return rand.nextInt(max) + min;
	}*/
}

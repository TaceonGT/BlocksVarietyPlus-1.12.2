package com.ridebuilder5.blocksvarietyplus.blocks.marble;

import com.ridebuilder5.blocksvarietyplus.blocks.BlockBase;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class PolishedMarble extends BlockBase {

	public PolishedMarble(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(1.8F);
		setResistance(30.5F);
		setHarvestLevel("pickaxe", 0);
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

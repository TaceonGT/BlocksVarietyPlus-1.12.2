package com.ridebuilder5.blocksvarietyplus.blocks.uranium;

import com.ridebuilder5.blocksvarietyplus.blocks.BlockBase;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class UraniumBlock extends BlockBase {

	public UraniumBlock(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.STONE);
        setHardness(7.0f);
        setResistance(12.0f);
        setHarvestLevel("hammer", 1);
        setLightLevel(0.5f);
        //setLightOpacity(1);
        //setBlockUnbreakable();

	}
}

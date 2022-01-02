package com.ridebuilder5.blocksvarietyplus.blocks.zinc;

import com.ridebuilder5.blocksvarietyplus.blocks.BlockBase;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ZincBlock extends BlockBase {

	public ZincBlock(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.METAL);
        setHardness(4.5f);
        setResistance(17.0f);
        setHarvestLevel("hammer", 1);
        setLightLevel(0.1f);
        //setLightOpacity(1);
        //setBlockUnbreakable();

	}
}

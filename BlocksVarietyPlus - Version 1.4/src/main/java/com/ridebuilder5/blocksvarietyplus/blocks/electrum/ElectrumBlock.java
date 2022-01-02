package com.ridebuilder5.blocksvarietyplus.blocks.electrum;

import com.ridebuilder5.blocksvarietyplus.blocks.BlockBase;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ElectrumBlock extends BlockBase {

	public ElectrumBlock(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.METAL);
        setHardness(4.0f);
        setResistance(16.0f);
        setHarvestLevel("hammer", 1);
        setLightLevel(0.1f);
        //setLightOpacity(1);
        //setBlockUnbreakable();

	}
}

package com.ridebuilder5.blocksvarietyplus.blocks.lead;

import com.ridebuilder5.blocksvarietyplus.blocks.BlockBase;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class LeadBlock extends BlockBase {

	public LeadBlock(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.METAL);
        setHardness(7.5f);
        setResistance(19.0f);
        setHarvestLevel("hammer", 1);
        setLightLevel(0.1f);
        //setLightOpacity(1);
        //setBlockUnbreakable();

	}
}

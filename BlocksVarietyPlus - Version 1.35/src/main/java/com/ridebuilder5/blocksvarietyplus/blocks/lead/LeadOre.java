package com.ridebuilder5.blocksvarietyplus.blocks.lead;

import com.ridebuilder5.blocksvarietyplus.blocks.BlockBase;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class LeadOre extends BlockBase {

	public LeadOre(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.STONE);
        setHardness(6.5f);
        setResistance(18.0f);
        setHarvestLevel("pickaxe", 2);
        setLightLevel(0.1f);
        //setLightOpacity(1);
        //setBlockUnbreakable();

	}
}

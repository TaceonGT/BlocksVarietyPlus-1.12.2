package com.ridebuilder5.blocksvarietyplus.blocks.copper;

import com.ridebuilder5.blocksvarietyplus.blocks.BlockBase;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class CopperOre extends BlockBase {

	public CopperOre(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.STONE);
        setHardness(6.0f);
        setResistance(17.5f);
        setHarvestLevel("pickaxe", 1);
        setLightLevel(0.1f);
        //setLightOpacity(1);
        //setBlockUnbreakable();

	}
}

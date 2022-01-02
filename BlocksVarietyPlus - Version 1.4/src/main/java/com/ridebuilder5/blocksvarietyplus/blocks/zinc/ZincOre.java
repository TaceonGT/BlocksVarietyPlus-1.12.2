package com.ridebuilder5.blocksvarietyplus.blocks.zinc;

import com.ridebuilder5.blocksvarietyplus.blocks.BlockBase;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ZincOre extends BlockBase {

	public ZincOre(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.STONE);
        setHardness(4.0f);
        setResistance(16.0f);
        setHarvestLevel("pickaxe", 1);
        setLightLevel(0.1f);
        //setLightOpacity(1);
        //setBlockUnbreakable();

	}
}

package com.ridebuilder5.blocksvarietyplus.blocks.electrum;

import com.ridebuilder5.blocksvarietyplus.blocks.BlockBase;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ElectrumOre extends BlockBase {

	public ElectrumOre(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.STONE);
        setHardness(3.5f);
        setResistance(15.0f);
        setHarvestLevel("pickaxe", 1);
        setLightLevel(0.1f);
        //setLightOpacity(1);
        //setBlockUnbreakable();

	}
}

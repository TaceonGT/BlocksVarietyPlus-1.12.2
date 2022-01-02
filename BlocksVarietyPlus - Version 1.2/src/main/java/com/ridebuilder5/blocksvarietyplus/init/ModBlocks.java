package com.ridebuilder5.blocksvarietyplus.init;

import java.util.ArrayList;
import java.util.List;

import com.ridebuilder5.blocksvarietyplus.blocks.cherry.CherryLog;
import com.ridebuilder5.blocksvarietyplus.blocks.cherry.CherryPlanks;
import com.ridebuilder5.blocksvarietyplus.blocks.elm.ElmLog;
import com.ridebuilder5.blocksvarietyplus.blocks.elm.ElmPlanks;
import com.ridebuilder5.blocksvarietyplus.blocks.marble.Marble;
import com.ridebuilder5.blocksvarietyplus.blocks.marble.PolishedMarble;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//Blocks
	public static final Block ELM_LOG = new ElmLog("elm_log", Material.WOOD);
	public static final Block ELM_PLANKS = new ElmPlanks("elm_planks", Material.WOOD);
	
	public static final Block CHERRY_LOG = new CherryLog("cherry_log", Material.WOOD);
	public static final Block CHERRY_PLANKS = new CherryPlanks("cherry_planks", Material.WOOD);
	
	public static final Block MARBLE = new Marble("marble", Material.ROCK);
	public static final Block POLISHED_MARBLE = new PolishedMarble("polished_marble", Material.ROCK);
}

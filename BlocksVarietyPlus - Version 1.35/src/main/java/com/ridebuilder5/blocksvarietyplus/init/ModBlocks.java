package com.ridebuilder5.blocksvarietyplus.init;

import java.util.ArrayList;
import java.util.List;

import com.ridebuilder5.blocksvarietyplus.blocks.aluminum.AluminumBlock;
import com.ridebuilder5.blocksvarietyplus.blocks.aluminum.AluminumOre;
import com.ridebuilder5.blocksvarietyplus.blocks.cherry.CherryLog;
import com.ridebuilder5.blocksvarietyplus.blocks.cherry.CherryPlanks;
import com.ridebuilder5.blocksvarietyplus.blocks.copper.CopperBlock;
import com.ridebuilder5.blocksvarietyplus.blocks.copper.CopperOre;
import com.ridebuilder5.blocksvarietyplus.blocks.electrum.ElectrumBlock;
import com.ridebuilder5.blocksvarietyplus.blocks.electrum.ElectrumOre;
import com.ridebuilder5.blocksvarietyplus.blocks.elm.ElmLog;
import com.ridebuilder5.blocksvarietyplus.blocks.elm.ElmPlanks;
import com.ridebuilder5.blocksvarietyplus.blocks.lead.LeadBlock;
import com.ridebuilder5.blocksvarietyplus.blocks.lead.LeadOre;
import com.ridebuilder5.blocksvarietyplus.blocks.marble.Marble;
import com.ridebuilder5.blocksvarietyplus.blocks.marble.PolishedMarble;
import com.ridebuilder5.blocksvarietyplus.blocks.osmium.OsmiumBlock;
import com.ridebuilder5.blocksvarietyplus.blocks.osmium.OsmiumOre;
import com.ridebuilder5.blocksvarietyplus.blocks.tin.TinBlock;
import com.ridebuilder5.blocksvarietyplus.blocks.tin.TinOre;
import com.ridebuilder5.blocksvarietyplus.blocks.uranium.UraniumBlock;
import com.ridebuilder5.blocksvarietyplus.blocks.uranium.UraniumOre;
import com.ridebuilder5.blocksvarietyplus.blocks.zinc.ZincBlock;
import com.ridebuilder5.blocksvarietyplus.blocks.zinc.ZincOre;

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
	
	public static final Block ALUMINUM_ORE = new AluminumOre("aluminum_ore", Material.ROCK);
	public static final Block ALUMINUM_BLOCK = new AluminumBlock("aluminum_block", Material.IRON);
	
	public static final Block COPPER_ORE = new CopperOre("copper_ore", Material.ROCK);
	public static final Block COPPER_BLOCK = new CopperBlock("copper_block", Material.IRON);
	
	public static final Block ELECTRUM_ORE = new ElectrumOre("electrum_ore", Material.ROCK);
	public static final Block ELECTRUM_BLOCK = new ElectrumBlock("electrum_block", Material.IRON);
	
	public static final Block LEAD_ORE = new LeadOre("lead_ore", Material.ROCK);
	public static final Block LEAD_BLOCK = new LeadBlock("lead_block", Material.IRON);
	
	public static final Block OSMIUM_ORE = new OsmiumOre("osmium_ore", Material.ROCK);
	public static final Block OSMIUM_BLOCK = new OsmiumBlock("osmium_block", Material.IRON);
	
	public static final Block TIN_ORE = new TinOre("tin_ore", Material.ROCK);
	public static final Block TIN_BLOCK = new TinBlock("tin_block", Material.IRON);
	
	public static final Block URANIUM_ORE = new UraniumOre("uranium_ore", Material.ROCK);
	public static final Block URANIUM_BLOCK = new UraniumBlock("uranium_block", Material.IRON);
	
	public static final Block ZINC_ORE = new ZincOre("zinc_ore", Material.ROCK);
	public static final Block ZINC_BLOCK = new ZincBlock("zinc_block", Material.IRON);
}

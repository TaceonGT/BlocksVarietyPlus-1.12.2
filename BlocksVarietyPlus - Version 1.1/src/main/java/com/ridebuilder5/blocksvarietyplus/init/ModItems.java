package com.ridebuilder5.blocksvarietyplus.init;

import java.util.ArrayList;
import java.util.List;

import com.ridebuilder5.blocksvarietyplus.items.ItemBase;
import com.ridebuilder5.blocksvarietyplus.items.ItemHatchet;
import com.ridebuilder5.blocksvarietyplus.items.tools.ToolAxe;
import com.ridebuilder5.blocksvarietyplus.items.tools.ToolHatchet;
import com.ridebuilder5.blocksvarietyplus.items.tools.ToolHoe;
import com.ridebuilder5.blocksvarietyplus.items.tools.ToolPickaxe;
import com.ridebuilder5.blocksvarietyplus.items.tools.ToolSpade;
import com.ridebuilder5.blocksvarietyplus.items.tools.ToolSword;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {

public static final List<Item> ITEMS = new ArrayList<Item>();
	
	/* MATERIALS (harvestLevel, maxUses, efficiency, damage, enchantability
	 * WOOD(0, 59, 2.0F, 0.0F, 15),
        STONE(1, 131, 4.0F, 1.0F, 5),
        IRON(2, 250, 6.0F, 2.0F, 14),
        DIAMOND(3, 1561, 8.0F, 3.0F, 10),
        GOLD(0, 32, 12.0F, 0.0F, 22);
	 */
	//Materials (name, harvestLevel, maxUses, efficiency, damage, enchantability)
	public static final ToolMaterial MATERIAL_FLINT = EnumHelper.addToolMaterial("material_flint", 0, 30, 1.0F, 0.0F, 10);
	public static final ToolMaterial MATERIAL_ELM = EnumHelper.addToolMaterial("material_elm", 0, 90, 3.0F, 0.3F, 17);
	public static final ToolMaterial MATERIAL_CHERRY = EnumHelper.addToolMaterial("material_cherry", 0, 90, 3.0F, 0.6F, 17);
	public static final ToolMaterial MATERIAL_MARBLE = EnumHelper.addToolMaterial("material_marble", 1, 138, 4.3F, 1.8F, 13);
	
	//Items
	public static final Item ELM_STICK = new ItemBase("elm_stick");
	public static final Item CHERRY_STICK = new ItemBase("cherry_stick");
	
	//Tools
	public static final ItemHatchet FLINT_HATCHET = new ToolHatchet("flint_hatchet", MATERIAL_FLINT);
	
	public static final ItemSword ELM_SWORD = new ToolSword("elm_sword", MATERIAL_ELM);
	public static final ItemSpade ELM_SHOVEL = new ToolSpade("elm_shovel", MATERIAL_ELM);
	public static final ItemPickaxe ELM_PICKAXE = new ToolPickaxe("elm_pickaxe", MATERIAL_ELM);
	public static final ItemAxe ELM_AXE = new ToolAxe("elm_axe", MATERIAL_ELM);
	public static final ItemHoe ELM_HOE = new ToolHoe("elm_hoe", MATERIAL_ELM);
	
	public static final ItemSword CHERRY_SWORD = new ToolSword("cherry_sword", MATERIAL_CHERRY);
	public static final ItemSpade CHERRY_SHOVEL = new ToolSpade("cherry_shovel", MATERIAL_CHERRY);
	public static final ItemPickaxe CHERRY_PICKAXE = new ToolPickaxe("cherry_pickaxe", MATERIAL_CHERRY);
	public static final ItemAxe CHERRY_AXE = new ToolAxe("cherry_axe", MATERIAL_CHERRY);
	public static final ItemHoe CHERRY_HOE = new ToolHoe("cherry_hoe", MATERIAL_CHERRY);
	
	public static final ItemSword MARBLE_SWORD = new ToolSword("marble_sword", MATERIAL_MARBLE);
	public static final ItemSpade MARBLE_SHOVEL = new ToolSpade("marble_shovel", MATERIAL_MARBLE);
	public static final ItemPickaxe MARBLE_PICKAXE = new ToolPickaxe("marble_pickaxe", MATERIAL_MARBLE);
	public static final ItemAxe MARBLE_AXE = new ToolAxe("marble_axe", MATERIAL_MARBLE);
	public static final ItemHoe MARBLE_HOE = new ToolHoe("marble_hoe", MATERIAL_MARBLE);
}

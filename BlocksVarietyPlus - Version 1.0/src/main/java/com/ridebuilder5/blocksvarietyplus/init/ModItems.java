package com.ridebuilder5.blocksvarietyplus.init;

import java.util.ArrayList;
import java.util.List;

import com.ridebuilder5.blocksvarietyplus.items.ItemHatchet;
import com.ridebuilder5.blocksvarietyplus.items.tools.ToolHatchet;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
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
	
	//Tools
	public static final ItemHatchet FLINT_HATCHET = new ToolHatchet("flint_hatchet", MATERIAL_FLINT);
}

package com.ridebuilder5.blocksvarietyplus.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

	public static void init() {
		GameRegistry.addSmelting(ModBlocks.ELM_LOG, new ItemStack(Items.COAL, 1), 1.5f);
		GameRegistry.addSmelting(ModBlocks.CHERRY_LOG, new ItemStack(Items.COAL, 1), 1.5f);
	}
}

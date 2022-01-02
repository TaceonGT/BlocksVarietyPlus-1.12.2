package com.ridebuilder5.blocksvarietyplus.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

	public static void init() {
		GameRegistry.addSmelting(ModBlocks.ELM_LOG, new ItemStack(Items.COAL, 1), 1.5f);
		GameRegistry.addSmelting(ModBlocks.CHERRY_LOG, new ItemStack(Items.COAL, 1), 1.5f);
		
		GameRegistry.addSmelting(ModBlocks.ALUMINUM_ORE, new ItemStack(ModItems.ALUMINUM_INGOT), 2.0f);
		GameRegistry.addSmelting(ModBlocks.COPPER_ORE, new ItemStack(ModItems.COPPER_INGOT), 3.0f);
		GameRegistry.addSmelting(ModBlocks.ELECTRUM_ORE, new ItemStack(ModItems.ELECTRUM_INGOT), 2.0f);
		GameRegistry.addSmelting(ModBlocks.LEAD_ORE, new ItemStack(ModItems.LEAD_INGOT), 3.0f);
		GameRegistry.addSmelting(ModBlocks.OSMIUM_ORE, new ItemStack(ModItems.OSMIUM_INGOT), 2.0f);
		GameRegistry.addSmelting(ModBlocks.TIN_ORE, new ItemStack(ModItems.TIN_INGOT), 2.0f);
		GameRegistry.addSmelting(ModBlocks.URANIUM_ORE, new ItemStack(ModItems.URANIUM_INGOT), 4.0f);
		GameRegistry.addSmelting(ModBlocks.ZINC_ORE, new ItemStack(ModItems.ZINC_INGOT), 2.0f);
	}
}

package com.ridebuilder5.blocksvarietyplus;

import com.ridebuilder5.blocksvarietyplus.init.ModRecipes;
import com.ridebuilder5.blocksvarietyplus.proxy.CommonProxy;
import com.ridebuilder5.blocksvarietyplus.tabs.BlocksVarietyPlusBlocksTab;
import com.ridebuilder5.blocksvarietyplus.tabs.BlocksVarietyPlusCombatTab;
import com.ridebuilder5.blocksvarietyplus.tabs.BlocksVarietyPlusMaterialsTab;
import com.ridebuilder5.blocksvarietyplus.tabs.BlocksVarietyPlusToolsTab;
import com.ridebuilder5.blocksvarietyplus.util.Reference;
import com.ridebuilder5.blocksvarietyplus.world.ModWorldGen;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {

	@Instance
	public static Main Instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static final CreativeTabs BLOCKSVARIETYPLUSTOOLSTAB = new BlocksVarietyPlusToolsTab("blocksvarietyplustoolstab");
	public static final CreativeTabs BLOCKSVARIETYPLUSBLOCKSTAB = new BlocksVarietyPlusBlocksTab("blocksvarietyplusblockstab");
	public static final CreativeTabs BLOCKSVARIETYPLUSMATERIALSTAB = new BlocksVarietyPlusMaterialsTab("blocksvarietyplusmaterialstab");
	public static final CreativeTabs BLOCKSVARIETYPLUSCOMBATTAB = new BlocksVarietyPlusCombatTab("blocksvarietypluscombattab");
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event)
	{
		GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		ModRecipes.init();
	}
	
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event)
	{
		
	}
}

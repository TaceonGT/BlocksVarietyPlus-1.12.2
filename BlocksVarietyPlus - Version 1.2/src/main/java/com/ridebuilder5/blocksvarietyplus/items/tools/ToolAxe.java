package com.ridebuilder5.blocksvarietyplus.items.tools;

import com.ridebuilder5.blocksvarietyplus.Main;
import com.ridebuilder5.blocksvarietyplus.init.ModItems;
import com.ridebuilder5.blocksvarietyplus.util.IHasModel;

import net.minecraft.item.ItemAxe;

public class ToolAxe extends ItemAxe implements IHasModel {

	public ToolAxe(String name, ToolMaterial material) {
		super(material, 6.0F, -3.2F);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.BLOCKSVARIETYPLUSTOOLSTAB);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}

package com.ridebuilder5.blocksvarietyplus.items.tools;

import com.ridebuilder5.blocksvarietyplus.Main;
import com.ridebuilder5.blocksvarietyplus.init.ModItems;
import com.ridebuilder5.blocksvarietyplus.items.ItemHammer;
import com.ridebuilder5.blocksvarietyplus.util.IHasModel;

public class ToolHammer extends ItemHammer implements IHasModel {

	public ToolHammer(String name, ToolMaterial material) {
		super(material);
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
